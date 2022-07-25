
package employe;

import autres.AutresUtilise;
import jakarta.persistence.Basic;
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
import logiciel.LogicielUtilise;
import memoire.MemoireUtilise;
import ordinateur.OrdinateurUtilise;

/**
 *
 * @author spmy
 */
@Entity
@Table(name = "EMPLOYE")
@NamedQueries({
    @NamedQuery(name = "Employe.findAll", query = "SELECT e FROM Employe e"),
    @NamedQuery(name = "Employe.findByMatricule", query = "SELECT e FROM Employe e WHERE e.matricule = :matricule"),
    @NamedQuery(name = "Employe.findByMotDePass", query = "SELECT e FROM Employe e WHERE e.motDePass = :motDePass"),
    @NamedQuery(name = "Employe.findByNomEmploye", query = "SELECT e FROM Employe e WHERE e.nomEmploye = :nomEmploye"),
    @NamedQuery(name = "Employe.toConnection", query = "SELECT e FROM Employe e WHERE e.matricule = :matricule AND e.motDePass = :motDePass"),
    @NamedQuery(name = "Employe.findByPrenomEmploye", query = "SELECT e FROM Employe e WHERE e.prenomEmploye = :prenomEmploye")})
//@NamedQuery(name="toConnection" , query = "SELECT matricule FROM EMPLOYE where ")
public class Employe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MATRICULE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String matricule;
    @Column(name = "MOT_DE_PASS")
    private String motDePass;
    @Column(name = "NOM_EMPLOYE")
    private String nomEmploye;
    @Column(name = "PRENOM_EMPLOYE")
    private String prenomEmploye;
    @OneToMany(targetEntity = AutresUtilise.class, mappedBy = "employe")
    private List<AutresUtilise> autresUtiliseCollection;
    @OneToMany(targetEntity = MemoireUtilise.class, mappedBy = "employe")
    private List<MemoireUtilise> memoireUtiliseCollection;
    @OneToMany(targetEntity = OrdinateurUtilise.class, mappedBy = "employe")
    private List<OrdinateurUtilise> ordinateurUtiliseCollection;
    @OneToMany(targetEntity =LogicielUtilise.class , mappedBy = "employe")
    private List<LogicielUtilise> logicielUtiliseCollection;

    public Employe() {
    }

    public Employe(String matricule) {
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
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

    public List<AutresUtilise> getAutresUtiliseCollection() {
        return autresUtiliseCollection;
    }
    
    public List<MemoireUtilise> getMemoireUtiliseCollection() {
        return memoireUtiliseCollection;
    }
    
    public List<OrdinateurUtilise> getOrdinateurUtiliseCollection() {
        return ordinateurUtiliseCollection;
    }

    public List<LogicielUtilise> getLogicielUtiliseCollection() {
        return logicielUtiliseCollection;
    }
    @Override
    public String toString() {
        return "TEST.Employe[ matricule=" + matricule + " ]";
    }
    
}
