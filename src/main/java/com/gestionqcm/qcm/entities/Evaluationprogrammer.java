/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionqcm.qcm.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dany
 */
@Entity
@Table(name = "evaluationprogrammer")
@NamedQueries({
    @NamedQuery(name = "Evaluationprogrammer.findAll", query = "SELECT e FROM Evaluationprogrammer e"),
    @NamedQuery(name = "Evaluationprogrammer.findByCodeuv", query = "SELECT e FROM Evaluationprogrammer e WHERE e.evaluationprogrammerPK.codeuv = :codeuv"),
    @NamedQuery(name = "Evaluationprogrammer.findByCodeenseignant", query = "SELECT e FROM Evaluationprogrammer e WHERE e.evaluationprogrammerPK.codeenseignant = :codeenseignant"),
    @NamedQuery(name = "Evaluationprogrammer.findByDateevaluation", query = "SELECT e FROM Evaluationprogrammer e WHERE e.dateevaluation = :dateevaluation"),
    @NamedQuery(name = "Evaluationprogrammer.findByHeurevaluation", query = "SELECT e FROM Evaluationprogrammer e WHERE e.heurevaluation = :heurevaluation"),
    @NamedQuery(name = "Evaluationprogrammer.findByNombreheur", query = "SELECT e FROM Evaluationprogrammer e WHERE e.nombreheur = :nombreheur"),
    @NamedQuery(name = "Evaluationprogrammer.findByNombrequestion", query = "SELECT e FROM Evaluationprogrammer e WHERE e.nombrequestion = :nombrequestion"),
    @NamedQuery(name = "Evaluationprogrammer.deleteByCodeuv", query = "DELETE FROM Evaluationprogrammer e WHERE e.evaluationprogrammerPK.codeuv = :codeuv"),
})
public class Evaluationprogrammer implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EvaluationprogrammerPK evaluationprogrammerPK;
    @Basic(optional = false)
    @Column(name = "dateevaluation")
    @Temporal(TemporalType.DATE)
    private Date dateevaluation;
    @Basic(optional = false)
    @Column(name = "heurevaluation")
    private String heurevaluation;
    @Column(name = "nombreheur")
    private Integer nombreheur;
    @Basic(optional = false)
    @Column(name = "nombrequestion")
    private int nombrequestion;
    @JoinColumn(name = "codeenseignant", referencedColumnName = "codeenseignant", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Enseignant enseignant;
    @JoinColumn(name = "codeuv", referencedColumnName = "codeuv", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Matiere matiere;

    public Evaluationprogrammer() {
    }

    public Evaluationprogrammer(EvaluationprogrammerPK evaluationprogrammerPK) {
        this.evaluationprogrammerPK = evaluationprogrammerPK;
    }

    public Evaluationprogrammer(EvaluationprogrammerPK evaluationprogrammerPK, Date dateevaluation, String heurevaluation, int nombrequestion) {
        this.evaluationprogrammerPK = evaluationprogrammerPK;
        this.dateevaluation = dateevaluation;
        this.heurevaluation = heurevaluation;
        this.nombrequestion = nombrequestion;
    }

    public Evaluationprogrammer(String codeuv, String codeenseignant) {
        this.evaluationprogrammerPK = new EvaluationprogrammerPK(codeuv, codeenseignant);
    }

    public EvaluationprogrammerPK getEvaluationprogrammerPK() {
        return evaluationprogrammerPK;
    }

    public void setEvaluationprogrammerPK(EvaluationprogrammerPK evaluationprogrammerPK) {
        this.evaluationprogrammerPK = evaluationprogrammerPK;
    }

    public Date getDateevaluation() {
        return dateevaluation;
    }

    public void setDateevaluation(Date dateevaluation) {
        this.dateevaluation = dateevaluation;
    }

    public String getHeurevaluation() {
        return heurevaluation;
    }

    public void setHeurevaluation(String heurevaluation) {
        this.heurevaluation = heurevaluation;
    }

    public Integer getNombreheur() {
        return nombreheur;
    }

    public void setNombreheur(Integer nombreheur) {
        this.nombreheur = nombreheur;
    }

    public int getNombrequestion() {
        return nombrequestion;
    }

    public void setNombrequestion(int nombrequestion) {
        this.nombrequestion = nombrequestion;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
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
        hash += (evaluationprogrammerPK != null ? evaluationprogrammerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluationprogrammer)) {
            return false;
        }
        Evaluationprogrammer other = (Evaluationprogrammer) object;
        if ((this.evaluationprogrammerPK == null && other.evaluationprogrammerPK != null) || (this.evaluationprogrammerPK != null && !this.evaluationprogrammerPK.equals(other.evaluationprogrammerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Evaluationprogrammer[ evaluationprogrammerPK=" + evaluationprogrammerPK + " ]";
    }
    
}
