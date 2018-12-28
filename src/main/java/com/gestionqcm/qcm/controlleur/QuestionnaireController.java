package com.gestionqcm.qcm.controlleur;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gestionqcm.qcm.entities.Choix;
import com.gestionqcm.qcm.entities.Matiere;
import com.gestionqcm.qcm.entities.Questions;
import com.gestionqcm.qcm.metier.IqcmMetier;
import com.gestionqcm.qcm.model.QuestionnaireForm;

@Controller
public class QuestionnaireController {

	@Autowired
	IqcmMetier metier;

	@RequestMapping(value = "/questionbank")
	public String entrerQuestionBanq(Model model) {

		model.addAttribute("questionnaireform", new QuestionnaireForm());

		return "question";
	}

	@RequestMapping(value = "/choix")
	public String savequestionnaire(Model model, QuestionnaireForm qf) {

		int nb = Integer.parseInt(qf.getMaxchoix());

		model.addAttribute("questionnaireform", qf);

		return "question";

	}

	@RequestMapping(value = "/saveQuestion")
	public String savequestion(Model model, QuestionnaireForm qf) {
		Questions q = new Questions();
		q.setLibelequestion(qf.getQuestion());
		List<Choix> l = new ArrayList<Choix>();
		for (int i = 0; i < qf.getValeurchoix().size(); i++) {
			Choix c = new Choix();
			c.setCodequestion(q);
			c.setLibelechoix(qf.getNoschoix().get(i));
			c.setValeurchoix(qf.getValeurchoix().get(i));
			l.add(c);

		}
		q.setChoixList(l);

		q.setCodeuv(new Matiere(qf.getMatiere()));
		int cpt = 0;
		for (int i = 0; i < qf.getValeurchoix().size(); i++) {
			if (qf.getValeurchoix().get(i).equalsIgnoreCase("correct")) {
				cpt += 1;
			}

		}
		q.setNombrereponse(cpt);
		q = metier.addQuestion(q);

		model.addAttribute("questionnaireform", qf);

		return "question";

	}

}
