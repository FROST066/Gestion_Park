/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autres;

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
@Table(name = "AUTRES", catalog = "Gestion_Park", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autres.findAll", query = "SELECT a FROM Autres a"),
    @NamedQuery(name = "Autres.findByIdAutres", query = "SELECT a FROM Autres a WHERE a.idAutres = :idAutres"),
    @NamedQuery(name = "Autres.findByNom", query = "SELECT a FROM Autres a WHERE a.nom = :nom"),
    @NamedQuery(name = "Autres.findByDescription", query = "SELECT a FROM Autres a WHERE a.description = :description")})
public class Autres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_AUTRES", nullable = false)
    private Integer idAutres;
    @Basic(optional = false)
    @Column(name = "NOM", nullable = false, length = 255)
    private String nom;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION", nullable = false, length = 255)
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAutres")
    private List<AutresUtilise> autresUtiliseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAutres")
    private List<AutresDispo> autresDispoList;

    public Autres() {
        this(" ", " ");
    }
    
    public Autres(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public Integer getIdAutres() {
        return idAutres;
    }

    public void setIdAutres(Integer idAutres) {
        this.idAutres = idAutres;
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

    @XmlTransient
    public List<AutresUtilise> getAutresUtiliseList() {
        return autresUtiliseList;
    }

    public void setAutresUtiliseList(List<AutresUtilise> autresUtiliseList) {
        this.autresUtiliseList = autresUtiliseList;
    }

    @XmlTransient
    public List<AutresDispo> getAutresDispoList() {
        return autresDispoList;
    }

    public void setAutresDispoList(List<AutresDispo> autresDispoList) {
        this.autresDispoList = autresDispoList;
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
        if ((this.idAutres == null && other.idAutres != null) || (this.idAutres != null && !this.idAutres.equals(other.idAutres))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "employe.Autres[ idAutres=" + idAutres + " ]";
    }
    
}
