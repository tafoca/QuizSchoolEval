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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author dany
 */
@Entity
@Table(name = "filiere")
@NamedQueries({
    @NamedQuery(name = "Filiere.findAll", query = "SELECT f FROM Filiere f"),
    @NamedQuery(name = "Filiere.findByCodefiliere", query = "SELECT f FROM Filiere f WHERE f.codefiliere = :codefiliere"),
    @NamedQuery(name = "Filiere.findByDesignation", query = "SELECT f FROM Filiere f WHERE f.designation = :designation")})
public class Filiere implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codefiliere")
    private String codefiliere;
    @Basic(optional = false)
    @Column(name = "designation")
    private String designation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codefiliere")
    private List<Etudiant> etudiantList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codefiliere")
    private List<Matiere> matiereList;

    public Filiere() {
    }

    public Filiere(String codefiliere) {
        this.codefiliere = codefiliere;
    }

    public Filiere(String codefiliere, String designation) {
        this.codefiliere = codefiliere;
        this.designation = designation;
    }

    public String getCodefiliere() {
        return codefiliere;
    }

    public void setCodefiliere(String codefiliere) {
        this.codefiliere = codefiliere;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<Etudiant> getEtudiantList() {
        return etudiantList;
    }

    public void setEtudiantList(List<Etudiant> etudiantList) {
        this.etudiantList = etudiantList;
    }

    public List<Matiere> getMatiereList() {
        return matiereList;
    }

    public void setMatiereList(List<Matiere> matiereList) {
        this.matiereList = matiereList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codefiliere != null ? codefiliere.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filiere)) {
            return false;
        }
        Filiere other = (Filiere) object;
        if ((this.codefiliere == null && other.codefiliere != null) || (this.codefiliere != null && !this.codefiliere.equals(other.codefiliere))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Filiere[ codefiliere=" + codefiliere + " ]";
    }
    
}
