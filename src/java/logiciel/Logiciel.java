/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logiciel;

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
@Table(name = "LOGICIEL")
public class Logiciel implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Column(name = "ID_LOGICIEL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double idLogiciel;
    @Column(name = "NOM_LOGICIEL")
    private String nomLogiciel;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "VERSION")
    private String version;
    
    @OneToMany(targetEntity = LogicielDispo.class, mappedBy = "logiciel")
    private List<LogicielDispo> logicielDispoCollection;
    @OneToMany(targetEntity = LogicielUtilise.class, mappedBy = "logiciel")
    private List<LogicielUtilise> logicielUtiliseCollection;

    public Logiciel() {
        this("", "","");
    }

    public Logiciel(String nomLogiciel, String type, String version) {
        this.nomLogiciel = nomLogiciel;
        this.type = type;
        this.version = version;
    }

    public List<LogicielDispo> getLogicielDispoCollection() {
        return logicielDispoCollection;
    }

    public List<LogicielUtilise> getLogicielUtiliseCollection() {
        return logicielUtiliseCollection;
    }


    public Double getIdLogiciel() {
        return idLogiciel;
    }

    public void setIdLogiciel(Double idLogiciel) {
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
        return "TEST.Logiciel[ idLogiciel=" + idLogiciel + " ]";
    }
    
}
