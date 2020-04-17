package it.units.progrweb2020.dataaccess;

import it.units.progrweb2020.dataaccess.entities.BlogPost;
import it.units.progrweb2020.dataaccess.entities.Corso;
import it.units.progrweb2020.dataaccess.entities.Esame;
import it.units.progrweb2020.dataaccess.entities.Libro;
import it.units.progrweb2020.dataaccess.entities.Pubblicazione;
import it.units.progrweb2020.dataaccess.entities.Studente;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author giorgio
 */
public class JPA {
  public static void main(String[] args){
    try{
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("progrwebPU");
      EntityManager em = emf.createEntityManager();
            
      Pubblicazione prima = new Pubblicazione();
      prima.setTitolo("Il signore degli anelli");
      prima.setNomeAutore("Tolkien");
      
      Libro libro = new Libro();
      libro.setTitolo("Lo Hobbit");
      libro.setNomeAutore("Tolkien");
      libro.setNumeroPagine(240);
      
      BlogPost post = new BlogPost();
      post.setNomeAutore("Piero Angela");
      post.setTitolo("Uniti contro le bufale");
      post.setUrl("www.cicap.it");
                
      em.getTransaction().begin();
      em.persist(prima);
      em.persist(libro);
      em.persist(post);
      em.getTransaction().commit();
      
      Studente giorgio = new Studente();
      giorgio.setCognome("Davanzo");
      giorgio.setNome("Giorgio");
      
      Corso progrWeb = new Corso();
      progrWeb.setAula("Aula A");
      progrWeb.setNome("Programmazione WEB");
      
      Corso fondamenti = new Corso();
      fondamenti.setAula("Ciamician");
      fondamenti.setNome("Fondamenti di Informatica");
      
      Esame primoEsame = new Esame();
      primoEsame.setCorso(progrWeb);
      //primoEsame.setStud(giorgio);
      //giorgio.getEsami().add(primoEsame);
      giorgio.addEsame(primoEsame);
      primoEsame.setDataEsame(new Date());
      primoEsame.setVoto(30);
      
      em.getTransaction().begin();
      em.persist(giorgio);
      em.persist(progrWeb);
      em.persist(fondamenti);
      em.persist(primoEsame);
      em.getTransaction().commit();
      
      
      em.getTransaction().begin();
      giorgio.setCognome("Pincopallo");
      em.getTransaction().commit();
      
      
      Studente s1 = em.find(Studente.class, 1l);
      System.out.println(s1.getNome());
      
      TypedQuery<Corso> q1 = em.createQuery("SELECT c from Corso c", Corso.class);
      List<Corso> corsi = q1.getResultList();
      for(Corso c: corsi){
        System.out.println(c.getNome());
      }
      
      q1 = em.createNamedQuery("Corso.findAll", Corso.class);
      corsi = q1.getResultList();
      for(Corso c: corsi){
        System.out.println(c.getNome());
      }
      
      System.out.println("===== Criteria Query");
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<Corso> criteriaQuery = cb.createQuery(Corso.class);
      Root<Corso> root = criteriaQuery.from(Corso.class);
      criteriaQuery.select(root);
      q1 = em.createQuery(criteriaQuery);
      corsi = q1.getResultList();
      for(Corso c: corsi){
        System.out.println(c.getNome());
      }
      
      em.close();
      emf.close();
    }catch(Exception e){
      System.out.println("ERRORE!! " + e);
    }
    
  }
}
