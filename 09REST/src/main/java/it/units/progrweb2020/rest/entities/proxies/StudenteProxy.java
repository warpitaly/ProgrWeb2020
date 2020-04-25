package it.units.progrweb2020.rest.entities.proxies;

import io.swagger.v3.oas.annotations.Hidden;
import it.units.progrweb2020.rest.entities.storage.Studente;

/**
 *
 * @author giorgio
 */
public class StudenteProxy {
  private String nome;
  private String cognome;
  private int id;
  

  public StudenteProxy() {
  }
  
  public StudenteProxy(Studente originale){
    this.nome = originale.getNome();
    this.cognome = originale.getCognome();
    this.id = originale.getId();
  }

  @Hidden
  public Studente getStudente(){
    //probabilmente lo recupero dallo storage partendo dall'id
    return new Studente(nome, cognome, id, true);
  }
  
  public StudenteProxy(String nome, String cognome, int id) {
    this.nome = nome;
    this.cognome = cognome;
    this.id = id;
  }

  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCognome() {
    return cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  
  
  
}
