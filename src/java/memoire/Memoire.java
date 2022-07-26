/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoire;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "MEMOIRE", catalog = "Gestion_Park", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Memoire.findAll", query = "SELECT m FROM Memoire m"),
    @NamedQuery(name = "Memoire.findByIdMemoire", query = "SELECT m FROM Memoire m WHERE m.idMemoire = :idMemoire"),
    @NamedQuery(name = "Memoire.findByNomMemoire", query = "SELECT m FROM Memoire m WHERE m.nomMemoire = :nomMemoire"),
    @NamedQuery(name = "Memoire.findByCapacite", query = "SELECT m FROM Memoire m WHERE m.capacite = :capacite")})
public class Memoire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MEMOIRE", nullable = false)
    private Integer idMemoire;
    @Basic(optional = false)
    @Column(name = "NOM_MEMOIRE", nullable = false, length = 255)
    private String nomMemoire;
    @Basic(optional = false)
    @Column(name = "CAPACITE", nullable = false)
    private double capacite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMemoire")
    private List<MemoireUtilise> memoireUtiliseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMemoire")
    private List<MemoireDispo> memoireDispoList;

    public Memoire() {
    }

    public Memoire(Integer idMemoire) {
        this.idMemoire = idMemoire;
    }

    public Memoire( String nomMemoire, double capacite) {
        this.nomMemoire = nomMemoire;
        this.capacite = capacite;
    }

    public Integer getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(Integer idMemoire) {
        this.idMemoire = idMemoire;
    }

    public String getNomMemoire() {
        return nomMemoire;
    }

    public void setNomMemoire(String nomMemoire) {
        this.nomMemoire = nomMemoire;
    }

    public double getCapacite() {
        return capacite;
    }

    public void setCapacite(double capacite) {
        this.capacite = capacite;
    }

    @XmlTransient
    public List<MemoireUtilise> getMemoireUtiliseList() {
        return memoireUtiliseList;
    }

    public void setMemoireUtiliseList(List<MemoireUtilise> memoireUtiliseList) {
        this.memoireUtiliseList = memoireUtiliseList;
    }

    @XmlTransient
    public List<MemoireDispo> getMemoireDispoList() {
        return memoireDispoList;
    }

    public void setMemoireDispoList(List<MemoireDispo> memoireDispoList) {
        this.memoireDispoList = memoireDispoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMemoire != null ? idMemoire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Memoire)) {
            return false;
        }
        Memoire other = (Memoire) object;
        if ((this.idMemoire == null && other.idMemoire != null) || (this.idMemoire != null && !this.idMemoire.equals(other.idMemoire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employe.Memoire[ idMemoire=" + idMemoire + " ]";
    }
    
}
