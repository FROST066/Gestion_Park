
package autres;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author spmy
 */
@Stateless
public class autresUtil implements autresUtilLocal {
 @PersistenceContext(name = "WebAppPU")
    private EntityManager em;

    @Override
    public List<Autres> allAutres() {
        return em.createNamedQuery("Autres.findAll").getResultList();
    }

    @Override
    public List<AutresDispo> allAutresDispo() {
        return em.createNamedQuery("AutresDispo.findAll").getResultList();
    }

    @Override
    public List<AutresUtilise> allAutresUtilise() {
        return em.createNamedQuery("AutresUtilise.findAll").getResultList();
    }

    @Override
    public void addAutres(String nom, String description) {
        em.persist(new Autres(nom, description));
    }

    @Override
    public void addAutresDispo(int idAutres) {
        em.persist(new AutresDispo(idAutres));
    }

   // @Override
    //public void addAutresUtilise(int idAutres, int matricule) {
    //    em.persist(new AutresUtilise(idAutres, matricule));
   // }

    @Override
    public Autres loadAutresByID(int idAutres) {
       return em.find(Autres.class, idAutres);
    }

    @Override
    public AutresDispo loadAutresDispoByID(int idAutresDispo) {
        return em.find(AutresDispo.class, idAutresDispo);
    }

    @Override
    public void deleteAutresDispo(int idAutresDispo) {
         em.remove(em.find(AutresDispo.class,idAutresDispo));
    }
 
 
}
