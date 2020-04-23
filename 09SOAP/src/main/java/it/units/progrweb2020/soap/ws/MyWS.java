package it.units.progrweb2020.soap.ws;

import it.units.progrweb2020.soap.entities.Studente;
import it.units.progrweb2020.soap.entities.StudenteIscritto;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author giorgio
 */
@WebService(serviceName = "MyWS")
public class MyWS {

  /**
   * This is a sample web service operation
   */
  @WebMethod(operationName = "hello")
  public String hello(@WebParam(name = "name") String txt) {
    return "Hello " + txt + " !";
  }
  
  @WebMethod(operationName = "iscrivi")
  public StudenteIscritto iscrivi(
          @WebParam(name="persona", targetNamespace="http://soap.units.it")
          Studente s){
    StudenteIscritto nuovo = new StudenteIscritto(s);
    return nuovo;
  }
  
}
