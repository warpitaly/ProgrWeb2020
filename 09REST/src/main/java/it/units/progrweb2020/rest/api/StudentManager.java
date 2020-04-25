package it.units.progrweb2020.rest.api;

import it.units.progrweb2020.rest.entities.proxies.StudenteProxy;
import it.units.progrweb2020.rest.entities.storage.Studente;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author giorgio
 */
@Path("/studente")
public class StudentManager {

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public StudenteProxy getStudenteById(@PathParam("id") int id){
    //uso gli helper di persistance per ottenere lo STUDENTE con quell'ID
    Studente studVero = new Studente("giorgio", "Davanzo", 10, true);
    StudenteProxy studProxy = new StudenteProxy(studVero);
    return studProxy;
  }
  
  
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public String addStudente(StudenteProxy stud){ 
    //salvo lo studente nel DB
    String id = "a998882";
    return id;
  }
  
}
