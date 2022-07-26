/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoire;

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
@Table(name = "MEMOIRE_UTILISE", catalog = "Gestion_Park", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MemoireUtilise.findAll", query = "SELECT m FROM MemoireUtilise m"),
    @NamedQuery(name = "MemoireUtilise.findByIdMemoireUtilise", query = "SELECT m FROM MemoireUtilise m WHERE m.idMemoireUtilise = :idMemoireUtilise")})
public class MemoireUtilise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MEMOIRE_UTILISE", nullable = false)
    private Integer idMemoireUtilise;
    @JoinColumn(name = "ID_MEMOIRE", referencedColumnName = "ID_MEMOIRE", nullable = false)
    @ManyToOne(optional = false)
    private Memoire idMemoire;
    @JoinColumn(name = "MATRICULE", referencedColumnName = "MATRICULE", nullable = false)
    @ManyToOne(optional = false)
    private Employe matricule;

    public MemoireUtilise() {
        this(null,null);
    }

    public MemoireUtilise(Memoire idMemoire, Employe matricule) {
        this.idMemoire = idMemoire;
        this.matricule = matricule;
    }


    public Integer getIdMemoireUtilise() {
        return idMemoireUtilise;
    }

    public void setIdMemoireUtilise(Integer idMemoireUtilise) {
        this.idMemoireUtilise = idMemoireUtilise;
    }

    public Memoire getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(Memoire idMemoire) {
        this.idMemoire = idMemoire;
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
        hash += (idMemoireUtilise != null ? idMemoireUtilise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MemoireUtilise)) {
            return false;
        }
        MemoireUtilise other = (MemoireUtilise) object;
        if ((this.idMemoireUtilise == null && other.idMemoireUtilise != null) || (this.idMemoireUtilise != null && !this.idMemoireUtilise.equals(other.idMemoireUtilise))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employe.MemoireUtilise[ idMemoireUtilise=" + idMemoireUtilise + " ]";
    }
    
}
