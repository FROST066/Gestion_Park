
package autres;

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
@Table(name = "AUTRES_DISPO")
public class AutresDispo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AUTRES_DISPO")
    private Integer idAutresDispo;
    @Column(name = "ID_AUTRES")
    private int idAutres;

    public int getIdAutres() {
        return idAutres;
    }

    @JoinColumn(name = "ID_AUTRES", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Autres autres;

    public Autres getAutres() {
        return this.autres;
    }

    public AutresDispo() {
        this(0);
    }

    public AutresDispo(Integer idAutres) {
        this.idAutres = idAutres;
    }

    public Integer getIdAutresDispo() {
        return idAutresDispo;
    }

    public void setIdAutresDispo(Integer idAutresDispo) {
        this.idAutresDispo = idAutresDispo;
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
        return !((this.idAutresDispo == null && other.idAutresDispo != null) || (this.idAutresDispo != null && !this.idAutresDispo.equals(other.idAutresDispo)));
    }

    @Override
    public String toString() {
        return "TEST.AutresDispo[ idAutresDispo=" + idAutresDispo + " ]";
    }

}
