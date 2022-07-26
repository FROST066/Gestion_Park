/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package autres;

import employe.Employe;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author spmy
 */
@Local
public interface autresUtilLocal {
    
    public List<Autres> allAutres();

    public List<AutresDispo> allAutresDispo();

    public List<AutresUtilise> allAutresUtilise();

    public void addAutres(String nom, String description);

    public void addAutresDispo(int idAutres);

     public void addAutresUtilise(int idAutresDispo, Employe proprio);

    public Autres loadAutresByID(int idAutres);

    public AutresDispo loadAutresDispoByID(int idAutresDispo);

    public void deleteAutresDispo(int idAutresDispo);
}
