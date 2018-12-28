package com.gestionqcm.qcm.model;

import java.util.List;

import com.gestionqcm.qcm.entities.Choix;
import com.gestionqcm.qcm.entities.Matiere;
import com.gestionqcm.qcm.entities.Questions;

public class QuestionnaireForm {

	private String question;
	private List<Choix> meschoix;
	private String matiere;
	private String maxchoix;
	private List<String> valeurchoix;
	private List<String> noschoix;
	public List<String> getNoschoix() {
		return noschoix;
	}

	public void setNoschoix(List<String> noschoix) {
		this.noschoix = noschoix;
	}

	private String choix1;
	private String choix2;
	private String choix3;
	private String choix4;
	private String choix5;
	private String choix6;
	private String valeurchoix1;
	private String valeurchoix2;
	private String valeurchoix3;
	private String valeurchoix4;
	private String valeurchoix5;
	private String valeurchoix6;
	
	

	public String getChoix1() {
		return choix1;
	}

	public void setChoix1(String choix1) {
		this.choix1 = choix1;
	}

	public String getChoix2() {
		return choix2;
	}

	public void setChoix2(String choix2) {
		this.choix2 = choix2;
	}

	public String getChoix3() {
		return choix3;
	}

	public void setChoix3(String choix3) {
		this.choix3 = choix3;
	}

	public String getChoix4() {
		return choix4;
	}

	public void setChoix4(String choix4) {
		this.choix4 = choix4;
	}

	public String getChoix5() {
		return choix5;
	}

	public void setChoix5(String choix5) {
		this.choix5 = choix5;
	}

	public String getChoix6() {
		return choix6;
	}

	public void setChoix6(String choix6) {
		this.choix6 = choix6;
	}

	public String getValeurchoix1() {
		return valeurchoix1;
	}

	public void setValeurchoix1(String valeurchoix1) {
		this.valeurchoix1 = valeurchoix1;
	}

	public String getValeurchoix2() {
		return valeurchoix2;
	}

	public void setValeurchoix2(String valeurchoix2) {
		this.valeurchoix2 = valeurchoix2;
	}

	public String getValeurchoix3() {
		return valeurchoix3;
	}

	public void setValeurchoix3(String valeurchoix3) {
		this.valeurchoix3 = valeurchoix3;
	}

	public String getValeurchoix4() {
		return valeurchoix4;
	}

	public void setValeurchoix4(String valeurchoix4) {
		this.valeurchoix4 = valeurchoix4;
	}

	public String getValeurchoix5() {
		return valeurchoix5;
	}

	public void setValeurchoix5(String valeurchoix5) {
		this.valeurchoix5 = valeurchoix5;
	}

	public String getValeurchoix6() {
		return valeurchoix6;
	}

	public void setValeurchoix6(String valeurchoix6) {
		this.valeurchoix6 = valeurchoix6;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public List<Choix> getMeschoix() {
		return meschoix;
	}

	public void setMeschoix(List<Choix> meschoix) {
		this.meschoix = meschoix;
	}

	public String getMaxchoix() {
		return maxchoix;
	}

	public void setMaxchoix(String maxchoix) {
		this.maxchoix = maxchoix;
	}

	public List<String> getValeurchoix() {
		return valeurchoix;
	}

	public void setValeurchoix(List<String> valeurchoix) {
		this.valeurchoix = valeurchoix;
	}

}
