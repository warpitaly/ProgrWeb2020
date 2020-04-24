package it.units.progrweb2020.rest.entities.proxies;

import it.units.progrweb2020.rest.entities.storage.Studente;

/**
 *
 * @author giorgio
 */
public class StudenteProxy {
  private String nome;
  private String cognome;
  

  public StudenteProxy() {
  }
  
  public StudenteProxy(Studente originale){
    this.nome = originale.getNome();
    this.cognome = originale.getCognome();
  }
  
  public Studente getStudente(){
    return new Studente(nome, cognome, 0);
  }
  
  public StudenteProxy(String nome, String cognome) {
    this.nome = nome;
    this.cognome = cognome;
   
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

 
  
  
}
