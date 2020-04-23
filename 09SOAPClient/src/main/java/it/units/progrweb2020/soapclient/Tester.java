package it.units.progrweb2020.soapclient;

/**
 *
 * @author giorgio
 */
public class Tester {

  public static void main(String[] args) {
    MyWS_Service srv = new MyWS_Service();
    MyWS ws = srv.getMyWSPort();
    
    Studente stud = new Studente();
    stud.setCognome("Davanzo");
    stud.setNome("Giorgio");
    
    StudenteIscritto iscr = ws.iscrivi(stud);
    
    System.out.println("Matricola: " + iscr.getMatricola());
    
  }
}
