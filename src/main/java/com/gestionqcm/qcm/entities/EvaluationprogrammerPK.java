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
public class EvaluationprogrammerPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codeuv")
    private String codeuv;
    @Basic(optional = false)
    @Column(name = "codeenseignant")
    private String codeenseignant;

    public EvaluationprogrammerPK() {
    }

    public EvaluationprogrammerPK(String codeuv, String codeenseignant) {
        this.codeuv = codeuv;
        this.codeenseignant = codeenseignant;
    }

    public String getCodeuv() {
        return codeuv;
    }

    public void setCodeuv(String codeuv) {
        this.codeuv = codeuv;
    }

    public String getCodeenseignant() {
        return codeenseignant;
    }

    public void setCodeenseignant(String codeenseignant) {
        this.codeenseignant = codeenseignant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeuv != null ? codeuv.hashCode() : 0);
        hash += (codeenseignant != null ? codeenseignant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaluationprogrammerPK)) {
            return false;
        }
        EvaluationprogrammerPK other = (EvaluationprogrammerPK) object;
        if ((this.codeuv == null && other.codeuv != null) || (this.codeuv != null && !this.codeuv.equals(other.codeuv))) {
            return false;
        }
        if ((this.codeenseignant == null && other.codeenseignant != null) || (this.codeenseignant != null && !this.codeenseignant.equals(other.codeenseignant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.EvaluationprogrammerPK[ codeuv=" + codeuv + ", codeenseignant=" + codeenseignant + " ]";
    }
    
}
