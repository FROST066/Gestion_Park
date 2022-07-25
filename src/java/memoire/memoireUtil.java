/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package memoire;

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
        return em.createQuery("from MEMOIRE", Memoire.class).getResultList();
    }

    @Override
    public List<MemoireDispo> allMemoireDispo() {
        return em.createQuery("from MEMOIRE_DISPO", MemoireDispo.class).getResultList();
    }

    @Override
    public List<MemoireUtilise> allMemoireUtilise() {
        return em.createQuery("from MEMOIRE_UTILISE", MemoireUtilise.class).getResultList();
    }

    @Override
    public void addMemoire(String nomMemoire, Double capacite) {
        em.persist(new Memoire(nomMemoire, capacite));
    }

    @Override
    public void addMemoireDispo(int idMemoire) {
        em.persist(new MemoireDispo(idMemoire));
    }

    @Override
    public void addMemoireUtilise(int idMemoire, int matricule) {
        em.persist(new MemoireUtilise(idMemoire, matricule));
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
 
 
}
