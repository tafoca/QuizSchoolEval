/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionqcm.qcm.metier;

import com.gestionqcm.qcm.dao.IqcmDao;
import com.gestionqcm.qcm.entities.Choix;
import com.gestionqcm.qcm.entities.Enseignant;
import com.gestionqcm.qcm.entities.Etudiant;
import com.gestionqcm.qcm.entities.Evaluationnote;
import com.gestionqcm.qcm.entities.EvaluationnotePK;
import com.gestionqcm.qcm.entities.Evaluationprogrammer;
import com.gestionqcm.qcm.entities.EvaluationprogrammerPK;
import com.gestionqcm.qcm.entities.Filiere;
import com.gestionqcm.qcm.entities.Matiere;
import com.gestionqcm.qcm.entities.Questionouverte;
import com.gestionqcm.qcm.entities.Questions;
import com.gestionqcm.qcm.entities.Suggestion;
import com.gestionqcm.qcm.entities.Sujet;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dany
 */
@Transactional
public class QcmMetierImpl implements IqcmMetier {

    private IqcmDao dao;

    public void setDao(IqcmDao dao) {
        this.dao = dao;
    }

    @Override
    public Choix addChoix(Choix choi) {
        return dao.addChoix(choi);
    }

    @Override
    public void addQuestionToMatiere(Questions question, String codeMatiere) {
        dao.addQuestionToMatiere(question, codeMatiere);
    }

    @Override
    public Questions addQuestion(Questions question) {
        return dao.addQuestion(question);
    }

    @Override
    public Matiere addMatiere(Matiere matiere) {
        return dao.addMatiere(matiere);
    }

    @Override
    public Filiere addFiliere(Filiere filiere) {
        return dao.addFiliere(filiere);
    }

    @Override
    public Etudiant addEtudiantToFiliere(Etudiant etudiant, String codeFiliere) {
        return dao.addEtudiantToFiliere(etudiant, codeFiliere);
    }

    @Override
    public Enseignant addEnseignant(Enseignant ensei) {
        return dao.addEnseignant(ensei);
    }

    @Override
    public void addNoteMatiere(Evaluationnote e, EvaluationnotePK pknote) {
        dao.addNoteMatiere(e, pknote);
    }

    @Override
    public void addMatiereProgrammer(Evaluationprogrammer pro, EvaluationprogrammerPK pkpro) {
        dao.addMatiereProgrammer(pro, pkpro);
    }

    @Override
    public Etudiant consulterEtudiant(String natricule) {
        return dao.consulterEtudiant(natricule);
    }

    @Override
    public Enseignant consulterEnseignant(String codeEnsei) {
        return dao.consulterEnseignant(codeEnsei);
    }

    @Override
    public List<Questions> consulterQuestion() {
        return dao.consulterQuestion();
    }

    @Override
    public List<Questions> consulterQuestionMatiere(String codeuv) {
        return dao.consulterQuestionMatiere(codeuv);
    }

    @Override
    public List<Choix> consulterChoix() {
        return dao.consulterChoix();
    }

    @Override
    public List<Choix> consulterChoixQuestion(Integer idQuestion) {
        return dao.consulterChoixQuestion(idQuestion);
    }

    @Override
    public List<Matiere> consulterMatieres() {
        return dao.consulterMatieres();
    }

    @Override
    public List<Matiere> consulterMatieresPro() {
        return dao.consulterMatieresPro();
    }

    @Override
    public List<Evaluationprogrammer> consulterMatieresPro(String codeuv) {
        return dao.consulterMatieresPro(codeuv);
    }

    @Override
    public Questions deleteQuestion(Long idQuestion) {
        return dao.deleteQuestion(idQuestion);
    }

    @Override
    public Choix deleteChoix(Long numChoix) {
        return dao.deleteChoix(numChoix);
    }

    @Override
    public Evaluationprogrammer deleteMatierePro(String codeUv) {
        return dao.deleteMatierePro(codeUv);
    }

    @Override
    public List<Evaluationprogrammer> getMatiereProByEnseignant(String codeEnsei) {
        return dao.getMatiereProByEnseignant(codeEnsei);
    }

    @Override
    public List<Evaluationnote> getNoteEtudiantByMatiere(String matricule, String codeuv) {
        return dao.getNoteEtudiantByMatiere(matricule, codeuv);
    }

    @Override
    public List<Evaluationnote> getNoteMatiere(String codeuv) {
        return dao.getNoteMatiere(codeuv);
    }

    @Override
    public Suggestion addSuggestion(Suggestion sug, String matricule) {
        return dao.addSuggestion(sug, matricule);
    }

    @Override
    public String editMotpasse(String matricule, String moString1, String motpasse2) {
        return dao.editMotpasse(matricule, moString1, motpasse2);
    }

    @Override
    public List<Suggestion> getSuggestions() {
        return dao.getSuggestions();
    }

    @Override
    public List<Suggestion> getSuggestions(String matricule) {
        return dao.getSuggestions(matricule);
    }

	@Override
	public List<Etudiant> consulterEtudiantByMatriculePasse(String matricule,
			String motpasse) {
		
		return dao.consulterEtudiantByMatriculePasse(matricule, motpasse);
	}

	@Override
	public List<Enseignant> consulterEnseignantByCodePasse(String codeEnsei,
			String motpasse) {
		
		return dao.consulterEnseignantByCodePasse(codeEnsei, motpasse);
	}

	@Override
	public List<Enseignant> consulterEnseignantByRole(String codeE,String motpasse, String role) {
	return dao.consulterEnseignantByRole(codeE, motpasse, role);
	}

	@Override
	public List<Filiere> consulterFiliere() {
	
		return dao.consulterFiliere();
	}

	@Override
	public Sujet addSujetToMatiere(Sujet sujet, String codeuv) {
		return dao.addSujetToMatiere(sujet, codeuv);
	}

	@Override
	public Questionouverte addQuestionOuverteToSujet(Questionouverte questionO,
			Sujet sujet) {
		return dao.addQuestionOuverteToSujet(questionO, sujet);
	}

	@Override
	public List<Questionouverte> consulterQuestionOuverte(Sujet sujet) {
		return dao.consulterQuestionOuverte(sujet);
	}

	@Override
	public List<Sujet> consulterSujet(String codeuv) {
		return dao.consulterSujet(codeuv);
	}

	@Override
	public List<Matiere> consulterListeMatiere(String codeFiliere) {
		return dao.consulterListeMatiere(codeFiliere);
	}

	@Override
	public List<Questions> consulterQuestionMatiere(String codeuv,
			int position, int nombreQuestion) {
		return dao.consulterQuestionMatiere(codeuv, position, nombreQuestion);
	}

	@Override
	public long getNombreQuestion(String codeuv) {
				return dao.getNombreQuestion(codeuv);
	}

	@Override
	public Matiere getMatiere(String uvEnCours) {
		
		return dao.getMatiere(uvEnCours);
	}

	@Override
	public Questions getQuestionByCode(Integer codeQuestion) {
		return dao.getQuestionByCode(codeQuestion);
	}

	@Override
	public String getValeurChoixByLibele(String libeleChoix) {
		
		return dao.getValeurChoixByLibele(libeleChoix);
	}

	@Override
	public String getValeurChoixByNumChoix(Integer numChoix) {
		return dao.getValeurChoixByNumChoix(numChoix);
	}

}
