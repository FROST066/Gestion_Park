/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordinateur;

import employe.Employe;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "ORDINATEUR_UTILISE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdinateurUtilise.findAll", query = "SELECT o FROM OrdinateurUtilise o"),
    @NamedQuery(name = "OrdinateurUtilise.findByIdOrdinateurUtilise", query = "SELECT o FROM OrdinateurUtilise o WHERE o.idOrdinateurUtilise = :idOrdinateurUtilise")})
public class OrdinateurUtilise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ORDINATEUR_UTILISE", nullable = false)
    private Integer idOrdinateurUtilise;
    @JoinColumn(name = "ID_ORDINATEUR", referencedColumnName = "ID_ORDINATEUR", nullable = false)
    @ManyToOne(optional = false)
    private Ordinateur idOrdinateur;
    @JoinColumn(name = "MATRICULE", referencedColumnName = "MATRICULE", nullable = false)
    @ManyToOne(optional = false)
    private Employe matricule;

    public OrdinateurUtilise() {
        this(null, null);
    }

    public OrdinateurUtilise(Ordinateur idOrdinateur, Employe matricule) {
        this.idOrdinateur = idOrdinateur;
        this.matricule = matricule;
    }


    public Integer getIdOrdinateurUtilise() {
        return idOrdinateurUtilise;
    }

    public void setIdOrdinateurUtilise(Integer idOrdinateurUtilise) {
        this.idOrdinateurUtilise = idOrdinateurUtilise;
    }

    public Ordinateur getIdOrdinateur() {
        return idOrdinateur;
    }

    public void setIdOrdinateur(Ordinateur idOrdinateur) {
        this.idOrdinateur = idOrdinateur;
    }

    public Employe getMatricule() {
        return matricule;
    }

    public void setMatricule(Employe matricule) {
        this.matricule = matricule;
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
        if ((this.idOrdinateurUtilise == null && other.idOrdinateurUtilise != null) || (this.idOrdinateurUtilise != null && !this.idOrdinateurUtilise.equals(other.idOrdinateurUtilise))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ordinateur.OrdinateurUtilise[ idOrdinateurUtilise=" + idOrdinateurUtilise + " ]";
    }
    
}
