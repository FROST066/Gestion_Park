/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoire;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "MEMOIRE_DISPO")
public class MemoireDispo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MEMOIRE_DISPO")
     private Integer idMemoireDispo;
     public Integer getIdMemoireDispo() {
        return idMemoireDispo;
    }
     @Column(name = "ID_MEMOIRE")
     private int idMemoire;

    public int getIdMemoire() {
        return idMemoire;
    }

    public void setIdMemoire(int idMemoire) {
        this.idMemoire = idMemoire;
    }
     
    @ManyToOne(optional = false)  @JoinColumn(name = "ID_MEMOIRE", nullable = false, insertable = false, updatable = false)
    private Memoire memoire;
    public Memoire getMemoire() {
        return memoire;
    }

    public MemoireDispo() {
        this(0);
    }
    
    public MemoireDispo(int idMemoire) {
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
        return "TEST.MemoireDispo[ idMemoireDispo=" + idMemoireDispo + " ]";
    }
    
}
