/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employe;

import memoire.MemoireUtilise;
import logiciel.LogicielUtilise;
import autres.AutresUtilise;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import ordinateur.OrdinateurUtilise;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "EMPLOYE", catalog = "Gestion_Park", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employe.findAll", query = "SELECT e FROM Employe e"),
    @NamedQuery(name = "Employe.findByMatricule", query = "SELECT e FROM Employe e WHERE e.matricule = :matricule"),
    @NamedQuery(name = "Employe.toConnection", query = "SELECT e FROM Employe e WHERE e.matricule = ?1 AND e.motDePass =?2"),
    @NamedQuery(name = "Employe.findByNomEmploye", query = "SELECT e FROM Employe e WHERE e.nomEmploye = :nomEmploye"),
    @NamedQuery(name = "Employe.findByPrenomEmploye", query = "SELECT e FROM Employe e WHERE e.prenomEmploye = :prenomEmploye"),
    @NamedQuery(name = "Employe.findByMotDePass", query = "SELECT e FROM Employe e WHERE e.motDePass = :motDePass")})
public class Employe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MATRICULE", nullable = false, length = 255)
    private String matricule;
    @Basic(optional = false)
    @Column(name = "NOM_EMPLOYE", nullable = false, length = 255)
    private String nomEmploye;
    @Basic(optional = false)
    @Column(name = "PRENOM_EMPLOYE", nullable = false, length = 255)
    private String prenomEmploye;
    @Basic(optional = false)
    @Column(name = "MOT_DE_PASS", nullable = false, length = 255)
    private String motDePass;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matricule")
    private List<AutresUtilise> autresUtiliseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matricule")
    private List<MemoireUtilise> memoireUtiliseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matricule")
    private List<OrdinateurUtilise> ordinateurUtiliseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matricule")
    private List<LogicielUtilise> logicielUtiliseList;

    public Employe() {
    }

    public Employe(String matricule) {
        this.matricule = matricule;
    }

    public Employe(String matricule, String nomEmploye, String prenomEmploye, String motDePass) {
        this.matricule = matricule;
        this.nomEmploye = nomEmploye;
        this.prenomEmploye = prenomEmploye;
        this.motDePass = motDePass;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public void setPrenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }

    @XmlTransient
    public List<AutresUtilise> getAutresUtiliseList() {
        return autresUtiliseList;
    }

    public void setAutresUtiliseList(List<AutresUtilise> autresUtiliseList) {
        this.autresUtiliseList = autresUtiliseList;
    }

    @XmlTransient
    public List<MemoireUtilise> getMemoireUtiliseList() {
        return memoireUtiliseList;
    }

    public void setMemoireUtiliseList(List<MemoireUtilise> memoireUtiliseList) {
        this.memoireUtiliseList = memoireUtiliseList;
    }

    @XmlTransient
    public List<OrdinateurUtilise> getOrdinateurUtiliseList() {
        return ordinateurUtiliseList;
    }

    public void setOrdinateurUtiliseList(List<OrdinateurUtilise> ordinateurUtiliseList) {
        this.ordinateurUtiliseList = ordinateurUtiliseList;
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
        hash += (matricule != null ? matricule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employe)) {
            return false;
        }
        Employe other = (Employe) object;
        return !((this.matricule == null && other.matricule != null) || (this.matricule != null && !this.matricule.equals(other.matricule)));
    }

    @Override
    public String toString() {
        return this.getNomEmploye()+" "+this.getPrenomEmploye();
    }
    
}
