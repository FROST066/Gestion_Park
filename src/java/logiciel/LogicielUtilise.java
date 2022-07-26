/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logiciel;

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
@Table(name = "LOGICIEL_UTILISE", catalog = "Gestion_Park", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogicielUtilise.findAll", query = "SELECT l FROM LogicielUtilise l"),
    @NamedQuery(name = "LogicielUtilise.findByIdLogicielUtilise", query = "SELECT l FROM LogicielUtilise l WHERE l.idLogicielUtilise = :idLogicielUtilise")})
public class LogicielUtilise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_LOGICIEL_UTILISE", nullable = false)
    private Integer idLogicielUtilise;
    @JoinColumn(name = "ID_LOGICIEL", referencedColumnName = "ID_LOGICIEL", nullable = false)
    @ManyToOne(optional = false)
    private Logiciel idLogiciel;
    @JoinColumn(name = "MATRICULE", referencedColumnName = "MATRICULE", nullable = false)
    @ManyToOne(optional = false)
    private Employe matricule;

    public LogicielUtilise() {
        this(null, null);
    }

    public LogicielUtilise(Logiciel idLogiciel, Employe matricule) {
        this.idLogiciel = idLogiciel;
        this.matricule = matricule;
    }

    public Integer getIdLogicielUtilise() {
        return idLogicielUtilise;
    }

    public void setIdLogicielUtilise(Integer idLogicielUtilise) {
        this.idLogicielUtilise = idLogicielUtilise;
    }

    public Logiciel getIdLogiciel() {
        return idLogiciel;
    }

    public void setIdLogiciel(Logiciel idLogiciel) {
        this.idLogiciel = idLogiciel;
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
        hash += (idLogicielUtilise != null ? idLogicielUtilise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogicielUtilise)) {
            return false;
        }
        LogicielUtilise other = (LogicielUtilise) object;
        if ((this.idLogicielUtilise == null && other.idLogicielUtilise != null) || (this.idLogicielUtilise != null && !this.idLogicielUtilise.equals(other.idLogicielUtilise))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employe.LogicielUtilise[ idLogicielUtilise=" + idLogicielUtilise + " ]";
    }
    
}
