/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionqcm.qcm.dao;

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

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author dany
 */
public class QcmDaoImpl implements IqcmDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Choix addChoix(Choix choi) {
        em.persist(choi);
        return choi;
    }

    @Override
    public void addQuestionToMatiere(Questions question, String codeMatiere) {
        if (codeMatiere != null) {
            Matiere mat = em.find(Matiere.class, codeMatiere);
            question.setCodeuv(mat);
            mat.getQuestionsList().add(question);
        }
        em.persist(question);
    }

    @Override
    public Questions addQuestion(Questions question) {
        em.persist(question);
        return question;
    }

    @Override
    public Matiere addMatiere(Matiere matiere) {
        em.persist(matiere);
        return matiere;
    }

    @Override
    public Filiere addFiliere(Filiere filiere) {
    	if(filiere!=null)
    		{em.persist(filiere);}
        return filiere;
    }

    @Override
    public Etudiant addEtudiantToFiliere(Etudiant etudiant, String codeFiliere) {
        if (codeFiliere != null) {

            Filiere fil = em.find(Filiere.class, codeFiliere);
            etudiant.setCodefiliere(fil);
        }
        em.persist(etudiant);
        return etudiant;
    }

    @Override
    public Enseignant addEnseignant(Enseignant ensei) {
        em.persist(ensei);
        return ensei;
    }

    @Override
    public void addNoteMatiere(Evaluationnote e, EvaluationnotePK no) {
        if ((no.getMatricule()!= null) && (no.getCodeuv() != null)) {
            Etudiant etu = em.find(Etudiant.class, no.getMatricule());
            Matiere mat = em.find(Matiere.class, no.getCodeuv());
            e.setEtudiant(etu);
            e.setMatiere(mat);
        }
        em.persist(e);

    }

    @Override
    public void addMatiereProgrammer(Evaluationprogrammer pro, EvaluationprogrammerPK e) {
        if ((e.getCodeuv() != null) && (e.getCodeenseignant() != null)) {
            Enseignant ens = em.find(Enseignant.class, e.getCodeenseignant());
            Matiere mat = em.find(Matiere.class, e.getCodeuv());
            pro.setEnseignant(ens);
            pro.setMatiere(mat);
        }
        em.persist(pro);

    }

    @Override
    public Etudiant consulterEtudiant(String natricule) {
        Etudiant etu = em.find(Etudiant.class, natricule);
        if (etu == null) {
            throw new RuntimeException("Etudiant inexistant");
        }
        return etu;
    }

    @Override
    public Enseignant consulterEnseignant(String codeEnsei) {
        Enseignant etu = em.find(Enseignant.class, codeEnsei);
        if (etu == null) {
            throw new RuntimeException("Enseignat inexistant");
        }
        return etu;

    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Questions> consulterQuestion() {
        Query req1 = em.createNamedQuery("Questions.findAll");
        return req1.getResultList();
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Questions> consulterQuestionMatiere(String codeuv) {
        Matiere mat=em.find(Matiere.class, codeuv);
        
        if(mat!=null)
        {
        Query que=em.createNamedQuery("Questions.findByCodeuv");
       que.setParameter("codeuv1", mat.getCodeuv());
        
        
        return que.getResultList();
        }
        else{return null;}

    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Choix> consulterChoix() {
        Query req1 = em.createNamedQuery("Choix.findAll");
        return req1.getResultList();

    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Choix> consulterChoixQuestion(Integer idQuestion) {
        Query qre = em.createNamedQuery("Choix.findByCodequestion");
        qre.setParameter("codequestion", idQuestion);
        return qre.getResultList();
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Matiere> consulterMatieres() {
        Query req1 = em.createNamedQuery("Matiere.findAll");
        return req1.getResultList();

    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Matiere> consulterMatieresPro() {
        
         Query req1=em.createNamedQuery("Evaluationprogrammer.findAll");
        return req1.getResultList();
    }
    @SuppressWarnings("unchecked")
	@Override
     public List<Evaluationprogrammer> consulterMatieresPro(String codeuv)
     {
      Query qre = em.createNamedQuery("Evaluationprogrammer.findByCodeuv");
        qre.setParameter("codeuv", codeuv);
        return qre.getResultList();
     
     }

    @Override
    public Questions deleteQuestion(Long idQuestion) {
        Questions que=em.find(Questions.class, idQuestion);
        if(que!=null)
        {
        Query qu=em.createNamedQuery("Questions.deleteByCodequestion");
        qu.setParameter("codequestion", idQuestion);
        int i=qu.executeUpdate();
        if(i==0)
        {throw new RuntimeException("Question non supprimer");}
        }
        
        return que;
    }

    @Override
    public Choix deleteChoix(Long numChoix) {
         Choix que=em.find(Choix.class, numChoix);
        if(que!=null)
        {
        Query qu=em.createNamedQuery("Choix.deleteByNumchoix");
        qu.setParameter("numchoix", numChoix);
        int i=qu.executeUpdate();
        if(i==0)
        {throw new RuntimeException("Choix non supprimer");}
        }
        
        return que;
    
    }

    @Override
    public Evaluationprogrammer deleteMatierePro(String codeUv) {
         Evaluationprogrammer que=em.find(Evaluationprogrammer.class, codeUv);
        if(que!=null)
        {
        Query qu=em.createNamedQuery("Evaluationprogrammer.deleteByCodeuv");
        qu.setParameter("codeuv", codeUv);
        int i=qu.executeUpdate();
        if(i==0)
        {throw new RuntimeException("Evaluation non supprimer");}
        }
        
        return que;
    
    
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Evaluationprogrammer> getMatiereProByEnseignant(String codeEnsei) {
  
        Query tr=em.createNamedQuery("Evaluationprogrammer.findByCodeenseignant");
        tr.setParameter("codeenseignant", codeEnsei);
        return tr.getResultList();

    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Evaluationnote> getNoteEtudiantByMatiere(String matricule, String codeuv) {
        Query tr=em.createNamedQuery("Evaluationnote.findByMatriculeCodeuv");
        tr.setParameter("matricule", matricule);
        tr.setParameter("codeuv", codeuv);
        return tr.getResultList();
    
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Evaluationnote> getNoteMatiere(String codeuv) {
        Query que= em.createNamedQuery("Evaluationnote.findByCodeuv");
        que.setParameter("codeuv", codeuv);
        return que.getResultList();
    
    }


 
    @Override
    public Suggestion addSuggestion(Suggestion sug, String matricule) {
        Etudiant et=em.find(Etudiant.class, matricule);
        if(et!=null)
        {
        sug.setMatricule(et);
        em.persist(sug);
        }
        return sug;
    }

    @Override
    public String editMotpasse(String matricule,String motpasse1, String motpasse2) 
    {
    	String mon=null;
       Etudiant mot=em.find(Etudiant.class, motpasse1);
        if(mot!=null)
        {
        mot.setMotpasse(motpasse2);;
        em.persist(mot);
        mon=mot.getMotpasse();
        }
        else
        {
        Enseignant ensei=em.find(Enseignant.class, matricule);
        if(ensei!=null)
        {
        	ensei.setMotpasse(motpasse2);
        	em.persist(ensei);
        	mon=ensei.getMotpasse();
        	
        }
        	
        }
    return mon;
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Suggestion> getSuggestions() {
        Query que=em.createNamedQuery("Suggestion.findAll");
        return que.getResultList();
    }

    @SuppressWarnings("unchecked")
	@Override
    public List<Suggestion> getSuggestions(String matricule) {
        Query que=em.createNamedQuery("Suggestion.findByMatricule");
        return que.getResultList();
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<Etudiant> consulterEtudiantByMatriculePasse(String matricule,String motpasse) {
		Query que=em.createNamedQuery("Etudiant.findByMatriculeMotPasse");
		que.setParameter("matricule", matricule);
		que.setParameter("motpasse", motpasse);
		
		return que.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Enseignant> consulterEnseignantByCodePasse(String codeEnsei,String motpasse) {
		
		Query que=em.createNamedQuery("Enseignant.findByCodeenseignantMotpasse");
		que.setParameter("codeenseignant", codeEnsei);
		que.setParameter("motpasse", motpasse);
		
		return que.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Enseignant> consulterEnseignantByRole(String codeE,String motpasse, String role) {
		Query que=em.createNamedQuery("Enseignant.findByRole");
		que.setParameter("codeenseignant", codeE);
		que.setParameter("motpasse", motpasse);
		que.setParameter("role", role);
		
		return que.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Filiere> consulterFiliere() {
		  Query req1 = em.createNamedQuery("Filiere.findAll");
	        return req1.getResultList();
	}

	@Override
	public Sujet addSujetToMatiere(Sujet sujet, String codeuv) {
		
		sujet.setCodematiere(em.find(Matiere.class, codeuv));
		em.persist(sujet);
		return sujet;
	}

	@Override
	public Questionouverte addQuestionOuverteToSujet(Questionouverte questionO,
			Sujet sujet) {
		questionO.setCodesujet(sujet);
		sujet.getQuestionouverteList().add(questionO);
		em.persist(sujet);
		em.persist(questionO);
		
		return questionO;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Questionouverte> consulterQuestionOuverte(Sujet sujet) {
		Sujet suj=em.find(Sujet.class, sujet.getCodesujet());
		if(suj!=null)
		{
			Query que =em.createNamedQuery("Questionouverte.findByCodesujet");
			que.setParameter("codesujet", sujet.getCodesujet());
			return que.getResultList();
			
		}
		else{
		return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sujet> consulterSujet(String codeuv) {
			Matiere  matiere=em.find(Matiere.class, codeuv);
			
			if(matiere!=null)
			{
			Query que=em.createNamedQuery("Sujet.findByCodematiere");
			que.setParameter("codeuv", codeuv);
		
			return que.getResultList();
				
			}
			else
			{
			return null;
			}
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Matiere> consulterListeMatiere(String codeFiliere) {
		Query que =em.createNamedQuery("Matiere.findByCodeFiliere");
		que.setParameter("codefiliere", codeFiliere);
		return que.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Questions> consulterQuestionMatiere(String codeuv,
			int position, int nombreQuestion) 
			{
		Query que =em.createNamedQuery("Questions.findByCodeuv");
		que.setParameter("codeuv", codeuv);
		que.setFirstResult(position);
		que.setMaxResults(nombreQuestion);
		return que.getResultList();

		
		
	}

	@Override
	public long getNombreQuestion(String codeuv) {
Query req= em.createQuery("select count(o) from Questions o where o.codeuv.codeuv = :codeuv");
req.setParameter("codeuv",codeuv);

		return req.getFirstResult();
	}
	
	@Override
	public Matiere getMatiere(String uvEnCours) {
		Matiere etu = em.find(Matiere.class, uvEnCours);
		if (etu == null) {
			throw new RuntimeException("Matiere inexistant");
		}
		return etu;
	}

	@Override
	public Questions getQuestionByCode(Integer codeQuestion) {
		Questions etu = em.find(Questions.class, codeQuestion);
		if (etu == null) {
			throw new RuntimeException("Question  inexistant");
		}
		return etu;
	}

	@Override
	public String getValeurChoixByLibele(String libeleChoix) {
		Query que =em.createNamedQuery("Choix.findByLibelechoix");
		que.setParameter("libelechoix", libeleChoix);
		
		if(que.getResultList().isEmpty())
		{return "";}
		else{
		
			Choix cc=(Choix) que.getResultList().get(0);
			return cc.getValeurchoix();
		}
	}

	@Override
	public String getValeurChoixByNumChoix(Integer numChoix) {
		Choix c= em.find(Choix.class, numChoix);
		return c.getLibelechoix();
	}

}
