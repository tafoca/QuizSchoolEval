package com.gestionqcm.qcm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.inject.New;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestionqcm.qcm.entities.Enseignant;
import com.gestionqcm.qcm.entities.Etudiant;
import com.gestionqcm.qcm.entities.Matiere;
import com.gestionqcm.qcm.metier.IqcmMetier;
import com.gestionqcm.qcm.model.ConnectionForm;
import com.gestionqcm.qcm.model.ProfilEtudiant;
import com.gestionqcm.qcm.model.QuestionnaireForm;
import com.gestionqcm.qcm.session.SessionBean;

/**
 * Handles requests for the application home page.
 */
@Controller

public class HomeController {
	@Autowired
	private IqcmMetier metier;
	
	@Autowired
	private SessionBean sessionBean;
	
	 List<Matiere> listeMatiere =new ArrayList<Matiere>();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(HttpSession sessionHttp,Model model) {
		ConnectionForm con = new ConnectionForm();
		sessionHttp.setAttribute("sessionBeanEtudiant", null);
		model.addAttribute("connectionForm", con);
		return "index";
	}
	// model.addAttribute("listeQuestion", listQ);

	
	@RequestMapping(value = "/monEspace", method = RequestMethod.POST)
	public String monEspace(HttpSession sessionHttp ,@Valid ConnectionForm cf,ProfilEtudiant proE,BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors())
		{
			return "index";
			
		}
		
		String tp = cf.getTipeConnection();
		String page = "index";
		
		if("Etudiant".equalsIgnoreCase(tp))
		{
		
			try{
			    List<Etudiant> etuList =(List<Etudiant>) metier.consulterEtudiantByMatriculePasse(cf.getPseudo(), cf.getMotPasse());
			
				if(!etuList.isEmpty())
				{
				Etudiant et = etuList.get(0);
				cf.setEtudiant(et);
				
				proE.setNom(et.getNometudiant());
				proE.setPrenom(et.getPrenometudiant());
				proE.setEmail(et.getEmail());
				proE.setMotpasse(et.getMotpasse());
				proE.setFiliere(et.getCodefiliere().getCodefiliere());
				proE.setMatricule(et.getMatricule());
				proE.setFiliereNom(et.getCodefiliere().getDesignation());
				proE.setDatenaissance(et.getDatenaissance().toString());
				proE.setDepartement(et.getDepartement());
				proE.setNationalite(et.getNationalite());
				proE.setRegion(et.getRegion());
				proE.setSexe(et.getSexe());
				proE.setStatut(et.getStatut());
				proE.setProfession(et.getProfession());
				proE.setAdminName("");
				proE.setEtudiant(et);
				
				List<Matiere> matiList=metier.consulterListeMatiere(et.getCodefiliere().getCodefiliere());
				listeMatiere=matiList;
				List<String> fileM=new ArrayList<String>();
				for (Matiere matt : listeMatiere) {
					fileM.add(matt.getCodeuv());
					
				}
				proE.getMatiereForm().setCodeMatiereListe(fileM);
				proE.getMatiereForm().setListeM(listeMatiere);
				proE.getMatiereForm().setMatricule(et.getMatricule());
				
				sessionBean.setListeValeur(new ArrayList<String>());
				sessionBean.setMatricule(et.getMatricule());
				sessionBean.setEtudiant(et);
				sessionBean.setCodeFiliere(et.getCodefiliere().getCodefiliere());
					sessionBean.setListeMSession(fileM);
					sessionBean.setConnecter("OUI");
				
				for(int i=0;i<fileM.size();i++)
				{
					
					System.out.println("session liste de codefiliere = "+sessionBean.getListeMSession().get(i));
				}
				
				System.out.println("session matricule = "+sessionBean.getMatricule());
				System.out.println("session codefiliere = "+sessionBean.getCodeFiliere());
				sessionBean.setProfilEtudiant(proE);
				sessionHttp.setAttribute("sessionBeanEtudiant",sessionBean );
				
				model.addAttribute("profilEtudiantForm", proE);
				page = "espaceEtudiant";
				}
				
				}
			catch (Exception e) {
				cf.setException(e.getMessage());
				}

		}
		else {
			if ("Enseignant".equalsIgnoreCase(tp)) {
				try{
				List<Enseignant> enseiList = metier.consulterEnseignantByCodePasse(cf.getPseudo(),cf.getMotPasse());
				if (!enseiList.isEmpty()) {
					Enseignant et = enseiList.get(0);
					cf.setEnseignant(et);
					model.addAttribute("profilConnecteur", et);
					model.addAttribute("questionnaireform", new QuestionnaireForm() );
				
					page = "question";

				}
				}catch (Exception e) {
					cf.setException(e.getMessage());
					}
				

			}
			else
			{
				if("Autres".equalsIgnoreCase(tp))
				{
					String role="Admin";
					try{
					List<Enseignant> enseiList = metier.consulterEnseignantByRole(cf.getPseudo(), cf.getMotPasse(), role);
					if (!enseiList.isEmpty()) {
						Enseignant et = enseiList.get(0);
						ProfilEtudiant pro=new ProfilEtudiant();
						pro.setAdminName(et.getNomenseignant());
						cf.setEnseignant(et);
						model.addAttribute("profilConnecteur", cf);
						model.addAttribute("ajoutEtudiant", pro);
					
						page = "espaceAdministrateur";

					}
					}catch (Exception e) {
						cf.setException(e.getMessage());
					}
					
					
					
				}	
				
				
			}

		}


	
		return page;
	}
	@RequestMapping(value="/modifierPasseE")
	public String editPasse(ConnectionForm cf,Model model)
	{
		model.addAttribute("connectionForm", cf);
		return "espaceEtudiant";
	}
	
	@RequestMapping(value="/monEspaceEt")
	public String espaceET(ConnectionForm cf,Model model)
	{
		List<Etudiant> etuList =(List<Etudiant>) metier.consulterEtudiantByMatriculePasse(cf.getPseudo(), cf.getMotPasse());
		
		if(!etuList.isEmpty())
		{
		Etudiant et = etuList.get(0);
		cf.setEtudiant(et);

		model.addAttribute("connectionForm", cf);
		
		
		}
		return "espaceEtudiant";
	}
	
	@RequestMapping(value="/monEspaceEn")
	public String espaceEN(ConnectionForm cf,Model model)
	{
		List<Enseignant> enseiList = metier.consulterEnseignantByCodePasse(cf.getPseudo(),cf.getMotPasse());
		if (!enseiList.isEmpty()) {
			Enseignant et = enseiList.get(0);
			cf.setEnseignant(et);
			model.addAttribute("profilConnecteur", et);
		model.addAttribute("connectionForm", cf);
		}
		return "espaceEnseignant";
	}
	
	@InitBinder
	public void initBinder(DataBinder binder) {
	    SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormatter, true));
	}

}