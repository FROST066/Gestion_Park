/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package memoire;

import employe.Employe;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author spmy
 */
@Local
public interface memoireUtilLocal {

    public List<Memoire> allMemoire();

    public List<MemoireDispo> allMemoireDispo();

    public List<MemoireUtilise> allMemoireUtilise();

    public void addMemoire(String nomMemoire, Double capacite);

    public void addMemoireDispo(int idMemoire);

    public void addMemoireUtilise(int idMemoireDispo, Employe proprio);

    public Memoire loadMemoireByID(int idMemoire);

    public MemoireDispo loadMemoireDispoByID(int idMemoireDispo);

    public void deleteMemoireDispo(int idMemoireDispo);

}
