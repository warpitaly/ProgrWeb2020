package it.units.progrweb2020.rest.entities.storage;

/**
 *
 * @author giorgio
 */
public class Studente {

  private String nome;
  private String cognome;
  private int id;

  public Studente() {
  }

  public Studente(String nome, String cognome, int id) {
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
