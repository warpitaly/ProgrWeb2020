package it.units.progrweb2020.servletplayground.Entities;

/**
 *
 * @author giorgio
 */
public class MessaggioMVC {
  
  private String stringaOriginale;
  private String stringaInverita;
  private boolean errore;

  public boolean isErrore() {
    return errore;
  }

  public void setErrore(boolean errore) {
    this.errore = errore;
  }
  

  
  public String getStringaOriginale() {
    return stringaOriginale;
  }

  public void setStringaOriginale(String stringaOriginale) {
    this.stringaOriginale = stringaOriginale;
  }

  public String getStringaInverita() {
    return stringaInverita;
  }

  public void setStringaInverita(String stringaInverita) {
    this.stringaInverita = stringaInverita;
  }
  
  
   

}
