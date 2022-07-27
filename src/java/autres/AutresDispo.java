/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autres;

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
@Table(name = "AUTRES_DISPO", catalog = "Gestion_Park", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AutresDispo.findAll", query = "SELECT a FROM AutresDispo a"),
    @NamedQuery(name = "AutresDispo.findByIdAutresDispo", query = "SELECT a FROM AutresDispo a WHERE a.idAutresDispo = :idAutresDispo")})
public class AutresDispo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_AUTRES_DISPO", nullable = false)
    private Integer idAutresDispo;
/*
    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }
    @Basic(optional = false)
    @Column(name = "DATE_LIVRAISON", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLivraison;*/
    @JoinColumn(name = "ID_AUTRES", referencedColumnName = "ID_AUTRES", nullable = false)
    @ManyToOne(optional = false)
    private Autres idAutres;

    public AutresDispo() {
        this(null);
    }

    public AutresDispo(Autres idAutres) {
        this.idAutres = idAutres;
    }

    public Integer getIdAutresDispo() {
        return idAutresDispo;
    }

    public void setIdAutresDispo(Integer idAutresDispo) {
        this.idAutresDispo = idAutresDispo;
    }

    public Autres getIdAutres() {
        return idAutres;
    }

    public void setIdAutres(Autres idAutres) {
        this.idAutres = idAutres;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutresDispo != null ? idAutresDispo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AutresDispo)) {
            return false;
        }
        AutresDispo other = (AutresDispo) object;
        if ((this.idAutresDispo == null && other.idAutresDispo != null) || (this.idAutresDispo != null && !this.idAutresDispo.equals(other.idAutresDispo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employe.AutresDispo[ idAutresDispo=" + idAutresDispo + " ]";
    }
    
}
