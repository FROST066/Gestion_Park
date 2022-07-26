/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordinateur;

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
@Table(name = "ORDINATEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordinateur.findAll", query = "SELECT o FROM Ordinateur o"),
    @NamedQuery(name = "Ordinateur.findByIdOrdinateur", query = "SELECT o FROM Ordinateur o WHERE o.idOrdinateur = :idOrdinateur"),
    @NamedQuery(name = "Ordinateur.findByNom", query = "SELECT o FROM Ordinateur o WHERE o.nom = :nom"),
    @NamedQuery(name = "Ordinateur.findByMarque", query = "SELECT o FROM Ordinateur o WHERE o.marque = :marque"),
    @NamedQuery(name = "Ordinateur.findByProcesseur", query = "SELECT o FROM Ordinateur o WHERE o.processeur = :processeur"),
    @NamedQuery(name = "Ordinateur.findByRam", query = "SELECT o FROM Ordinateur o WHERE o.ram = :ram"),
    @NamedQuery(name = "Ordinateur.findByRom", query = "SELECT o FROM Ordinateur o WHERE o.rom = :rom"),
    @NamedQuery(name = "Ordinateur.findByVitesse", query = "SELECT o FROM Ordinateur o WHERE o.vitesse = :vitesse")})
public class Ordinateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ORDINATEUR", nullable = false)
    private Integer idOrdinateur;
    @Basic(optional = false)
    @Column(name = "NOM", nullable = false, length = 255)
    private String nom;
    @Basic(optional = false)
    @Column(name = "MARQUE", nullable = false, length = 255)
    private String marque;
    @Basic(optional = false)
    @Column(name = "PROCESSEUR", nullable = false, length = 255)
    private String processeur;
    @Basic(optional = false)
    @Column(name = "RAM", nullable = false)
    private double ram;
    @Basic(optional = false)
    @Column(name = "ROM", nullable = false)
    private double rom;
    @Basic(optional = false)
    @Column(name = "VITESSE", nullable = false)
    private double vitesse;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrdinateur")
    private List<OrdinateurUtilise> ordinateurUtiliseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrdinateur")
    private List<OrdinateurDispo> ordinateurDispoList;

    public Ordinateur() {
    }

    public Ordinateur(Integer idOrdinateur) {
        this();
    }

    public Ordinateur(String nom, String marque, String processeur, double ram, double rom, double vitesse) {
        this.nom = nom;
        this.marque = marque;
        this.processeur = processeur;
        this.ram = ram;
        this.rom = rom;
        this.vitesse = vitesse;
    }

    public Integer getIdOrdinateur() {
        return idOrdinateur;
    }

    public void setIdOrdinateur(Integer idOrdinateur) {
        this.idOrdinateur = idOrdinateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getProcesseur() {
        return processeur;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getRom() {
        return rom;
    }

    public void setRom(double rom) {
        this.rom = rom;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    @XmlTransient
    public List<OrdinateurUtilise> getOrdinateurUtiliseList() {
        return ordinateurUtiliseList;
    }

    public void setOrdinateurUtiliseList(List<OrdinateurUtilise> ordinateurUtiliseList) {
        this.ordinateurUtiliseList = ordinateurUtiliseList;
    }

    @XmlTransient
    public List<OrdinateurDispo> getOrdinateurDispoList() {
        return ordinateurDispoList;
    }

    public void setOrdinateurDispoList(List<OrdinateurDispo> ordinateurDispoList) {
        this.ordinateurDispoList = ordinateurDispoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdinateur != null ? idOrdinateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordinateur)) {
            return false;
        }
        Ordinateur other = (Ordinateur) object;
        return !((this.idOrdinateur == null && other.idOrdinateur != null) || (this.idOrdinateur != null && !this.idOrdinateur.equals(other.idOrdinateur)));
    }

    @Override
    public String toString() {
        return "ID_ORDINATEUR: " + this.idOrdinateur + "\nMARQUE: " + this.marque + "\nPROCESSEUR: " + this.processeur + "\nRAM: " + this.ram + " Go\nROM: " + this.rom + " GB\nVITESSE: " + this.vitesse + "GHz";
    }

}
