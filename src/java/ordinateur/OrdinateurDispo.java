/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordinateur;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import java.io.Serializable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "ORDINATEUR_DISPO")
public class OrdinateurDispo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDINATEUR_DISPO", nullable = false)
    private Integer idOrdinateurDispo;
    @Column(name = "ID_ORDINATEUR", nullable = false)
    private int idOrdinateur;

    public int getIdOrdinateur() {
        return idOrdinateur;
    }

    @ManyToOne
    @JoinColumn(name = "ID_ORDINATEUR", nullable = false, insertable = false, updatable = false)
    private Ordinateur ordinateur;

    public Ordinateur getOrdinateur() {
        return ordinateur;
    }

    public OrdinateurDispo() {
    }

    public OrdinateurDispo(Integer idOrdinateurDispo) {
        this.idOrdinateurDispo = idOrdinateurDispo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdinateurDispo != null ? idOrdinateurDispo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdinateurDispo)) {
            return false;
        }
        OrdinateurDispo other = (OrdinateurDispo) object;
        return !((this.idOrdinateurDispo == null && other.idOrdinateurDispo != null) || (this.idOrdinateurDispo != null && !this.idOrdinateurDispo.equals(other.idOrdinateurDispo)));
    }

    @Override
    public String toString() {
        return "servlet.OrdinateurDispo[ idOrdinateurDispo=" + idOrdinateurDispo + " ]";
    }

}
