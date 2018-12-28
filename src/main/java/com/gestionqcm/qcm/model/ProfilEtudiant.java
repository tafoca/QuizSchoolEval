package com.gestionqcm.qcm.model;

import com.gestionqcm.qcm.entities.Etudiant;

public class ProfilEtudiant {
	private String nom;
	private String prenom;
	private String email;
	private String motpasse;
	private String matricule;
	private String filiere;
	private String newMotpasse,newMotpasse1;
	private String filiereNom;
	private String nationalite, region, departement, profession, sexe,
			datenaissance, statut,adminName;
	
	private String reponse;
	private String juste="OK";
	private String faux="Incoherence";
	
	private int nombreH,nombreQ;

	private Etudiant etudiant;

	private int tempsEcouler=0;
	private int tempsRestant= nombreH*3600000;
	
	
	private MatiereForm matiereForm =new MatiereForm();
	
	public void compteR()
	{
		for(int i=1;i<=nombreH*3600000;i+=10)	
		{
			tempsEcouler+=i;
			tempsRestant-=tempsEcouler;
		}
		
	}
	
	
	
	
	public String getJuste() {
		return juste;
	}




	public void setJuste(String juste) {
		this.juste = juste;
	}




	public String getFaux() {
		return faux;
	}




	public void setFaux(String faux) {
		this.faux = faux;
	}




	public String getNewMotpasse1() {
		return newMotpasse1;
	}




	public void setNewMotpasse1(String newMotpasse1) {
		this.newMotpasse1 = newMotpasse1;
	}




	public int getTempsEcouler() {
		return tempsEcouler;
	}

	public void setTempsEcouler(int tempsEcouler) {
		this.tempsEcouler = tempsEcouler;
	}

	public int getTempsRestant() {
		return tempsRestant;
	}

	public void setTempsRestant(int tempsRestant) {
		this.tempsRestant = tempsRestant;
	}

	public int getNombreH() {
		return nombreH;
	}

	public void setNombreH(int nombreH) {
		this.nombreH = nombreH;
	}

	public int getNombreQ() {
		return nombreQ;
	}

	public void setNombreQ(int nombreQ) {
		this.nombreQ = nombreQ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotpasse() {
		return motpasse;
	}

	public void setMotpasse(String motpasse) {
		this.motpasse = motpasse;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public String getNewMotpasse() {
		return newMotpasse;
	}

	public void setNewMotpasse(String newMotpasse) {
		this.newMotpasse = newMotpasse;
	}

	public String getFiliereNom() {
		return filiereNom;
	}

	public void setFiliereNom(String filiereNom) {
		this.filiereNom = filiereNom;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public MatiereForm getMatiereForm() {
		return matiereForm;
	}

	public void setMatiereForm(MatiereForm matiereForm) {
		this.matiereForm = matiereForm;
	}
	
	

}
