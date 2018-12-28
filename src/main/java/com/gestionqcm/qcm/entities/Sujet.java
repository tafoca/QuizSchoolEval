package com.gestionqcm.qcm.entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author dany
 */
@Entity
@Table(name = "sujet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sujet.findAll", query = "SELECT s FROM Sujet s"),
    @NamedQuery(name = "Sujet.findByCodesujet", query = "SELECT s FROM Sujet s WHERE s.codesujet = :codesujet"),
    @NamedQuery(name = "Sujet.findByCodematiere", query = "SELECT s FROM Sujet s WHERE s.codematiere.codeuv = :codeuv"),

    @NamedQuery(name = "Sujet.findByEnoncer", query = "SELECT s FROM Sujet s WHERE s.enoncer = :enoncer")})
public class Sujet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codesujet")
    private Integer codesujet;
    @Column(name = "enoncer")
    private String enoncer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codesujet")
    private List<Questionouverte> questionouverteList;
    @JoinColumn(name = "codematiere", referencedColumnName = "codeuv")
    @ManyToOne(optional = false)
    private Matiere codematiere;

    public Sujet() {
    }

    public Sujet(Integer codesujet) {
        this.codesujet = codesujet;
    }

    public Integer getCodesujet() {
        return codesujet;
    }

    public void setCodesujet(Integer codesujet) {
        this.codesujet = codesujet;
    }

    public String getEnoncer() {
        return enoncer;
    }

    public void setEnoncer(String enoncer) {
        this.enoncer = enoncer;
    }

    @XmlTransient
    public List<Questionouverte> getQuestionouverteList() {
        return questionouverteList;
    }

    public void setQuestionouverteList(List<Questionouverte> questionouverteList) {
        this.questionouverteList = questionouverteList;
    }

    public Matiere getCodematiere() {
        return codematiere;
    }

    public void setCodematiere(Matiere codematiere) {
        this.codematiere = codematiere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codesujet != null ? codesujet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sujet)) {
            return false;
        }
        Sujet other = (Sujet) object;
        if ((this.codesujet == null && other.codesujet != null) || (this.codesujet != null && !this.codesujet.equals(other.codesujet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Sujet[ codesujet=" + codesujet + " ]";
    }
    
}
