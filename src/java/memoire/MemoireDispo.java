/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoire;

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
@Table(name = "MEMOIRE_DISPO", catalog = "Gestion_Park", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MemoireDispo.findAll", query = "SELECT m FROM MemoireDispo m"),
    @NamedQuery(name = "MemoireDispo.findByIdMemoireDispo", query = "SELECT m FROM MemoireDispo m WHERE m.idMemoireDispo = :idMemoireDispo")})
public class MemoireDispo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MEMOIRE_DISPO", nullable = false)
    private Integer idMemoireDispo;

    @JoinColumn(name = "ID_MEMOIRE", referencedColumnName = "ID_MEMOIRE", nullable = false)
    @ManyToOne(optional = false)
    private Memoire idMemoire;

    public MemoireDispo() {
        this(null);
    }

    public MemoireDispo(Memoire idMemoire) {
        this.idMemoire = idMemoire;
    }

    public Integer getIdMemoireDispo() {
        return idMemoireDispo;
    }

    public void setIdMemoireDispo(Integer idMemoireDispo) {
        this.idMemoireDispo = idMemoireDispo;
    }

    public Memoire getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(Memoire idMemoire) {
        this.idMemoire = idMemoire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMemoireDispo != null ? idMemoireDispo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MemoireDispo)) {
            return false;
        }
        MemoireDispo other = (MemoireDispo) object;
        return !((this.idMemoireDispo == null && other.idMemoireDispo != null) || (this.idMemoireDispo != null && !this.idMemoireDispo.equals(other.idMemoireDispo)));
    }

    @Override
    public String toString() {
        return "employe.MemoireDispo[ idMemoireDispo=" + idMemoireDispo + " ]";
    }
    
}
