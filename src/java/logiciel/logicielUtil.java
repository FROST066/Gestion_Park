
package logiciel;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author spmy
 */
@Stateless
public class logicielUtil implements logicielUtilLocal {

    @PersistenceContext(name = "WebAppPU")
    private EntityManager em;

    @Override
    public List<Logiciel> allLogiciel() {
        return em.createNamedQuery("Logiciel.findAll").getResultList();
    }

    @Override
    public List<LogicielDispo> allLogicielDispo() {
        return em.createNamedQuery("LogicielDispo.findAll").getResultList();
    }

    @Override
    public List<LogicielUtilise> allLogicielUtilise() {
        return em.createNamedQuery("LogicielUtilise.findAll").getResultList();
    }

    @Override
    public void addLogiciel(String nomLogiciel, String type, String version) {
        em.persist(new Logiciel(nomLogiciel, type, version));
    }

    @Override
    public void addLogicielDispo(int idLogiciel) {
        em.persist(new LogicielDispo(this.loadLogicielByID(idLogiciel)));
    }

    /*@Override
    public void addLogicielUtilise(int idLogiciel, int matricule) {
        em.persist(new LogicielUtilise(idLogiciel, matricule));
    }*/

    @Override
    public Logiciel loadLogicielByID(int idLogiciel) {
       return em.find(Logiciel.class, idLogiciel);
    }

    @Override
    public LogicielDispo loadLogicielDispoByID(int idLogicielDispo) {
        return em.find(LogicielDispo.class, idLogicielDispo);
    }

    @Override
    public void deleteLogicielDispo(int idLogicielDispo) {
         em.remove(em.find(LogicielDispo.class,idLogicielDispo));
    }
 
 
}
