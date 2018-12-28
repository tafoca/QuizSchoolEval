package com.gestionqcm.qcm.model;

import java.util.List;

import com.gestionqcm.qcm.entities.Filiere;

public class FiliereForm {
	
	private String codeF,intituleF;
	
	private List<Filiere> listF;
	
	
	
	//private String action;

	
	
	
	public List<Filiere> getListF() {
		return listF;
	}


	public void setListF(List<Filiere> listF) {
		this.listF = listF;
	}

	public String getCodeF() {
		return codeF;
	}

	public void setCodeF(String codeF) {
		this.codeF = codeF;
	}

	public String getIntituleF() {
		return intituleF;
	}

	public void setIntituleF(String intituleF) {
		this.intituleF = intituleF;
	}
	
	

}
