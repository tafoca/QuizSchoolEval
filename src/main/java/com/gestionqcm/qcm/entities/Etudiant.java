/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionqcm.qcm.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dany
 */
@Entity
@Table(name = "etudiant")
@NamedQueries({
    @NamedQuery(name = "Etudiant.findAll", query = "SELECT e FROM Etudiant e"),
    @NamedQuery(name = "Etudiant.findByMatricule", query = "SELECT e FROM Etudiant e WHERE e.matricule = :matricule"),
    @NamedQuery(name = "Etudiant.findByMatriculeMotPasse", query = "SELECT e FROM Etudiant e WHERE e.matricule = :matricule and e.motpasse = :motpasse"),
    @NamedQuery(name = "Etudiant.findByNometudiant", query = "SELECT e FROM Etudiant e WHERE e.nometudiant = :nometudiant"),
    @NamedQuery(name = "Etudiant.findByPrenometudiant", query = "SELECT e FROM Etudiant e WHERE e.prenometudiant = :prenometudiant"),
    @NamedQuery(name = "Etudiant.findByEmail", query = "SELECT e FROM Etudiant e WHERE e.email = :email"),
    @NamedQuery(name = "Etudiant.findByDatenaissance", query = "SELECT e FROM Etudiant e WHERE e.datenaissance = :datenaissance"),
    @NamedQuery(name = "Etudiant.findByNationalite", query = "SELECT e FROM Etudiant e WHERE e.nationalite = :nationalite"),
    @NamedQuery(name = "Etudiant.findByRegion", query = "SELECT e FROM Etudiant e WHERE e.region = :region"),
    @NamedQuery(name = "Etudiant.findByDepartement", query = "SELECT e FROM Etudiant e WHERE e.departement = :departement"),
    @NamedQuery(name = "Etudiant.findByStatut", query = "SELECT e FROM Etudiant e WHERE e.statut = :statut"),
    @NamedQuery(name = "Etudiant.findBySexe", query = "SELECT e FROM Etudiant e WHERE e.sexe = :sexe"),
    @NamedQuery(name = "Etudiant.findByProfession", query = "SELECT e FROM Etudiant e WHERE e.profession = :profession")})
public class Etudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "matricule")
    private String matricule;
    @Basic(optional = false)
    @Column(name = "nometudiant")
    private String nometudiant;
    @Column(name = "prenometudiant")
    private String prenometudiant;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "motpasse")
    private String motpasse;
    @Column(name = "datenaissance")
    @Temporal(TemporalType.DATE)
    private Date datenaissance;
    @Column(name = "nationalite")
    private String nationalite;
    @Column(name = "region")
    private String region;
    @Column(name = "departement")
    private String departement;
    @Column(name = "statut")
    private String statut;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "profession")
    private String profession;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matricule")
    private List<Suggestion> suggestionList;
    @JoinColumn(name = "codefiliere", referencedColumnName = "codefiliere")
    @ManyToOne(optional = false)
    private Filiere codefiliere;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private List<Evaluationnote> evaluationnoteList;

    public Etudiant() {
    }

    public Etudiant(String matricule) {
        this.matricule = matricule;
    }

    public Etudiant(String matricule, String nometudiant, String email, String motpasse) {
        this.matricule = matricule;
        this.nometudiant = nometudiant;
        this.email = email;
        this.motpasse = motpasse;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNometudiant() {
        return nometudiant;
    }

    public void setNometudiant(String nometudiant) {
        this.nometudiant = nometudiant;
    }

    public String getPrenometudiant() {
        return prenometudiant;
    }

    public void setPrenometudiant(String prenometudiant) {
        this.prenometudiant = prenometudiant;
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

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
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

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public List<Suggestion> getSuggestionList() {
        return suggestionList;
    }

    public void setSuggestionList(List<Suggestion> suggestionList) {
        this.suggestionList = suggestionList;
    }

    public Filiere getCodefiliere() {
        return codefiliere;
    }

    public void setCodefiliere(Filiere codefiliere) {
        this.codefiliere = codefiliere;
    }

    public List<Evaluationnote> getEvaluationnoteList() {
        return evaluationnoteList;
    }

    public void setEvaluationnoteList(List<Evaluationnote> evaluationnoteList) {
        this.evaluationnoteList = evaluationnoteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricule != null ? matricule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.matricule == null && other.matricule != null) || (this.matricule != null && !this.matricule.equals(other.matricule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Etudiant[ matricule=" + matricule + " ]";
    }
    
}
