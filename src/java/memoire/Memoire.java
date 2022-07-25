package memoire;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "MEMOIRE")
public class Memoire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID_MEMOIRE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMemoire;
    @Column(name = "CAPACITE")
    private Double capacite;
    @Column(name = "NOM_MEMOIRE")
    private String nomMemoire;
    @OneToMany(targetEntity = MemoireDispo.class, mappedBy = "memoire")
    private List<MemoireUtilise> memoireUtiliseCollection;

    public List<MemoireUtilise> getMemoireUtiliseCollection() {
        return memoireUtiliseCollection;
    }
    @OneToMany(targetEntity = MemoireUtilise.class, mappedBy = "memoire")
    private List<MemoireDispo> memoireDispoCollection;

    public List<MemoireDispo> getMemoireDispoCollection() {
        return memoireDispoCollection;
    }

    public Memoire(String nomMemoire, Double capacite) {
        this.capacite = capacite;
        this.nomMemoire = nomMemoire;
    }

    public Memoire() {
        this("", 0.0);
    }

    public int getIdMemoire() {
        return idMemoire;
    }

    public Double getCapacite() {
        return capacite;
    }

    public void setCapacite(Double capacite) {
        this.capacite = capacite;
    }

    public String getNomMemoire() {
        return nomMemoire;
    }

    public void setNomMemoire(String nomMemoire) {
        this.nomMemoire = nomMemoire;
    }

    @Override
    public String toString() {
        return "TEST.Memoire[ idMemoire=" + idMemoire + " ]";
    }

}
