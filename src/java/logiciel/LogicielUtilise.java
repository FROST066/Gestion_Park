/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logiciel;

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
@Table(name = "LOGICIEL_UTILISE")
public class LogicielUtilise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LOGICIEL_UTILISE")
    private Integer idLogicielUtilise;
    @Column(name = "ID_LOGICIEL")
    private int idLogiciel;
    private int matricule;

    public int getIdLogiciel() {
        return idLogiciel;
    }

    public void setIdLogiciel(int idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "MATRICULE", nullable = false, insertable = false, updatable = false)
    private Employe employe;

    public Employe getEmploye() {
        return employe;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_LOGICIEL", nullable = false, insertable = false, updatable = false)
    private Logiciel logiciel;

    public Logiciel getLogiciel() {
        return logiciel;
    }

    public LogicielUtilise() {
        this(0, 0);
    }

    public LogicielUtilise(int idLogiciel, int matricule) {
        this.idLogiciel = idLogiciel;
        this.matricule = matricule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogicielUtilise != null ? idLogicielUtilise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogicielUtilise)) {
            return false;
        }
        LogicielUtilise other = (LogicielUtilise) object;
        return !((this.idLogicielUtilise == null && other.idLogicielUtilise != null) || (this.idLogicielUtilise != null && !this.idLogicielUtilise.equals(other.idLogicielUtilise)));
    }

    @Override
    public String toString() {
        return "TEST.LogicielUtilise[ idLogicielUtilise=" + idLogicielUtilise + " ]";
    }

}
