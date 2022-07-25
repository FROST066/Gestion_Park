package autres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "AUTRES")
public class Autres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AUTRES")
    private Integer idAutres;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(targetEntity = AutresUtilise.class, mappedBy = "autres")
    private List<AutresUtilise> autresUtiliseCollection;

    public List<AutresUtilise> getAutresUtiliseCollection() {
        return autresUtiliseCollection;
    }

    @OneToMany(targetEntity = AutresDispo.class, mappedBy = "autres")
    private List<AutresDispo> autresDispoCollection;

    public List<AutresDispo> getAutresDispoCollection() {
        return autresDispoCollection;
    }

    public Autres() {
        this("", "");
    }

    public Autres(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public Integer getIdAutres() {
        return idAutres;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutres != null ? idAutres.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autres)) {
            return false;
        }
        Autres other = (Autres) object;
        return !((this.idAutres == null && other.idAutres != null) || (this.idAutres != null && !this.idAutres.equals(other.idAutres)));
    }

    @Override
    public String toString() {
        return "TEST.Autres[ idAutres=" + idAutres + " ]";
    }
}
