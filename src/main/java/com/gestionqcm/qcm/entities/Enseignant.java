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
@Table(name = "enseignant")
@NamedQueries({
    @NamedQuery(name = "Enseignant.findAll", query = "SELECT e FROM Enseignant e"),
    @NamedQuery(name = "Enseignant.findByCodeenseignant", query = "SELECT e FROM Enseignant e WHERE e.codeenseignant = :codeenseignant"),
    @NamedQuery(name = "Enseignant.findByCodeenseignantMotpasse", query = "SELECT e FROM Enseignant e WHERE e.codeenseignant = :codeenseignant and e.motpasse = :motpasse"),
    @NamedQuery(name = "Enseignant.findByRole", query = "SELECT e FROM Enseignant e WHERE e.codeenseignant = :codeenseignant and e.motpasse = :motpasse and e.role = :role"),
    @NamedQuery(name = "Enseignant.findByNomenseignant", query = "SELECT e FROM Enseignant e WHERE e.nomenseignant = :nomenseignant"),
    @NamedQuery(name = "Enseignant.findByPrenomenseignant", query = "SELECT e FROM Enseignant e WHERE e.prenomenseignant = :prenomenseignant"),
    @NamedQuery(name = "Enseignant.findByEmail", query = "SELECT e FROM Enseignant e WHERE e.email = :email"),
    @NamedQuery(name = "Enseignant.findByDatenaissance", query = "SELECT e FROM Enseignant e WHERE e.datenaissance = :datenaissance"),
    @NamedQuery(name = "Enseignant.findByNationalite", query = "SELECT e FROM Enseignant e WHERE e.nationalite = :nationalite"),
    @NamedQuery(name = "Enseignant.findByRegion", query = "SELECT e FROM Enseignant e WHERE e.region = :region"),
    @NamedQuery(name = "Enseignant.findByDepartement", query = "SELECT e FROM Enseignant e WHERE e.departement = :departement"),
    @NamedQuery(name = "Enseignant.findByStatut", query = "SELECT e FROM Enseignant e WHERE e.statut = :statut"),
    @NamedQuery(name = "Enseignant.findByProfession", query = "SELECT e FROM Enseignant e WHERE e.profession = :profession"),
    @NamedQuery(name = "Enseignant.findBySexe", query = "SELECT e FROM Enseignant e WHERE e.sexe = :sexe")})
public class Enseignant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codeenseignant")
    private String codeenseignant;
    @Basic(optional = false)
    @Column(name = "nomenseignant")
    private String nomenseignant;
    @Column(name = "prenomenseignant")
    private String prenomenseignant;
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
    @Column(name = "profession")
    private String profession;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "role")
    private String role;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enseignant")
    private List<Evaluationprogrammer> evaluationprogrammerList;

    public Enseignant() {
    }

    public Enseignant(String codeenseignant) {
        this.codeenseignant = codeenseignant;
    }

    public Enseignant(String codeenseignant, String nomenseignant, String email, String motpasse) {
        this.codeenseignant = codeenseignant;
        this.nomenseignant = nomenseignant;
        this.email = email;
        this.motpasse = motpasse;
    }

    public String getCodeenseignant() {
        return codeenseignant;
    }

    public void setCodeenseignant(String codeenseignant) {
        this.codeenseignant = codeenseignant;
    }

    public String getNomenseignant() {
        return nomenseignant;
    }

    public void setNomenseignant(String nomenseignant) {
        this.nomenseignant = nomenseignant;
    }

    public String getPrenomenseignant() {
        return prenomenseignant;
    }

    public void setPrenomenseignant(String prenomenseignant) {
        this.prenomenseignant = prenomenseignant;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Evaluationprogrammer> getEvaluationprogrammerList() {
        return evaluationprogrammerList;
    }

    public void setEvaluationprogrammerList(List<Evaluationprogrammer> evaluationprogrammerList) {
        this.evaluationprogrammerList = evaluationprogrammerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeenseignant != null ? codeenseignant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enseignant)) {
            return false;
        }
        Enseignant other = (Enseignant) object;
        if ((this.codeenseignant == null && other.codeenseignant != null) || (this.codeenseignant != null && !this.codeenseignant.equals(other.codeenseignant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Enseignant[ codeenseignant=" + codeenseignant + " ]";
    }
    
}
