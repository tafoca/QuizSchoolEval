package com.gestionqcm.qcm.model;

public class Bareme {
	
	private Double reponseCorrect;
	private Double reponseEronee;
	private Double notReponse;
	
	public Double getReponseCorrect() {
		return reponseCorrect;
	}
	public void setReponseCorrect(Double reponseCorrect) {
		this.reponseCorrect = reponseCorrect;
	}
	public Double getReponseEronee() {
		return reponseEronee;
	}
	public void setReponseEronee(Double reponseEronee) {
		this.reponseEronee = reponseEronee;
	}
	public Double getNotReponse() {
		return notReponse;
	}
	public void setNotReponse(Double notReponse) {
		this.notReponse = notReponse;
	}
	public Bareme() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bareme(Double reponseCorrect, Double reponseEronee, Double notReponse) {
		super();
		this.reponseCorrect = reponseCorrect;
		this.reponseEronee = reponseEronee;
		this.notReponse = notReponse;
	}

	
	
}
