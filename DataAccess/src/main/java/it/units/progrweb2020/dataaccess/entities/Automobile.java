/// NOTA!!! Questa entità non la salvo con l'ORM ma manualmente, è stata creata solo per far capire quanta fatica si fa (v. JDBC.java)


package it.units.progrweb2020.dataaccess.entities;

/**
 *
 * @author giorgio
 */
public class Automobile {
  private String modello;
  private String marca;
  private double prezzo;

  public String getModello() {
    return modello;
  }

  public void setModello(String modello) {
    this.modello = modello;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public double getPrezzo() {
    return prezzo;
  }

  public void setPrezzo(double prezzo) {
    this.prezzo = prezzo;
  }
  
  
}
