/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionqcm.qcm.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author dany
 */
@Entity
@Table(name = "evaluationnote")
@NamedQueries({
    @NamedQuery(name = "Evaluationnote.findAll", query = "SELECT e FROM Evaluationnote e"),
    @NamedQuery(name = "Evaluationnote.findByMatricule", query = "SELECT e FROM Evaluationnote e WHERE e.evaluationnotePK.matricule = :matricule"),
    @NamedQuery(name = "Evaluationnote.findByCodeuv", query = "SELECT e FROM Evaluationnote e WHERE e.evaluationnotePK.codeuv = :codeuv"),
    @NamedQuery(name = "Evaluationnote.findByNotes", query = "SELECT e FROM Evaluationnote e WHERE e.notes = :notes"),
    @NamedQuery(name = "Evaluationnote.findByAnnee", query = "SELECT e FROM Evaluationnote e WHERE e.annee = :annee"),
    @NamedQuery(name = "Evaluationnote.findBySessione", query = "SELECT e FROM Evaluationnote e WHERE e.sessione = :sessione"),
    @NamedQuery(name = "Evaluationnote.findByMatriculeCodeuv", query = "SELECT e FROM Evaluationnote e WHERE e.evaluationnotePK.matricule = :matricule and e.evaluationnotePK.codeuv = :codeuv"),})
public class Evaluationnote implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EvaluationnotePK evaluationnotePK;
    @Basic(optional = false)
    @Column(name = "notes")
    private float notes;
    @Basic(optional = false)
    @Column(name = "annee")
    private String annee;
    @Basic(optional = false)
    @Column(name = "sessione")
    private String sessione;
    @JoinColumn(name = "matricule", referencedColumnName = "matricule", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Etudiant etudiant;
    @JoinColumn(name = "codeuv", referencedColumnName = "codeuv", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Matiere matiere;

    public Evaluationnote() {
    }

    public Evaluationnote(EvaluationnotePK evaluationnotePK) {
        this.evaluationnotePK = evaluationnotePK;
    }

    public Evaluationnote(EvaluationnotePK evaluationnotePK, float notes, String annee, String sessione) {
        this.evaluationnotePK = evaluationnotePK;
        this.notes = notes;
        this.annee = annee;
        this.sessione = sessione;
    }

    public Evaluationnote(String matricule, String codeuv) {
        this.evaluationnotePK = new EvaluationnotePK(matricule, codeuv);
    }

    public EvaluationnotePK getEvaluationnotePK() {
        return evaluationnotePK;
    }

    public void setEvaluationnotePK(EvaluationnotePK evaluationnotePK) {
        this.evaluationnotePK = evaluationnotePK;
    }

    public float getNotes() {
        return notes;
    }

    public void setNotes(float notes) {
        this.notes = notes;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evaluationnotePK != null ? evaluationnotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluationnote)) {
            return false;
        }
        Evaluationnote other = (Evaluationnote) object;
        if ((this.evaluationnotePK == null && other.evaluationnotePK != null) || (this.evaluationnotePK != null && !this.evaluationnotePK.equals(other.evaluationnotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Evaluationnote[ evaluationnotePK=" + evaluationnotePK + " ]";
    }
    
}
