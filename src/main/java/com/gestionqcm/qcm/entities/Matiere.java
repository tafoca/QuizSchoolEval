/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionqcm.qcm.entities;

import java.io.Serializable;
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

/**
 *
 * @author dany
 */
@Entity
@Table(name = "matiere")
@NamedQueries({
    @NamedQuery(name = "Matiere.findAll", query = "SELECT m FROM Matiere m"),
    @NamedQuery(name = "Matiere.findByCodeuv", query = "SELECT m FROM Matiere m WHERE m.codeuv = :codeuv"),
    @NamedQuery(name = "Matiere.findByCodeFiliere", query = "SELECT m FROM Matiere m WHERE m.codefiliere.codefiliere = :codefiliere"),

    @NamedQuery(name = "Matiere.findByIntitule", query = "SELECT m FROM Matiere m WHERE m.intitule = :intitule"),
    @NamedQuery(name = "Matiere.findByCredit", query = "SELECT m FROM Matiere m WHERE m.credit = :credit")})
public class Matiere implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codeuv")
    private String codeuv;
    @Basic(optional = false)
    @Column(name = "intitule")
    private String intitule;
    @Basic(optional = false)
    @Column(name = "credit")
    private int credit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matiere")
    private List<Evaluationprogrammer> evaluationprogrammerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeuv")
    private List<Questions> questionsList;
    @OneToMany(mappedBy = "codematiere")
    private List<Sujet> sujetList;
    @JoinColumn(name = "codefiliere", referencedColumnName = "codefiliere")
    @ManyToOne(optional = false)
    private Filiere codefiliere;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matiere")
    private List<Evaluationnote> evaluationnoteList;

    public Matiere() {
    }

    public Matiere(String codeuv) {
        this.codeuv = codeuv;
    }

    public Matiere(String codeuv, String intitule, int credit) {
        this.codeuv = codeuv;
        this.intitule = intitule;
        this.credit = credit;
    }

    public String getCodeuv() {
        return codeuv;
    }

    public void setCodeuv(String codeuv) {
        this.codeuv = codeuv;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    
    public List<Evaluationprogrammer> getEvaluationprogrammerList() {
        return evaluationprogrammerList;
    }

    public void setEvaluationprogrammerList(List<Evaluationprogrammer> evaluationprogrammerList) {
        this.evaluationprogrammerList = evaluationprogrammerList;
    }

    
    public List<Questions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Questions> questionsList) {
        this.questionsList = questionsList;
    }

    
    public List<Sujet> getSujetList() {
        return sujetList;
    }

    public void setSujetList(List<Sujet> sujetList) {
        this.sujetList = sujetList;
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
        hash += (codeuv != null ? codeuv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matiere)) {
            return false;
        }
        Matiere other = (Matiere) object;
        if ((this.codeuv == null && other.codeuv != null) || (this.codeuv != null && !this.codeuv.equals(other.codeuv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Matiere[ codeuv=" + codeuv + " ]";
    }
    
}
