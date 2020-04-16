package it.units.progrweb2020.dataaccess;

import it.units.progrweb2020.dataaccess.entities.Studente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author giorgio
 */
public class JPA {
  public static void main(String[] args){
    try{
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("progrwebPU");
      EntityManager em = emf.createEntityManager();
      Studente giorgio = new Studente();
      giorgio.setCognome("Davanzo");
      giorgio.setNome("Giorgio");
      
      em.getTransaction().begin();
      em.persist(giorgio);
      em.getTransaction().commit();
      
      em.close();
      emf.close();
    }catch(Exception e){
      System.out.println("ERRORE!! " + e);
    }
    
  }
}
