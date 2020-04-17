package it.units.progrweb2020.dataaccess.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author giorgio
 */
@Entity
public class Libro extends Pubblicazione{
  
  private int numeroPagine;

  public int getNumeroPagine() {
    return numeroPagine;
  }

  public void setNumeroPagine(int numeroPagine) {
    this.numeroPagine = numeroPagine;
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
    if (!(object instanceof Libro)) {
      return false;
    }
    Libro other = (Libro) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "it.units.progrweb2020.dataaccess.entities.Libro[ id=" + id + " ]";
  }

}
