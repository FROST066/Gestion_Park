/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autres;

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
@Table(name = "AUTRES_UTILISE", catalog = "Gestion_Park", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AutresUtilise.findAll", query = "SELECT a FROM AutresUtilise a"),
    @NamedQuery(name = "AutresUtilise.findByIdAutresUtilise", query = "SELECT a FROM AutresUtilise a WHERE a.idAutresUtilise = :idAutresUtilise")})
public class AutresUtilise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_AUTRES_UTILISE", nullable = false)
    private Integer idAutresUtilise;
    @JoinColumn(name = "ID_AUTRES", referencedColumnName = "ID_AUTRES", nullable = false)
    @ManyToOne(optional = false)
    private Autres idAutres;
    @JoinColumn(name = "MATRICULE", referencedColumnName = "MATRICULE", nullable = false)
    @ManyToOne(optional = false)
    private Employe matricule;

    public AutresUtilise() {
        this(null, null);
    }

    public AutresUtilise(Autres idAutres, Employe matricule) {
        this.idAutres = idAutres;
        this.matricule = matricule;
    }

    public Integer getIdAutresUtilise() {
        return idAutresUtilise;
    }

    public void setIdAutresUtilise(Integer idAutresUtilise) {
        this.idAutresUtilise = idAutresUtilise;
    }

    public Autres getIdAutres() {
        return idAutres;
    }

    public void setIdAutres(Autres idAutres) {
        this.idAutres = idAutres;
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
        hash += (idAutresUtilise != null ? idAutresUtilise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AutresUtilise)) {
            return false;
        }
        AutresUtilise other = (AutresUtilise) object;
        if ((this.idAutresUtilise == null && other.idAutresUtilise != null) || (this.idAutresUtilise != null && !this.idAutresUtilise.equals(other.idAutresUtilise))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employe.AutresUtilise[ idAutresUtilise=" + idAutresUtilise + " ]";
    }
    
}
