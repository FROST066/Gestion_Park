/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordinateur;

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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "ORDINATEUR_DISPO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdinateurDispo.findAll", query = "SELECT o FROM OrdinateurDispo o"),
    @NamedQuery(name = "OrdinateurDispo.findByIdOrdinateurDispo", query = "SELECT o FROM OrdinateurDispo o WHERE o.idOrdinateurDispo = :idOrdinateurDispo")})
public class OrdinateurDispo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ORDINATEUR_DISPO", nullable = false)
    private Integer idOrdinateurDispo;
    @JoinColumn(name = "ID_ORDINATEUR", referencedColumnName = "ID_ORDINATEUR", nullable = false)
    @ManyToOne(optional = false)
    private Ordinateur idOrdinateur;
    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }
    @Basic(optional = false)
    @Column(name = "DATE_LIVRAISON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLivraison;
    public OrdinateurDispo() {
        this(null);
    }

    public OrdinateurDispo(Ordinateur idOrdinateur) {
        this.idOrdinateur = idOrdinateur;
    }


    public Integer getIdOrdinateurDispo() {
        return idOrdinateurDispo;
    }

    public void setIdOrdinateurDispo(Integer idOrdinateurDispo) {
        this.idOrdinateurDispo = idOrdinateurDispo;
    }

    public Ordinateur getIdOrdinateur() {
        return idOrdinateur;
    }

    public void setIdOrdinateur(Ordinateur idOrdinateur) {
        this.idOrdinateur = idOrdinateur;
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
        if ((this.idOrdinateurDispo == null && other.idOrdinateurDispo != null) || (this.idOrdinateurDispo != null && !this.idOrdinateurDispo.equals(other.idOrdinateurDispo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ordinateur.OrdinateurDispo[ idOrdinateurDispo=" + idOrdinateurDispo + " ]";
    }
    
}
