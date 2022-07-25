/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordinateur;

import employe.Employe;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "ORDINATEUR_UTILISE")

public class OrdinateurUtilise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDINATEUR_UTILISE")
    private Integer idOrdinateurUtilise;
    @Column(name = "ID_ORDINATEUR")
    private int idOrdinateur;
    private int matricule;

    public OrdinateurUtilise() {
        this(0, 0);
    }

    public Integer getIdOrdinateurUtilise() {
        return idOrdinateurUtilise;
    }

    public int getIdOrdinateur() {
        return idOrdinateur;
    }

    public void setIdOrdinateur(int idOrdinateur) {
        this.idOrdinateur = idOrdinateur;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "MATRICULE", nullable = false, insertable = false, updatable = false)
    private Employe employe;

    public Employe getEmploye() {
        return employe;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_ORDINATEUR", nullable = false, insertable = false, updatable = false)
    private Ordinateur ordinateur;

    public Ordinateur getOrdinateur() {
        return ordinateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdinateurUtilise != null ? idOrdinateurUtilise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdinateurUtilise)) {
            return false;
        }
        OrdinateurUtilise other = (OrdinateurUtilise) object;
        return !((this.idOrdinateurUtilise == null && other.idOrdinateurUtilise != null) || (this.idOrdinateurUtilise != null && !this.idOrdinateurUtilise.equals(other.idOrdinateurUtilise)));
    }

    public OrdinateurUtilise(int idOrdinateur, int matricule) {
        this.idOrdinateur = idOrdinateur;
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "TEST.OrdinateurUtilise[ idOrdinateurUtilise=" + idOrdinateurUtilise + " ]";
    }

}
