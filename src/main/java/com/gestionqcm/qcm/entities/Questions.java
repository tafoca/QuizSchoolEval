/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionqcm.qcm.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

/**
 *
 * @author dany
 */
@Entity
@Table(name = "questions")
@NamedQueries({
    @NamedQuery(name = "Questions.findAll", query = "SELECT q FROM Questions q"),
    @NamedQuery(name = "Questions.findByCodequestion", query = "SELECT q FROM Questions q WHERE q.codequestion = :codequestion"),
    @NamedQuery(name = "Questions.findByCodeuv", query = "SELECT q FROM Questions q WHERE q.codeuv.codeuv = :codeuv1"),
    @NamedQuery(name = "Questions.findByLibelequestion", query = "SELECT q FROM Questions q WHERE q.libelequestion = :libelequestion"),
    @NamedQuery(name = "Questions.deleteByCodequestion", query = "DELETE FROM Questions q WHERE q.codequestion = :codequestion"),
    @NamedQuery(name = "Questions.findByNombrereponse", query = "SELECT q FROM Questions q WHERE q.nombrereponse = :nombrereponse")
})
public class Questions implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codequestion")
    private List<Choix> choixList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codequestion")
    private Integer codequestion;
    @Basic(optional = false)
    @Column(name = "libelequestion")
    private String libelequestion;
    @Column(name = "nombrereponse")
    private Integer nombrereponse;
    @JoinColumn(name = "codeuv", referencedColumnName = "codeuv")
    @ManyToOne(optional = false)
    private Matiere codeuv;
    
    
    private transient List<String> choixMap=new ArrayList<String>();
    private transient List<String> checkChoixMap=new ArrayList<String>();
    private transient Map<String,String> choixValeur=new HashMap<String, String>();
    
    
    
    
    
    
    public Map<String, String> getChoixValeur() {
		return choixValeur;
	}

	public void setChoixValeur(Map<String, String> choixValeur) {
		this.choixValeur = choixValeur;
	}

	public List<String> getCheckChoixMap() {
		return checkChoixMap;
	}

	public void setCheckChoixMap(List<String> checkChoixMap) {
		this.checkChoixMap = checkChoixMap;
	}

	public List<String> getChoixMap() {
		return choixMap;
	}

	public void setChoixMap(List<String> choixMap) {
		this.choixMap = choixMap;
	}

	public Questions() {
    }

    public Questions(Integer codequestion) {
        this.codequestion = codequestion;
    }

    public Questions(Integer codequestion, String libelequestion) {
        this.codequestion = codequestion;
        this.libelequestion = libelequestion;
    }

    public Integer getCodequestion() {
        return codequestion;
    }

    public void setCodequestion(Integer codequestion) {
        this.codequestion = codequestion;
    }

    public String getLibelequestion() {
        return libelequestion;
    }

    public void setLibelequestion(String libelequestion) {
        this.libelequestion = libelequestion;
    }

    public Integer getNombrereponse() {
        return nombrereponse;
    }

    public void setNombrereponse(Integer nombrereponse) {
        this.nombrereponse = nombrereponse;
    }

    public Matiere getCodeuv() {
        return codeuv;
    }

    public void setCodeuv(Matiere codeuv) {
        this.codeuv = codeuv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codequestion != null ? codequestion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.codequestion == null && other.codequestion != null) || (this.codequestion != null && !this.codequestion.equals(other.codequestion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Questions[ codequestion=" + codequestion + " ]";
    }

    public List<Choix> getChoixList() {
        return choixList;
    }

    public void setChoixList(List<Choix> choixList) {
        this.choixList = choixList;
    }
    
}
