
package logiciel;

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
@Table(name = "LOGICIEL_DISPO")
public class LogicielDispo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LOGICIEL_DISPO")
    private Integer idLogicielDispo;

    public Integer getIdLogicielDispo() {
        return idLogicielDispo;
    }
    @Column(name = "ID_LOGICIEL")
    private int idLogiciel;

    public int getIdLogiciel() {
        return idLogiciel;
    }

    public void setIdLogiciel(int idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_LOGICIEL", nullable = false, insertable = false, updatable = false)
    private Logiciel logiciel;

    public Logiciel getLogiciel() {
        return logiciel;
    }

    public LogicielDispo() {
        this(0);
    }

    public LogicielDispo(Integer idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogicielDispo != null ? idLogicielDispo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogicielDispo)) {
            return false;
        }
        LogicielDispo other = (LogicielDispo) object;
        return !((this.idLogicielDispo == null && other.idLogicielDispo != null) || (this.idLogicielDispo != null && !this.idLogicielDispo.equals(other.idLogicielDispo)));
    }

    @Override
    public String toString() {
        return "TEST.LogicielDispo[ idLogicielDispo=" + idLogicielDispo + " ]";
    }

}
