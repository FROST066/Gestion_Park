
package memoire;

import employe.Employe;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author spmy
 */
@Stateless
public class memoireUtil implements memoireUtilLocal {

 @PersistenceContext(name = "WebAppPU")
    private EntityManager em;

    @Override
    public List<Memoire> allMemoire() {
        return em.createNamedQuery("Memoire.findAll").getResultList();
    }

    @Override
    public List<MemoireDispo> allMemoireDispo() {
        return em.createNamedQuery("MemoireDispo.findAll").getResultList();
    }

    @Override
    public List<MemoireUtilise> allMemoireUtilise() {
        return em.createNamedQuery("MemoireUtilise.findAll").getResultList();
    }

    @Override
    public void addMemoire(String nomMemoire, Double capacite) {
        em.persist(new Memoire(nomMemoire, capacite));
    }

    @Override
    public void addMemoireDispo(int idMemoire) {
        em.persist(new MemoireDispo(this.loadMemoireByID(idMemoire)));
    }

    @Override
    public Memoire loadMemoireByID(int idMemoire) {
       return em.find(Memoire.class, idMemoire);
    }

    @Override
    public MemoireDispo loadMemoireDispoByID(int idMemoireDispo) {
        return em.find(MemoireDispo.class, idMemoireDispo);
    }

    @Override
    public void deleteMemoireDispo(int idMemoireDispo) {
         em.remove(em.find(MemoireDispo.class,idMemoireDispo));
    }

    @Override
    public void addMemoireUtilise(int idMemoireDispo, Employe proprio) {
       Memoire meme= this.loadMemoireDispoByID(idMemoireDispo).getIdMemoire();
       em.persist(new MemoireUtilise(meme, proprio));
       this.deleteMemoireDispo(idMemoireDispo);
    }
}
