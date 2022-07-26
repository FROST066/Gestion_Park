/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logiciel;

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
@Table(name = "LOGICIEL", catalog = "Gestion_Park", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logiciel.findAll", query = "SELECT l FROM Logiciel l"),
    @NamedQuery(name = "Logiciel.findByIdLogiciel", query = "SELECT l FROM Logiciel l WHERE l.idLogiciel = :idLogiciel"),
    @NamedQuery(name = "Logiciel.findByNomLogiciel", query = "SELECT l FROM Logiciel l WHERE l.nomLogiciel = :nomLogiciel"),
    @NamedQuery(name = "Logiciel.findByType", query = "SELECT l FROM Logiciel l WHERE l.type = :type"),
    @NamedQuery(name = "Logiciel.findByVersion", query = "SELECT l FROM Logiciel l WHERE l.version = :version")})
public class Logiciel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_LOGICIEL", nullable = false)
    private Integer idLogiciel;
    @Basic(optional = false)
    @Column(name = "NOM_LOGICIEL", nullable = false, length = 255)
    private String nomLogiciel;
    @Basic(optional = false)
    @Column(name = "TYPE", nullable = false, length = 255)
    private String type;
    @Basic(optional = false)
    @Column(name = "VERSION", nullable = false, length = 255)
    private String version;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLogiciel")
    private List<LogicielDispo> logicielDispoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLogiciel")
    private List<LogicielUtilise> logicielUtiliseList;

    public Logiciel() {
    }

    public Logiciel(Integer idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    public Logiciel(String nomLogiciel, String type, String version) {
        this.nomLogiciel = nomLogiciel;
        this.type = type;
        this.version = version;
    }

    public Integer getIdLogiciel() {
        return idLogiciel;
    }

    public void setIdLogiciel(Integer idLogiciel) {
        this.idLogiciel = idLogiciel;
    }

    public String getNomLogiciel() {
        return nomLogiciel;
    }

    public void setNomLogiciel(String nomLogiciel) {
        this.nomLogiciel = nomLogiciel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlTransient
    public List<LogicielDispo> getLogicielDispoList() {
        return logicielDispoList;
    }

    public void setLogicielDispoList(List<LogicielDispo> logicielDispoList) {
        this.logicielDispoList = logicielDispoList;
    }

    @XmlTransient
    public List<LogicielUtilise> getLogicielUtiliseList() {
        return logicielUtiliseList;
    }

    public void setLogicielUtiliseList(List<LogicielUtilise> logicielUtiliseList) {
        this.logicielUtiliseList = logicielUtiliseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLogiciel != null ? idLogiciel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logiciel)) {
            return false;
        }
        Logiciel other = (Logiciel) object;
        return !((this.idLogiciel == null && other.idLogiciel != null) || (this.idLogiciel != null && !this.idLogiciel.equals(other.idLogiciel)));
    }

    @Override
    public String toString() {
        return "employe.Logiciel[ idLogiciel=" + idLogiciel + " ]";
    }
    
}
