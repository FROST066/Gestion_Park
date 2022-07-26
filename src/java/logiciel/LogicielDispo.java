/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logiciel;

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
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "LOGICIEL_DISPO", catalog = "Gestion_Park", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogicielDispo.findAll", query = "SELECT l FROM LogicielDispo l"),
    @NamedQuery(name = "LogicielDispo.findByIdLogicielDispo", query = "SELECT l FROM LogicielDispo l WHERE l.idLogicielDispo = :idLogicielDispo")})
public class LogicielDispo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_LOGICIEL_DISPO", nullable = false)
    private Integer idLogicielDispo;

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }
    @Basic(optional = false)
    @Column(name = "DATE_LIVRAISON", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLivraison;
    @JoinColumn(name = "ID_LOGICIEL", referencedColumnName = "ID_LOGICIEL", nullable = false)
    @ManyToOne(optional = false)
    private Logiciel idLogiciel;

    public LogicielDispo() {
    }

    public LogicielDispo(Integer idLogicielDispo) {
        this.idLogicielDispo = idLogicielDispo;
    }

    public Integer getIdLogicielDispo() {
        return idLogicielDispo;
    }

    public void setIdLogicielDispo(Integer idLogicielDispo) {
        this.idLogicielDispo = idLogicielDispo;
    }

    public Logiciel getIdLogiciel() {
        return idLogiciel;
    }

    public void setIdLogiciel(Logiciel idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogicielDispo != null ? idLogicielDispo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogicielDispo)) {
            return false;
        }
        LogicielDispo other = (LogicielDispo) object;
        if ((this.idLogicielDispo == null && other.idLogicielDispo != null) || (this.idLogicielDispo != null && !this.idLogicielDispo.equals(other.idLogicielDispo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employe.LogicielDispo[ idLogicielDispo=" + idLogicielDispo + " ]";
    }
    
}
