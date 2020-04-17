package it.units.progrweb2020.dataaccess.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author giorgio
 */
@Entity
public class Esame implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private int voto;
  @Temporal(javax.persistence.TemporalType.DATE)
  private Date dataEsame;
  
  @ManyToOne
  private Studente stud;
  
  @ManyToOne
  private Corso corso;

  public int getVoto() {
    return voto;
  }

  public void setVoto(int voto) {
    this.voto = voto;
  }

  public Date getDataEsame() {
    return dataEsame;
  }

  public void setDataEsame(Date dataEsame) {
    this.dataEsame = dataEsame;
  }

  public Studente getStud() {
    return stud;
  }

  public void setStud(Studente stud) {
    this.stud = stud;
  }

  public Corso getCorso() {
    return corso;
  }

  public void setCorso(Corso corso) {
    this.corso = corso;
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
    if (!(object instanceof Esame)) {
      return false;
    }
    Esame other = (Esame) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "it.units.progrweb2020.dataaccess.entities.Esame[ id=" + id + " ]";
  }

}
