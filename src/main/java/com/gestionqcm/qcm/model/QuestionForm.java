package com.gestionqcm.qcm.model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import com.gestionqcm.qcm.entities.Choix;
import com.gestionqcm.qcm.entities.Etudiant;
import com.gestionqcm.qcm.entities.Matiere;
import com.gestionqcm.qcm.entities.Questionouverte;
import com.gestionqcm.qcm.entities.Questions;
import com.gestionqcm.qcm.entities.Sujet;

public class QuestionForm {
	private String libeleQuestion;
	@ApplicationScoped
	private List<Questions> listQ;
	private Map<Questions,Choix> QChoix;
	private Matiere matiere;
	private Etudiant etudiant;
	
	private int nombreH;
	private int nombreQ;
	
	private List<Choix> QChoix1;
	@ApplicationScoped
	private List<Questions> listQF;
	
	
	private List<Sujet> listeSujet;
	private List<Questionouverte> listeQuestionOuverte;
	private List<String> listeReponse;
	
	private Map<Integer,String> questionMap;
	private Map<Integer,List<String>>questionMap2;
	
	
	private int page=1;
	private int nombreQuestion=10;
	private int nombrePage;
	private int position=0;
	
	List<Questions> listeQuestionPage;
	List<Questions> listeQuestionEpreuve;
	//LinkedHashMap<K, V>
	
	private int tempsE=0,tempsR;
	
	public int getTempsR() {
		return tempsR;
	}

	public void setTempsR(int tempsR) {
		this.tempsR = tempsR;
	}

	public int getTempsE() {
		return tempsE;
	}

	public void setTempsE(int tempsE) {
		this.tempsE = tempsE;
	}
	
	
	public List<Questions> getListeQuestionPage() {
		return listeQuestionPage;
	}

	public void setListeQuestionPage(List<Questions> listeQuestionPage) {
		this.listeQuestionPage = listeQuestionPage;
	}

	public List<Questions> getListeQuestionEpreuve() {
		return listeQuestionEpreuve;
	}

	public void setListeQuestionEpreuve(List<Questions> listeQuestionEpreuve) {
		this.listeQuestionEpreuve = listeQuestionEpreuve;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getNombreQuestion() {
		return nombreQuestion;
	}

	public void setNombreQuestion(int nombreQuestion) {
		this.nombreQuestion = nombreQuestion;
	}

	public int getNombrePage() {
		return nombrePage;
	}

	public void setNombrePage(int nombrePage) {
		this.nombrePage = nombrePage;
	}


	public Map<Integer, List<String>> getQuestionMap2() {
		return questionMap2;
	}
	public void setQuestionMap2(Map<Integer, List<String>> questionMap2) {
		this.questionMap2 = questionMap2;
	}
	public Map<Integer, String> getQuestionMap() {
		return questionMap;
	}
	public void setQuestionMap(Map<Integer, String> questionMap) {
		this.questionMap = questionMap;
	}
	public List<Sujet> getListeSujet() {
		return listeSujet;
	}
	public void setListeSujet(List<Sujet> listeSujet) {
		this.listeSujet = listeSujet;
	}
	public List<Questionouverte> getListeQuestionOuverte() {
		return listeQuestionOuverte;
	}
	public void setListeQuestionOuverte(List<Questionouverte> listeQuestionOuverte) {
		this.listeQuestionOuverte = listeQuestionOuverte;
	}
	public List<String> getListeReponse() {
		return listeReponse;
	}
	public void setListeReponse(List<String> listeReponse) {
		this.listeReponse = listeReponse;
	}
	public List<Questions> getListQF() {
		return listQF;
	}
	public void setListQF(List<Questions> listQF) {
		this.listQF = listQF;
	}
	public List<Choix> getQChoix1() {
		return QChoix1;
	}
	public void setQChoix1(List<Choix> qChoix1) {
		QChoix1 = qChoix1;
	}
	public int getNombreQ() {
		return nombreQ;
	}
	public void setNombreQ(int nombreQ) {
		this.nombreQ = nombreQ;
	}
	public int getNombreH() {
		return nombreH;
	}
	public void setNombreH(int nombreH) {
		this.nombreH = nombreH;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public String getLibeleQuestion() {
		return libeleQuestion;
	}
	public void setLibeleQuestion(String libeleQuestion) {
		this.libeleQuestion = libeleQuestion;
	}
	public List<Questions> getListQ() {
		return listQ;
	}
	public void setListQ(List<Questions> listQ) {
		this.listQ = listQ;
	}
	public Map<Questions, Choix> getQChoix() {
		return QChoix;
	}
	public void setQChoix(Map<Questions, Choix> qChoix) {
		QChoix = qChoix;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	
	
	
	

}
