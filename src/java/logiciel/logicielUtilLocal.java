/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package logiciel;

import java.util.List;
import jakarta.ejb.Local;

/**
 *
 * @author spmy
 */
@Local
public interface logicielUtilLocal {

    public List<Logiciel> allLogiciel();

    public List<LogicielDispo> allLogicielDispo();

    public List<LogicielUtilise> allLogicielUtilise();

    public void addLogiciel(String nomLogiciel, String type, String version);

    public void addLogicielDispo(int idLogiciel);

    public void addLogicielUtilise(int idLogiciel, int matricule);

    public Logiciel loadLogicielByID(int idLogiciel);

    public LogicielDispo loadLogicielDispoByID(int idLogicielDispo);

    public void deleteLogicielDispo(int idLogicielDispo);
}
