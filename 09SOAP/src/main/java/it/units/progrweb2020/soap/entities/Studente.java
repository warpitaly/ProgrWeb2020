package it.units.progrweb2020.soap.entities;

import java.io.Serializable;

/**
 *
 * @author giorgio
 */
public class Studente implements Serializable{
  private String nome;
  
  private String cognome;

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
