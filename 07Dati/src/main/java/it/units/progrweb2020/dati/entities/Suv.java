package it.units.progrweb2020.dati.entities;

import com.googlecode.objectify.annotation.Subclass;

/**
 *
 * @author giorgio
 */
@Subclass(index=true)
public class Suv extends Car{
  
  protected int quantoInquina;

  public int getQuantoInquina() {
    return quantoInquina;
  }

  public void setQuantoInquina(int quantoInquina) {
    this.quantoInquina = quantoInquina;
  }
  
  

}
