package it.units.progrweb2020.soap.entities;

/**
 *
 * @author giorgio
 */
public class StudenteIscritto extends Studente{
  private int matricola;

  public StudenteIscritto() {
  }

  public StudenteIscritto(Studente s){
    this.setCognome(s.getCognome());
    this.setNome(s.getNome());
    
    matricola = s.getCognome().hashCode();
  }
  
  public int getMatricola() {
    return matricola;
  }

  public void setMatricola(int matricola) {
    this.matricola = matricola;
  }
  
  
}
