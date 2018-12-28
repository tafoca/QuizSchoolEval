package com.gestionqcm.qcm.session;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.gestionqcm.qcm.entities.Etudiant;
import com.gestionqcm.qcm.entities.Matiere;
import com.gestionqcm.qcm.entities.Questions;
import com.gestionqcm.qcm.model.ProfilEtudiant;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionBean {
	private final String id=UUID.randomUUID().toString();
	private String matricule;
	private Etudiant etudiant;
	private String codeFiliere;
	private String codeMatiere,intituleMatiere;
	private Matiere matiere;
	private List<String> listeMSession;
	private List<Questions> listeQSession;
	
	
	private ProfilEtudiant profilEtudiant;
	private int nombrePage;
	private String connecter="OUI";
	
	private List<Questions> listeQPage;
	
	Map<Integer,Questions> questionQId;
	
	Map<Integer,List<Questions>> questionPageCourante;
	/*
	 * 
	 * les liste de questions resolu et non resolu
	 */
	private Map<Questions,String> questionRepondu;
	private List<Questions> questionNonRepondu;
	private Map<Questions,List<String>> questionReponduDouble;
	
	private int tempsE=0,tempsR;
	
	private List<String>  listeValeur;
	
	private double note=0;
	private float bareme;
	private int nombreReponseJuste=0,nombrePoint=20;
	
	private String resltCompo="Cliquez sur enregistrere page pour valider votre Epreuve. cette action est irreversible !!!! ";
	
	
	
	public Map<Integer, List<Questions>> getQuestionPageCourante() {
		return questionPageCourante;
	}
	public void setQuestionPageCourante(
			Map<Integer, List<Questions>> questionPageCourante) {
		this.questionPageCourante = questionPageCourante;
	}
	public float getBareme() {
		return bareme;
	}
	public void setBareme(float bareme) {
		this.bareme = bareme;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	public int getNombrePoint() {
		return nombrePoint;
	}
	public void setNombrePoint(int nombrePoint) {
		this.nombrePoint = nombrePoint;
	}
	public List<String> getListeValeur() {
		return listeValeur;
	}
	public void setListeValeur(List<String> listeValeur) {
		this.listeValeur = listeValeur;
	}
	public Map<Integer, Questions> getQuestionQId() {
		return questionQId;
	}
	public void setQuestionQId(Map<Integer, Questions> questionQId) {
		this.questionQId = questionQId;
	}
	public List<Questions> getListeQSession() {
		return listeQSession;
	}
	public void setListeQSession(List<Questions> listeQSession) {
		this.listeQSession = listeQSession;
	}
	public String getId() {
		return id;
	}
	public String getCodeMatiere() {
		return codeMatiere;
	}
	public void setCodeMatiere(String codeMatiere) {
		this.codeMatiere = codeMatiere;
	}
	public String getIntituleMatiere() {
		return intituleMatiere;
	}
	public void setIntituleMatiere(String intituleMatiere) {
		this.intituleMatiere = intituleMatiere;
	}
	public List<String> getListeMSession() {
		return listeMSession;
	}
	public void setListeMSession(List<String> listeMSession) {
		this.listeMSession = listeMSession;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public String getCodeFiliere() {
		return codeFiliere;
	}
	public void setCodeFiliere(String codeFiliere) {
		this.codeFiliere = codeFiliere;
	}
	public ProfilEtudiant getProfilEtudiant() {
		return profilEtudiant;
	}
	public void setProfilEtudiant(ProfilEtudiant profilEtudiant) {
		this.profilEtudiant = profilEtudiant;
	}
	public List<Questions> getListeQPage() {
		return listeQPage;
	}
	public void setListeQPage(List<Questions> listeQPage) {
		this.listeQPage = listeQPage;
	}
	
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
	public int getNombrePage() {
		return nombrePage;
	}
	public void setNombrePage(int nombrePage) {
		this.nombrePage = nombrePage;
	}
	public List<Questions> getQuestionNonRepondu() {
		return questionNonRepondu;
	}
	public void setQuestionNonRepondu(List<Questions> questionNonRepondu) {
		this.questionNonRepondu = questionNonRepondu;
	}
	public Map<Questions,String> getQuestionRepondu() {
		return questionRepondu;
	}
	public void setQuestionRepondu(Map<Questions,String> questionRepondu) {
		this.questionRepondu = questionRepondu;
	}
	public Map<Questions,List<String>> getQuestionReponduDouble() {
		return questionReponduDouble;
	}
	public void setQuestionReponduDouble(Map<Questions,List<String>> questionReponduDouble) {
		this.questionReponduDouble = questionReponduDouble;
	}
	public int getNombreReponseJuste() {
		return nombreReponseJuste;
	}
	public void setNombreReponseJuste(int nombreReponseJuste) {
		this.nombreReponseJuste = nombreReponseJuste;
	}
	public String getResltCompo() {
		return resltCompo;
	}
	public void setResltCompo(String resltCompo) {
		this.resltCompo = resltCompo;
	}
	public String getConnecter() {
		return connecter;
	}
	public void setConnecter(String connecter) {
		this.connecter = connecter;
	}
	

}
