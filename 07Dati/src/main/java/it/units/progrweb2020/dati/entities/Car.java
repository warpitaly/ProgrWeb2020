package it.units.progrweb2020.dati.entities;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Ignore;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.condition.IfTrue;

/**
 *
 * @author giorgio
 */
@Entity
public class Car {
  @Id
  protected Long id;
  
  @Index
  protected String modello;
  
  protected int colore;
  
   
  
  protected byte[] icona;
  
  @Index(IfTrue.class)
  protected boolean lussuosa;
  
  @Ignore
  protected int nonMiSalvare;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public boolean isLussuosa() {
    return lussuosa;
  }

  public void setLussuosa(boolean lussuosa) {
    this.lussuosa = lussuosa;
  }

  
  
  public String getModello() {
    return modello;
  }

  public void setModello(String modello) {
    this.modello = modello;
  }

  public int getColore() {
    return colore;
  }

  public void setColore(int colore) {
    this.colore = colore;
  }

  public byte[] getIcona() {
    return icona;
  }

  public void setIcona(byte[] icona) {
    this.icona = icona;
  }

  public int getNonMiSalvare() {
    return nonMiSalvare;
  }

  public void setNonMiSalvare(int nonMiSalvare) {
    this.nonMiSalvare = nonMiSalvare;
  }
  
  
  
}
