package ordinateur;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import logiciel.LogicielUtilise;

@Entity
@Table(name = "ORDINATEUR")
public class Ordinateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID_ORDINATEUR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrdinteur;
    @Column(name = "MARQUE")
    private String marque;
    @Column(name = "PROCESSEUR")
    private String processeur;
    @Column(name = "RAM")
    private Double ram;
    @Column(name = "ROM")
    private Double rom;
    @Column(name = "VITESSE")
    private Double vitesse;
    @OneToMany(targetEntity = OrdinateurUtilise.class, mappedBy = "ordinateur")
    private List<OrdinateurUtilise> ordinateurUtiliseCollection;
    @OneToMany(targetEntity = OrdinateurDispo.class, mappedBy = "ordinateur")
    private List<LogicielUtilise> logicielUtiliseCollection ;

    public List<OrdinateurUtilise> getOrdinateurUtiliseCollection() {
        return ordinateurUtiliseCollection;
    }

    public List<LogicielUtilise> getLogicielUtiliseCollection() {
        return logicielUtiliseCollection;
    }

    public Ordinateur() {
        this("unknow", "unknow", 0, 0, 0);
    }

    public Ordinateur(String marque, String processeur, double rom, double ram, double vitesse) {
        this.marque = marque;
        this.processeur = processeur;
        this.ram = ram;
        this.rom = rom;
        this.vitesse = vitesse;
    }

    public int getIdOrdinteur() {
        return idOrdinteur;
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

    public Double getRam() {
        return ram;
    }

    public void setRam(Double ram) {
        this.ram = ram;
    }

    public Double getRom() {
        return rom;
    }

    public void setRom(Double rom) {
        this.rom = rom;
    }

    public Double getVitesse() {
        return vitesse;
    }

    public void setVitesse(Double vitesse) {
        this.vitesse = vitesse;
    }

    @Override
    public String toString() {
        return "ID_ORDINATEUR: " + this.idOrdinteur + "\nMARQUE: " + this.marque + "\nPROCESSEUR: " + this.processeur + "\nRAM: " + this.ram + " Go\nROM: " + this.rom + " GB\nVITESSE: " + this.vitesse + "GHz";
    }

}
