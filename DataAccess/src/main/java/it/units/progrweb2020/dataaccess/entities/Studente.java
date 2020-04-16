package it.units.progrweb2020.dataaccess.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Studente implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private String nome;
  
  private String cognome;
  
  public int annoImmatricolazione;

  public int getAnnoImmatricolazione() {
    return annoImmatricolazione;
  }

  public void setAnnoImmatricolazione(int annoImmatricolazione) {
    this.annoImmatricolazione = annoImmatricolazione;
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
  
  

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Studente)) {
      return false;
    }
    Studente other = (Studente) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "it.units.progrweb2020.dataaccess.entities.Studente[ id=" + id + " ]";
  }

}
