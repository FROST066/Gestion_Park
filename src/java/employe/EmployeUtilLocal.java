/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package employe;

import jakarta.ejb.Local;

/**
 *
 * @author spmy
 */
@Local
public interface EmployeUtilLocal {

public int connectionResult(String matricule, String mdp);
public Employe loadEmployeByID(String matricule);
    
}
