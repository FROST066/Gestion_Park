package memoire;

import employe.Employe;
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
@Table(name = "MEMOIRE_UTILISE")
public class MemoireUtilise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MEMOIRE_UTILISE")
    private Integer idMemoireUtilise;

    public Integer getIdMemoireUtilise() {
        return idMemoireUtilise;
    }
    @Column(name = "ID_MEMOIRE")
    private int idMemoire;
    private int matricule;

    public int getIdMemoire() {
        return idMemoire;
    }

    public int getMatricule() {
        return matricule;
    }
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "MATRICULE", nullable = false, insertable = false, updatable = false)
    private Employe employe;

    public Employe getEmploye() {
        return employe;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_MEMOIRE", nullable = false, insertable = false, updatable = false)
    private Memoire memoire;

    public Memoire getMemoire() {
        return memoire;
    }

    public MemoireUtilise() {
        this(0, 0);
    }

    public MemoireUtilise(int idMemoire, int matricule) {
        this.idMemoire = idMemoire;
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
        return !((this.idMemoireUtilise == null && other.idMemoireUtilise != null) || (this.idMemoireUtilise != null && !this.idMemoireUtilise.equals(other.idMemoireUtilise)));
    }

    @Override
    public String toString() {
        return "TEST.MemoireUtilise[ idMemoireUtilise=" + idMemoireUtilise + " ]";
    }

}
