/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestionqcm.qcm.entities;

import java.io.Serializable;

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

/**
 *
 * @author dany
 */
@Entity
@Table(name = "choix")
@NamedQueries({
    @NamedQuery(name = "Choix.findAll", query = "SELECT c FROM Choix c"),
     @NamedQuery(name = "Choix.findByCodequestion", query = "SELECT c FROM Choix c WHERE c.codequestion.codequestion = :codequestion"),
    @NamedQuery(name = "Choix.findByNumchoix", query = "SELECT c FROM Choix c WHERE c.numchoix = :numchoix"),
    @NamedQuery(name = "Choix.findByLibelechoix", query = "SELECT c FROM Choix c WHERE c.libelechoix = :libelechoix"),
    @NamedQuery(name = "Choix.findByValeurchoix", query = "SELECT c FROM Choix c WHERE c.valeurchoix = :valeurchoix"),
    @NamedQuery(name = "Choix.deleteByNumchoix", query = "DELETE FROM Choix c WHERE c.numchoix = :numchoix"),
})
public class Choix implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numchoix")
    private Integer numchoix;
    @Basic(optional = false)
    @Column(name = "libelechoix")
    private String libelechoix;
    @Basic(optional = false)
    @Column(name = "valeurchoix")
    private String valeurchoix;
    @JoinColumn(name = "codequestion", referencedColumnName = "codequestion")
    @ManyToOne(optional = false)
    private Questions codequestion;

    public Choix() {
    }

    public Choix(Integer numchoix) {
        this.numchoix = numchoix;
    }

    public Choix(Integer numchoix, String libelechoix, String valeurchoix) {
        this.numchoix = numchoix;
        this.libelechoix = libelechoix;
        this.valeurchoix = valeurchoix;
    }

    public Integer getNumchoix() {
        return numchoix;
    }

    public void setNumchoix(Integer numchoix) {
        this.numchoix = numchoix;
    }

    public String getLibelechoix() {
        return libelechoix;
    }

    public void setLibelechoix(String libelechoix) {
        this.libelechoix = libelechoix;
    }

    public String getValeurchoix() {
        return valeurchoix;
    }

    public void setValeurchoix(String valeurchoix) {
        this.valeurchoix = valeurchoix;
    }

    public Questions getCodequestion() {
        return codequestion;
    }

    public void setCodequestion(Questions codequestion) {
        this.codequestion = codequestion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numchoix != null ? numchoix.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Choix)) {
            return false;
        }
        Choix other = (Choix) object;
        if ((this.numchoix == null && other.numchoix != null) || (this.numchoix != null && !this.numchoix.equals(other.numchoix))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Choix[ numchoix=" + numchoix + " ]";
    }
    
}
