package it.units.progrweb2020.rest.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author giorgio
 */
@Path("/library")
public class Library {
  
  @GET
  @Path("/hello")
  @Produces(MediaType.TEXT_PLAIN)
  public String helloWorld(){
    return "Hello world!";
  }
  
  
  @GET
  @Path("/hello")
  @Produces(MediaType.TEXT_HTML)
  public String helloWorldHtml(){
    return "Hello world! I love HTML";
  }
  
  @GET
  @Path("/book/{isbn}")
  public String getBookFromIsbn(@PathParam("isbn") String id){
    return "Eccoti il libro avente ISBN: " + id;
  }
  
  @PUT
  @Path("/book/{isbn}")  //questo concettualmente è errato, non dovrei passare i dati per creare l'entità come query parameters
  public String addBook(@PathParam("isbn") String id, @QueryParam("name") String name){
    return "Ho creato un libro con id " + id + " e nome " + name;
  }
  
  @DELETE
  @Path("/book/{isbn}")
  public String deleteBook(@PathParam("isbn") String id){
    return "Ho cancellato il libro " + id;
  }
  
  
}
