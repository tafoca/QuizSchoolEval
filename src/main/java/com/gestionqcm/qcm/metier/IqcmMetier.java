/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionqcm.qcm.metier;

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

/**
 *
 * @author dany
 */
public interface IqcmMetier {
    
        public Choix addChoix(Choix choi);
    //public Choix getChoix(Long numChoix);
    public void addQuestionToMatiere(Questions question,String codeMatiere);
    public Questions addQuestion(Questions question);
    public Matiere addMatiere(Matiere matiere);
    public Filiere addFiliere(Filiere filiere);
    public Etudiant addEtudiantToFiliere(Etudiant etudiant,String codeFiliere);
    public Enseignant addEnseignant(Enseignant ensei);
    public void addNoteMatiere(Evaluationnote e,EvaluationnotePK pknote);
    public void addMatiereProgrammer(Evaluationprogrammer pro,EvaluationprogrammerPK pkpro);
    
    
    public Sujet addSujetToMatiere(Sujet sujet,String codeuv );
    public Questionouverte addQuestionOuverteToSujet(Questionouverte questionO,Sujet sujet  );
    public List<Questionouverte> consulterQuestionOuverte(Sujet sujet);
    public List<Sujet> consulterSujet(String codeuv);
    
    
    public List<Matiere> consulterListeMatiere(String codeFiliere);
    public Matiere getMatiere(String uvEnCours);
    public Questions getQuestionByCode(Integer codeQuestion);
    public String getValeurChoixByLibele(String libeleChoix);
    public String getValeurChoixByNumChoix(Integer numChoix);
    
    public Etudiant consulterEtudiant(String natricule);
    public Enseignant consulterEnseignant(String codeEnsei);
    
    public List<Questions> consulterQuestion();
    public List<Questions> consulterQuestionMatiere(String codeuv);
    public List<Choix> consulterChoix();
    public List<Choix> consulterChoixQuestion(Integer idQuestion);
    public List<Matiere> consulterMatieres();
    public List<Filiere> consulterFiliere();
    public List<Matiere> consulterMatieresPro();
    public List<Evaluationprogrammer> consulterMatieresPro(String codeuv);
    
    //methode de consultation pour pagination
    public List<Questions> consulterQuestionMatiere(String codeuv,int position,int nombreQuestion);
    public long getNombreQuestion(String codeuv);
    //fin
    
    // methode de modificaton
    
    public Questions deleteQuestion(Long idQuestion);
    public Choix deleteChoix(Long numChoix);
    public Evaluationprogrammer deleteMatierePro(String codeUv);
    
    public List<Evaluationprogrammer> getMatiereProByEnseignant(String codeEnsei);
    public List<Evaluationnote> getNoteEtudiantByMatiere(String matricule,String codeuv);
    public List<Evaluationnote> getNoteMatiere(String codeuv);
    
  
    public Suggestion addSuggestion(Suggestion sug,String matricule);
    public String editMotpasse(String matricule ,String moString1, String motpasse2);
    
    public List<Suggestion> getSuggestions();
    public List<Suggestion> getSuggestions(String matricule);
    public List<Etudiant> consulterEtudiantByMatriculePasse(String matricule,String motpasse);
    public List<Enseignant> consulterEnseignantByCodePasse(String codeEnsei,String motpasse);
    
    public List<Enseignant> consulterEnseignantByRole(String codeE,String motpasse,String role);
    
    
    
}
