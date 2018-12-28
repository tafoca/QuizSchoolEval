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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dany
 */
@Entity
@Table(name = "questionouverte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Questionouverte.findAll", query = "SELECT q FROM Questionouverte q"),
    @NamedQuery(name = "Questionouverte.findByCodeouvert", query = "SELECT q FROM Questionouverte q WHERE q.codeouvert = :codeouvert"),
    @NamedQuery(name = "Questionouverte.findByCodesujet", query = "SELECT q FROM Questionouverte q WHERE q.codesujet.codesujet = :codesujet"),

    @NamedQuery(name = "Questionouverte.findByLibeleouvert", query = "SELECT q FROM Questionouverte q WHERE q.libeleouvert = :libeleouvert"),
    @NamedQuery(name = "Questionouverte.findByReponseouvert", query = "SELECT q FROM Questionouverte q WHERE q.reponseouvert = :reponseouvert")})
public class Questionouverte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codeouvert")
    private Integer codeouvert;
    @Column(name = "libeleouvert")
    private String libeleouvert;
    @Column(name = "reponseouvert")
    private String reponseouvert;
    @JoinColumn(name = "codesujet", referencedColumnName = "codesujet")
    @ManyToOne(optional = false)
    private Sujet codesujet;

    public Questionouverte() {
    }

    public Questionouverte(Integer codeouvert) {
        this.codeouvert = codeouvert;
    }

    public Integer getCodeouvert() {
        return codeouvert;
    }

    public void setCodeouvert(Integer codeouvert) {
        this.codeouvert = codeouvert;
    }

    public String getLibeleouvert() {
        return libeleouvert;
    }

    public void setLibeleouvert(String libeleouvert) {
        this.libeleouvert = libeleouvert;
    }

    public String getReponseouvert() {
        return reponseouvert;
    }

    public void setReponseouvert(String reponseouvert) {
        this.reponseouvert = reponseouvert;
    }

    public Sujet getCodesujet() {
        return codesujet;
    }

    public void setCodesujet(Sujet codesujet) {
        this.codesujet = codesujet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeouvert != null ? codeouvert.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questionouverte)) {
            return false;
        }
        Questionouverte other = (Questionouverte) object;
        if ((this.codeouvert == null && other.codeouvert != null) || (this.codeouvert != null && !this.codeouvert.equals(other.codeouvert))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gestionqcm.qcm.entities.Questionouverte[ codeouvert=" + codeouvert + " ]";
    }
    
}
