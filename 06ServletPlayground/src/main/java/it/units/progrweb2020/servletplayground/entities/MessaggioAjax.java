package it.units.progrweb2020.servletplayground.entities;

import java.util.Date;

/**
 *
 * @author giorgio
 */
public class MessaggioAjax {
  
  private String mittente;
  private String oggetto;
  private Date quando = new Date();

  public String getMittente() {
    return mittente;
  }

  public void setMittente(String mittente) {
    this.mittente = mittente;
  }

  public String getOggetto() {
    return oggetto;
  }

  public void setOggetto(String oggetto) {
    this.oggetto = oggetto;
  }

  public Date getQuando() {
    return quando;
  }

  public void setQuando(Date quando) {
    this.quando = quando;
  }
  
  

}
