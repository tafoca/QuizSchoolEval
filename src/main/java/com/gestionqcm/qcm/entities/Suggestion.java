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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "suggestion")
@NamedQueries({
    @NamedQuery(name = "Suggestion.findAll", query = "SELECT s FROM Suggestion s"),
    @NamedQuery(name = "Suggestion.findByMatricule", query = "SELECT s FROM Suggestion s WHERE s.matricule = :matricule"),

    @NamedQuery(name = "Suggestion.findByCodesuggestion", query = "SELECT s FROM Suggestion s WHERE s.codesuggestion = :codesuggestion"),
    @NamedQuery(name = "Suggestion.findByObjet", query = "SELECT s FROM Suggestion s WHERE s.objet = :objet"),
    @NamedQuery(name = "Suggestion.findByDatesuggestion", query = "SELECT s FROM Suggestion s WHERE s.datesuggestion = :datesuggestion")})
public class Suggestion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codesuggestion")
    private Integer codesuggestion;
    @Basic(optional = false)
    @Column(name = "objet")
    private String objet;
    @Basic(optional = false)
    @Column(name = "datesuggestion")
    @Temporal(TemporalType.DATE)
    private Date datesuggestion;
    @JoinColumn(name = "matricule", referencedColumnName = "matricule")
    @ManyToOne(optional = false)
    private Etudiant matricule;

    public Suggestion() {
    }

    public Suggestion(Integer codesuggestion) {
        this.codesuggestion = codesuggestion;
    }

    public Suggestion(Integer codesuggestion, String objet, Date datesuggestion) {
        this.codesuggestion = codesuggestion;
        this.objet = objet;
        this.datesuggestion = datesuggestion;
    }

    public Integer getCodesuggestion() {
        return codesuggestion;
    }

    public void setCodesuggestion(Integer codesuggestion) {
        this.codesuggestion = codesuggestion;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Date getDatesuggestion() {
        return datesuggestion;
    }

    public void setDatesuggestion(Date datesuggestion) {
        this.datesuggestion = datesuggestion;
    }

    public Etudiant getMatricule() {
        return matricule;
    }

    public void setMatricule(Etudiant matricule) {
        this.matricule = matricule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codesuggestion != null ? codesuggestion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Suggestion)) {
            return false;
        }
        Suggestion other = (Suggestion) object;
        if ((this.codesuggestion == null && other.codesuggestion != null) || (this.codesuggestion != null && !this.codesuggestion.equals(other.codesuggestion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Suggestion[ codesuggestion=" + codesuggestion + " ]";
    }
    
}
