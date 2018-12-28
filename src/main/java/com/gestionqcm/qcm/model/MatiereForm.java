package com.gestionqcm.qcm.model;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.gestionqcm.qcm.entities.Etudiant;
import com.gestionqcm.qcm.entities.Matiere;

@Dependent
public class MatiereForm {
	
	
	private String codeUv;
	
	
	private Etudiant etudiant;
	private ProfilEtudiant profilE;
	
	private List<Matiere> listeM;
	private List<String> codeMatiereListe;
	
	private String matricule;
	
	private String exception;
	
	
	
	
	
	
	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public List<Matiere> getListeM() {
		return listeM;
	}

	public void setListeM(List<Matiere> listeM) {
		this.listeM = listeM;
	}

	
	public ProfilEtudiant getProfilE() {
		return profilE;
	}

	public void setProfilE(ProfilEtudiant profilE) {
		this.profilE = profilE;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public String getCodeUv() {
		return codeUv;
	}

	public void setCodeUv(String codeUv) {
		this.codeUv = codeUv;
	}

	public List<String> getCodeMatiereListe() {
		return codeMatiereListe;
	}

	public void setCodeMatiereListe(List<String> codeMatiereListe) {
		this.codeMatiereListe = codeMatiereListe;
	}
	
	

}
