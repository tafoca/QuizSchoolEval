package com.gestionqcm.qcm.model;

import java.util.Date;
import java.util.List;

import com.gestionqcm.qcm.entities.Enseignant;
import com.gestionqcm.qcm.entities.Matiere;

public class EvavaluationProgForm {

	Bareme bareme;
	Integer numberQcm;
	String uvEnCours;
	String enseignant;
	Date dateEvaluation;
	String heureEvaluation;
	Integer duree;
	List<String> idmat;
	
	
	public List<String> getIdmat() {
		return idmat;
	}

	public void setIdmat(List<String> idmat) {
		this.idmat = idmat;
	}

	public Bareme getBareme() {
		return bareme;
	}

	public void setBareme(Bareme bareme) {
		this.bareme = bareme;
	}

	public Integer getNumberQcm() {
		return numberQcm;
	}

	public void setNumberQcm(Integer numberQcm) {
		this.numberQcm = numberQcm;
	}

	
	public String getUvEnCours() {
		return uvEnCours;
	}

	public void setUvEnCours(String uvEnCours) {
		this.uvEnCours = uvEnCours;
	}

	public String getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(String enseignant) {
		this.enseignant = enseignant;
	}

	public Date getDateEvaluation() {
		return dateEvaluation;
	}

	public void setDateEvaluation(Date dateEvaluation) {
		this.dateEvaluation = dateEvaluation;
	}

	public String getHeureEvaluation() {
		return heureEvaluation;
	}

	public void setHeureEvaluation(String heureEvaluation) {
		this.heureEvaluation = heureEvaluation;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

}
