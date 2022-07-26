package ordinateur;

import jakarta.ejb.Local;
import java.util.List;

@Local
public interface ordiDAOLocal {

    public List<Ordinateur> allOrdinateur();

    public List<OrdinateurDispo> allOrdinateurDispo();

    public List<OrdinateurUtilise> allOrdinateurUtilise();

    public void addOrdinateur(String nom,String marque, String processeur, double rom, double ram, double vitesse);

    public void addOrdinateurDispo(int idOrdinateur);

    //public void addOrdinateurUtilise(int idOrdinateur, int matricule);

    public Ordinateur loadOrdinateurByID(int idOrdinateur);

    public OrdinateurDispo loadOrdinateurDispoByID(int idOdinateurDispo);

    public void deleteOrdinateurDispo(int idOrdinateurDispo);

}
