package com.gestionqcm.qcm.controlleur;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.ConstructorResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionqcm.qcm.entities.Enseignant;
import com.gestionqcm.qcm.entities.Evaluationprogrammer;
import com.gestionqcm.qcm.entities.EvaluationprogrammerPK;
import com.gestionqcm.qcm.entities.Matiere;
import com.gestionqcm.qcm.metier.IqcmMetier;
import com.gestionqcm.qcm.model.EvavaluationProgForm;

@Controller
public class Programmatiomcontroller {

	@Autowired
	IqcmMetier metier;

	List<Matiere> listmatieres;
	List<Enseignant> listEnseignants;
	List<String> idmat;

	@PostConstruct
	public void initialisation() {
		listmatieres = metier.consulterMatieres();
		// listEnseignants=;
	}

	@RequestMapping(value = "/evaluationProg")
	public String entrerQuestionBanq(Model model) {
		EvavaluationProgForm prog = new EvavaluationProgForm();
		for (Matiere matiere : listmatieres) {
			// idmat.add(matiere.getCodeuv());
		}
		prog.setIdmat(idmat);
		model.addAttribute("programmationform", prog);

		return "progevaluation";
	}

	@RequestMapping(value = "/programmation")
	public String saveEvaluation(Model model, EvavaluationProgForm prog) {

		Enseignant ens = metier.consulterEnseignant(prog.getEnseignant());
		Matiere uv = metier.getMatiere(prog.getUvEnCours());
		if (ens != null && uv != null) {
			Evaluationprogrammer evaluationprogrammer = new Evaluationprogrammer();
			evaluationprogrammer.setEnseignant(ens);
			evaluationprogrammer.setMatiere(uv);
			evaluationprogrammer.setHeurevaluation(prog.getHeureEvaluation());
			evaluationprogrammer.setNombreheur(prog.getDuree());
			evaluationprogrammer.setNombrequestion(prog.getNumberQcm());
			evaluationprogrammer.setDateevaluation(prog.getDateEvaluation());
			evaluationprogrammer
					.setEvaluationprogrammerPK(new EvaluationprogrammerPK(prog
							.getUvEnCours(), prog.getEnseignant()));

			metier.addMatiereProgrammer(
					evaluationprogrammer,
					new EvaluationprogrammerPK(prog.getUvEnCours(), prog
							.getEnseignant()));
		}

		model.addAttribute("programmationform", prog);

		return "progevaluation";

	}

	public List<Matiere> getListmatieres() {
		return listmatieres;
	}

	public void setListmatieres(List<Matiere> listmatieres) {
		this.listmatieres = listmatieres;
	}

}
