/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionqcm.qcm.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author dany
 */
@SuppressWarnings("serial")
@Embeddable
public class EvaluationnotePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "matricule")
    private String matricule;
    @Basic(optional = false)
    @Column(name = "codeuv")
    private String codeuv;

    public EvaluationnotePK() {
    }

    public EvaluationnotePK(String matricule, String codeuv) {
        this.matricule = matricule;
        this.codeuv = codeuv;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getCodeuv() {
        return codeuv;
    }

    public void setCodeuv(String codeuv) {
        this.codeuv = codeuv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricule != null ? matricule.hashCode() : 0);
        hash += (codeuv != null ? codeuv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaluationnotePK)) {
            return false;
        }
        EvaluationnotePK other = (EvaluationnotePK) object;
        if ((this.matricule == null && other.matricule != null) || (this.matricule != null && !this.matricule.equals(other.matricule))) {
            return false;
        }
        if ((this.codeuv == null && other.codeuv != null) || (this.codeuv != null && !this.codeuv.equals(other.codeuv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.EvaluationnotePK[ matricule=" + matricule + ", codeuv=" + codeuv + " ]";
    }
    
}
