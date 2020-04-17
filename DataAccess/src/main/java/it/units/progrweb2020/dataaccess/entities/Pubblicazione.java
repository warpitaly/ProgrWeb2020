package it.units.progrweb2020.dataaccess.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

/**
 *
 * @author giorgio
 */
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  //<<--- questa non funzionava, misteri!!
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Pubblicazione implements Serializable {
  
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Long id;

  protected String titolo;
  @Temporal(javax.persistence.TemporalType.DATE)
  protected Date dataPubblicazione = new Date();
  
  protected String nomeAutore;

  public String getTitolo() {
    return titolo;
  }

  public void setTitolo(String titolo) {
    this.titolo = titolo;
  }

  public Date getDataPubblicazione() {
    return dataPubblicazione;
  }

  public void setDataPubblicazione(Date dataPubblicazione) {
    this.dataPubblicazione = dataPubblicazione;
  }

  public String getNomeAutore() {
    return nomeAutore;
  }

  public void setNomeAutore(String nomeAutore) {
    this.nomeAutore = nomeAutore;
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
    if (!(object instanceof Pubblicazione)) {
      return false;
    }
    Pubblicazione other = (Pubblicazione) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "it.units.progrweb2020.dataaccess.entities.Pubblicazione[ id=" + id + " ]";
  }

}
