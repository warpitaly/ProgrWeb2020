package it.units.progrweb2020.rest.entities.storage;

/**
 *
 * @author giorgio
 */
public class Studente {

  private String nome;
  private String cognome;
  private int id;
  private boolean raccomandato;

  public Studente() {
  }

  public Studente(String nome, String cognome, int id, boolean raccomandato) {
    this.nome = nome;
    this.cognome = cognome;
    this.id = id;
    this.raccomandato = raccomandato;
  }

  public boolean isRaccomandato() {
    return raccomandato;
  }

  public void setRaccomandato(boolean raccomandato) {
    this.raccomandato = raccomandato;
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
