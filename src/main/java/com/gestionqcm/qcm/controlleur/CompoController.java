package com.gestionqcm.qcm.controlleur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gestionqcm.qcm.HomeController;
import com.gestionqcm.qcm.entities.Choix;
import com.gestionqcm.qcm.entities.Etudiant;
import com.gestionqcm.qcm.entities.Evaluationnote;
import com.gestionqcm.qcm.entities.EvaluationnotePK;
import com.gestionqcm.qcm.entities.Evaluationprogrammer;
import com.gestionqcm.qcm.entities.Matiere;
import com.gestionqcm.qcm.entities.Questionouverte;
import com.gestionqcm.qcm.entities.Questions;
import com.gestionqcm.qcm.entities.Sujet;
import com.gestionqcm.qcm.metier.IqcmMetier;
import com.gestionqcm.qcm.model.MatiereForm;
import com.gestionqcm.qcm.model.ProfilEtudiant;
import com.gestionqcm.qcm.model.QuestionForm;
import com.gestionqcm.qcm.session.SessionBean;

@Controller
public class CompoController {
	@Autowired
	private IqcmMetier metier;

	@Autowired
	private HomeController controller;

	@Autowired
	private SessionBean sessionBean;
	
	
	EvaluationnotePK notPk=new EvaluationnotePK();
	
	Evaluationnote evalNote=new Evaluationnote();

	List<Questions> listeQuestion = new ArrayList<Questions>();
	Map<Questions, List<Choix>> listChoixQ = null;
	List<Evaluationprogrammer> matiList = null;
	List<Questionouverte> listQuestionOuverte = new ArrayList<Questionouverte>();
	Etudiant etudiant = null;
	String codeuv = null;
	List<Questions> listeTotalQ = new ArrayList<Questions>();
	List<Sujet> listeSujet = new ArrayList<Sujet>();
	Matiere mati = null;

	public List<Questions> getListeQuestion() {
		return listeQuestion;
	}

	public void setListeQuestion(List<Questions> listeQuestion) {
		this.listeQuestion = listeQuestion;
	}

	@RequestMapping(value = "/composerM", method = RequestMethod.POST)
	public String entrerCodeUv(HttpSession sessionH, QuestionForm questionForm,
			MatiereForm matiere, ProfilEtudiant proEtu, Model model) {

		codeuv = matiere.getCodeUv();
		System.out.println("Code uv ="+codeuv);
		sessionBean.setCodeMatiere(codeuv);

		//listeSujet = metier.consulterSujet(codeuv);

		if (codeuv != null) {

			// mati = matiList.get(0).getMatiere();
			

			String matricule = sessionBean.getMatricule();

			// codeuv=questionForm.getMatiere().getCodeuv();
			matiList = metier.consulterMatieresPro(codeuv);
			sessionBean.setIntituleMatiere(matiList.get(0).getMatiere().getIntitule());
			etudiant = metier.consulterEtudiant(matricule);
			//matiList = metier.consulterMatieresPro(codeuv);
						
			
			listeTotalQ = metier.consulterQuestionMatiere(codeuv);

			
			//sessionBean.setIntituleMatiere(matiList.get(0).getMatiere().getIntitule());

			// appel charger questions

			chargerQuestion(questionForm, questionForm.getPosition());
			
			int np = sessionBean.getListeQSession().size() / questionForm.getNombreQuestion();
			if(sessionBean.getListeQSession().size()==questionForm.getNombreQuestion())
			{sessionBean.setNombrePage(np);
			questionForm.setNombrePage(np);
			}
			else{
			sessionBean.setNombrePage(np+1);
			questionForm.setNombrePage(np+1);
			}

			if (!listeTotalQ.isEmpty()) {

				int k = 0;
				List<Questions> listPage = new ArrayList<Questions>();

				while (k < questionForm.getNombreQuestion())
				{

					listPage.add(sessionBean.getListeQSession().get(k));
					k++;
				}

				questionForm.setListeQuestionPage(listPage);
				sessionBean.setListeQPage(listPage);
				questionForm.setListeSujet(listeSujet);
				sessionBean.setListeQSession(listeQuestion);
				sessionBean.setQuestionNonRepondu(listeQuestion);
				sessionBean.setTempsR(matiList.get(0).getNombreheur() * 60);
				
				questionForm.setTempsR(sessionBean.getTempsR());
				
				proEtu.setEtudiant(etudiant);
				questionForm.setListQF(listeQuestion);
				questionForm.setEtudiant(etudiant);
				questionForm.setEtudiant(matiere.getEtudiant());
				questionForm.setListQ(listeQuestion);
				questionForm.setMatiere(mati);
				proEtu.setNombreH(matiList.get(0).getNombreheur());
				proEtu.setNombreQ(matiList.get(0).getNombrequestion());

				model.addAttribute("profilEtudiant", proEtu);

				model.addAttribute("listeChoixQuestion", listChoixQ);
				model.addAttribute("questionForm", questionForm);
				executer();
				return "espaceComposition";
			} else {
				return "uvCompo";
			}

		} else {
			return "uvCompo";
		}

	}

	@RequestMapping(value = "/composerMatiere")
	public String entrerUv(HttpSession sessionH, MatiereForm matiere,
			ProfilEtudiant proEtu, Model model) {
		matiere.setEtudiant(proEtu.getEtudiant());
		sessionBean = (SessionBean) sessionH
				.getAttribute("sessionBeanEtudiant");

		// model.addAttribute("profilEtudiant", proEtu);
		matiere = proEtu.getMatiereForm();
		model.addAttribute("matiereForm", matiere);

		return "uvCompo";
	}

	
	
	
	/*
	 * Methode d'enregistrement des resultats d'une epreuve
	 */
/*
	@RequestMapping(value = "/enregistrerCompo")
	public String enregistrerCompo(Model model, QuestionForm questionF) {

		System.out.println(" je suis la 0");
		// List<Questions> listQuestion = questionF.getListQF();
		List<Choix> listChoixQuestion = questionF.getQChoix1();
		System.out.println(" je suis la 1");
		// Integer numC = 0;
		// String Valeur = null;
		if (!listeQuestion.isEmpty()) {
			System.out.println(" je suis la 2");

			for (int i = 0; i < listeQuestion.size(); i++) {
				Questions questions = listeQuestion.get(i);
				List<Choix> lc = listChoixQ.get(questions);
				int k = Integer.parseInt(listChoixQuestion.get(i)
						.getLibelechoix().substring(0, 1));

				System.out.println("Valeur de k est " + k);
				if (k != 0) {
					Choix c = lc.get(k - 1);
					listChoixQuestion.add(i, c);
					System.out.println("numQuestion = "
							+ questions.getCodequestion()
							+ " LibeleQuestion = "
							+ questions.getLibelequestion() + "\n");
					System.out.println("numChoix = "
							+ listChoixQuestion.get(i).getNumchoix()
							+ " LibeleChoix = "
							+ listChoixQuestion.get(i).getLibelechoix()
							+ " Valeur Choix = "
							+ listChoixQuestion.get(i).getValeurchoix() + "\n");

				}
			}

		}
		QuestionForm c = new QuestionForm();
		c.setListQ(listeQuestion);
		model.addAttribute("questionForm", c);
		return "espaceComposition";
	}
*/
	
	
	
	
	
	// methode de chargement des des questions

	public void chargerQuestion(QuestionForm questionForm, int position) {
		try {

			listChoixQ = new HashMap<Questions, List<Choix>>();
			List<Choix> listeChoix = new ArrayList<Choix>();

			int i = listeTotalQ.size();
			for (int j = 0; j < i; j++) {
				Questions questions = listeTotalQ.get(j);
				listeChoix = metier.consulterChoixQuestion(questions
						.getCodequestion());

				for (int k = 0; k < listeChoix.size(); k++) {
					Choix c = listeChoix.get(k);
					c.setCodequestion(questions);
					List<String> lm = questions.getChoixMap();
					lm.add(c.getLibelechoix());
					questions.setChoixMap(lm);
					String val = c.getValeurchoix();
					Map<String, String> map = questions.getChoixValeur();
					map.put(c.getLibelechoix(), val);
					questions.setChoixValeur(map);
				}
				questions.setChoixList(listeChoix);
				listChoixQ.put(questions, listeChoix);

			}

			// randomisation debut
			int nbreQ = matiList.get(0).getNombrequestion();
			int nbreQT = listeTotalQ.size();
			//sessionBean.setNombrePoint(nbreQ);
			
			

			List<Integer> ch = new ArrayList<Integer>();
			List<Integer> listeRandomiser = new ArrayList<Integer>();
			for (int l = 0; l < nbreQT; l++) {
				ch.add(l);

			}
			this.setListeQuestion(new ArrayList<Questions>());
			Random ran = new Random();

			int nb;
			int j = 0;
			// choix des questions au hasard
			while (j < nbreQ) {
				nb = ran.nextInt(ch.size());
				Integer val = ch.get(nb);
				listeRandomiser.add(val);
				ch.remove(nb);
				j += 1;

			}
			// randomisation des question
			int pp = matiList.get(0).getNombrequestion();
			int ppp = 0;
			//ici dio
			Map<Integer,Questions> ll=new HashMap<Integer, Questions>();
			
			for (Integer integer : listeRandomiser) {
				if (ppp < pp) {

					Questions quest = listeTotalQ.get(integer);
					sessionBean.setNombreReponseJuste(sessionBean.getNombreReponseJuste()+quest.getNombrereponse());
					listeQuestion.add(quest);
					
					ppp += 1;
				}
			}
			sessionBean.setListeQSession(listeQuestion);
			sessionBean.setBareme(sessionBean.getNombrePoint()/sessionBean.getNombreReponseJuste());

			for (int integer=0;integer<pp;integer++) {
				

					Questions quest = sessionBean.getListeQSession().get(integer);
					
					ll=sessionBean.getQuestionQId();
					ll.put(integer, quest);
					sessionBean.setQuestionQId(ll);
			
			}
			
			// fin dela randomisation

			for (int l = 0; l < listeSujet.size(); l++) {
				Sujet suj = listeSujet.get(l);
				listQuestionOuverte = metier.consulterQuestionOuverte(suj);
				suj.setQuestionouverteList(listQuestionOuverte);
				for (int s = 0; s < listQuestionOuverte.size(); s++) {
					listQuestionOuverte.get(s).setCodesujet(suj);

				}

			}
			questionForm.setPosition(questionForm.getPosition()
					+ questionForm.getNombreQuestion());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/*
	 * page suivant 
	 */
	
	
	@RequestMapping(value = "/pageSuivante")
	public String pageSuivante(HttpSession sessionH, QuestionForm questionForm,
			MatiereForm matiere, ProfilEtudiant proEtu, Model model) {

		int posi = questionForm.getNombreQuestion()
				* (questionForm.getPage() - 1);
		List<Questions> listPage = new ArrayList<Questions>();
		int j = posi;
		System.out.println(" valeur de position initiale =" + j);
		int l = sessionBean.getListeQSession().size() - j;
		if (l < questionForm.getNombreQuestion()) {
			while (j < posi + l) {
				listPage.add(sessionBean.getListeQSession().get(j));
				System.out.println(" valeur de position initiale =" + j);
				j += 1;
			}

		}

		else {
			while (j < posi + questionForm.getNombreQuestion()) {
				if (j >= sessionBean.getListeQSession().size()) {
					j += posi;
				} else {
					listPage.add(sessionBean.getListeQSession().get(j));
					System.out.println(" valeur de position initiale else ="
							+ j);
					j += 1;

				}

			}

		}
		sessionBean.setListeQPage(listPage);

		questionForm.setListeQuestionPage(listPage);
		questionForm.setListeSujet(listeSujet);
		questionForm.setNombrePage(sessionBean.getNombrePage());
		proEtu.setNombreH(matiList.get(0).getNombreheur());
		proEtu.setNombreQ(matiList.get(0).getNombrequestion());
		model.addAttribute("profilEtudiant", sessionBean.getProfilEtudiant());
		model.addAttribute("questionForm", questionForm);
		return "espaceComposition";
	}

	@Scheduled(fixedDelay = 1000)
	public void executer() {
		// int t=matiList.get(0).getNombreheur();
		// t*=60;
		sessionBean.setTempsR(sessionBean.getTempsR() - 1);
		sessionBean.setTempsE(sessionBean.getTempsE() + 1);

	}
	
	/*
	 * enregistrement page
	 */

	@RequestMapping(value = "/enregistrerPage")
	public String enregistrerPage(QuestionForm questionForm, Model model,ProfilEtudiant proEtu,MatiereForm matiere,HttpSession sessionH) {
		int page = questionForm.getPage();
		QuestionForm q=questionForm;
		Map<Integer, String> choixUnique = questionForm.getQuestionMap();
		Map<Integer, List<String>> choixDouble = questionForm.getQuestionMap2();
		// List<Questions> liteQN;
		// Map<Questions,String> listeQR;
		List<String> valeurC=sessionBean.getListeValeur();
		if(choixUnique!=null)
		{
			Set<Integer> lqu = choixUnique.keySet();
			Iterator<Integer> itu = lqu.iterator();
			
			if (itu != null) {
				
				while (itu.hasNext()) {
					Integer i = itu.next();
					String choix = choixUnique.get(i);
					String valeur=metier.getValeurChoixByLibele(choix);
					
					if("Correct".equalsIgnoreCase(valeur))
					{
						sessionBean.setNote(sessionBean.getNote()+sessionBean.getBareme());
						
					}
					
					System.out.println("\n");
					System.out.println("Valeur choix"+i+" = "+valeur);
					System.out.println("\n");
					sessionBean.getListeQPage().remove(i);
					sessionBean.getListeQSession().remove(i);
					valeurC.add(valeur);
					
					//ll.put(quest, choix);

				}
				System.out.println("\n fin");
				sessionBean.setListeValeur(valeurC);
			} else {
			}
		}
		if(choixDouble!=null)
		{
			Set<Integer> lqd = choixDouble.keySet();
			
			Iterator<Integer> itd = lqd.iterator();
			List<String> valc=sessionBean.getListeValeur();
			if (itd != null) {
				System.out.println("\n itd a "+itd.toString());
				while (itd.hasNext()) {
					Integer j = itd.next();
					List<String> listeC = new ArrayList<String>();
					listeC=choixDouble.get(j);
					
					if(listeC==null)
					{
						
					}else{
					
					for (String string : listeC) 
					{	String val=metier.getValeurChoixByLibele(string);
					
					if("Correct".equalsIgnoreCase(val))
					{
						sessionBean.setNote(sessionBean.getNote()+sessionBean.getBareme());
						
					}
					
					System.out.println("\n");
					System.out.println("Valeur choix"+string+" = "+val);
					System.out.println("\n");
						valc.add(val);
					}
					}
					sessionBean.getListeQPage().remove(j);
					sessionBean.getListeQSession().remove(j);
					//sessionBean.getQuestionReponduDouble().put(quest, listeC);

				}
				sessionBean.setListeValeur(valc);
				

			} else 
			{
			}
			
			//Map<Integer,List<Questions>> lq= sessionBean.getQuestionPageCourante();
			//lq.put(page, sessionBean.getListeQPage());
			
			System.out.println("\n total de point de "+sessionBean.getMatricule()+" est "+sessionBean.getNote());
			boolean res=saveNote(sessionBean.getMatricule(), sessionBean.getCodeMatiere(),(float) sessionBean.getNote());
			if(res)
			{sessionBean.setResltCompo("Enregistrement reussit !!!!!  Veillez vous deconnecter svp");}
			if(!res)
			{sessionBean.setResltCompo("Echec de l'enregistrement !!!!!  Veillez recommencer svp");}
		}
		
		if(page<=sessionBean.getNombrePage())
		{
			if(page==sessionBean.getNombrePage())
			{
				sessionBean.setListeQPage(null);
			model.addAttribute("questionForm", new QuestionForm())	;
			sessionBean.setConnecter("NON");
			}
			else{
		
		questionForm.setPage(page+1);
		pageSuivante(sessionH, questionForm, matiere, proEtu, model);
			}
	
		}
		
		return "espaceComposition";
	

		

	}
	
	/*
	 * enregistrement des notes
	 */
	
	public boolean saveNote(String matricule,String codeuv,float note)
	{
		boolean result=false;
		try {
			notPk.setCodeuv(codeuv);
			notPk.setMatricule(matricule);
			evalNote.setNotes(note);
			evalNote.setAnnee("2016");
			evalNote.setSessione("Normal");
			evalNote.setEvaluationnotePK(notPk);
			evalNote.setEtudiant(sessionBean.getEtudiant());
			evalNote.setMatiere(sessionBean.getMatiere());
			
			metier.addNoteMatiere(evalNote, notPk);
			result=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
