package com.gestionqcm.qcm.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.gestionqcm.qcm.entities.Enseignant;
import com.gestionqcm.qcm.entities.Etudiant;

public class ConnectionForm {
	
	@NotEmpty
	@Size(min=3,max=14)
	private String pseudo;
	@NotEmpty
	@Size(min=2,max=14)
	private String motPasse;
	private String tipeConnection;
	private String [] option={"Etudiant","Enseignant","Autres"};
	private String exception;
	
	private Etudiant etudiant;
	
	private Enseignant enseignant;
	
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMotPasse() {
		return motPasse;
	}
	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}
	public String getTipeConnection() {
		return tipeConnection;
	}
	public void setTipeConnection(String tipeConnection) {
		this.tipeConnection = tipeConnection;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	public String [] getOption() {
		return option;
	}
	public void setOption(String [] option) {
		this.option = option;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	

}
