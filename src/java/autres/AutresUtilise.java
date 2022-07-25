package autres;

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

@Entity
@Table(name = "AUTRES_UTILISE")
public class AutresUtilise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AUTRES_UTILISE")
    private Integer idAutresUtilise;

    public Integer getIdAutresUtilise() {
        return idAutresUtilise;
    }
    @Column(name = "ID_AUTRES")
    private int idAutres;

    public int getIdAutres() {
        return idAutres;
    }
    private int matricule;

    public int getMatricule() {
        return matricule;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_AUTRES", nullable = false, insertable = false, updatable = false)
    private Autres autres;

    public Autres getAutres() {
        return autres;
    }
    @ManyToOne(optional = false)
    @JoinColumn(name = "MATRICULE", nullable = false, insertable = false, updatable = false)
    private Employe employe;

    public Employe getEmploye() {
        return employe;
    }

    public AutresUtilise() {
        this(0, 0);
    }

    public AutresUtilise(int idAutres, int matricule) {
        this.idAutres = idAutres;
        this.matricule = matricule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAutresUtilise != null ? idAutresUtilise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AutresUtilise)) {
            return false;
        }
        AutresUtilise other = (AutresUtilise) object;
        return !((this.idAutresUtilise == null && other.idAutresUtilise != null) || (this.idAutresUtilise != null && !this.idAutresUtilise.equals(other.idAutresUtilise)));
    }

    @Override
    public String toString() {
        return "TEST.AutresUtilise[ idAutresUtilise=" + idAutresUtilise + " ]";
    }

}
