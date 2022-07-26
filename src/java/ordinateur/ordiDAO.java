package ordinateur;

import employe.Employe;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ordiDAO implements ordiDAOLocal {

    @PersistenceContext(name = "WebAppPU")
    private EntityManager em;

    @Override
    public List<Ordinateur> allOrdinateur() {
        return em.createNamedQuery("Ordinateur.findAll").getResultList();

    }

    @Override
    public List<OrdinateurDispo> allOrdinateurDispo() {
        return em.createNamedQuery("OrdinateurDispo.findAll").getResultList();
    }

    @Override
    public List<OrdinateurUtilise> allOrdinateurUtilise() {
        return em.createNamedQuery("OrdinateurUtilise.findAll").getResultList();
    }

    @Override
    public void addOrdinateur(String nom, String marque, String processeur, double rom, double ram, double vitesse) {
        em.persist(new Ordinateur(nom, marque, processeur, rom, ram, vitesse));
    }

    @Override
    public Ordinateur loadOrdinateurByID(int id) {
        return em.find(Ordinateur.class, id);
    }

    @Override
    public void addOrdinateurDispo(int idOrdinateur) {
        em.persist(new OrdinateurDispo(this.loadOrdinateurByID(idOrdinateur)));
    }

    @Override
    public void deleteOrdinateurDispo(int idOrdinateurDispo) {
        em.remove(em.find(OrdinateurDispo.class, idOrdinateurDispo));
    }

    @Override
    public OrdinateurDispo loadOrdinateurDispoByID(int idOdinateurDispo) {
        return em.find(OrdinateurDispo.class, idOdinateurDispo);
    }

    @Override
    public void addOrdinateurUtilise(int idOrdinateurDispo, Employe proprio) {
        Ordinateur meme = this.loadOrdinateurDispoByID(idOrdinateurDispo).getIdOrdinateur();
        em.persist(new OrdinateurUtilise(meme, proprio));
        this.deleteOrdinateurDispo(idOrdinateurDispo);
    }

}
