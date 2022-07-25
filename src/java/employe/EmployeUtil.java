/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package employe;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

/**
 *
 * @author spmy
 */
@Stateless
public class EmployeUtil implements EmployeUtilLocal {

    @PersistenceContext(name = "WebAppPU")
    private EntityManager em;

    @Override
    public int connectionResult(String matricule, String mdp) {
        Query q = em.createNamedQuery("Employe.toConnection");
        q.setParameter(1, matricule);
        q.setParameter(2, mdp);
        return q.getResultList().size();
    }

    @Override
    public Employe loadEmployeByID(String matricule) {
        return em.find(Employe.class, matricule);
    }
}
