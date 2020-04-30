package it.units.progrweb2020.rest.api;

import it.units.progrweb2020.rest.entities.proxies.Todo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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

@Path("/todos")
public class TodoManager {
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Todo> getTodos(){
    List<Todo> todos = new ArrayList<Todo>();
    todos.add(new Todo("1", false, "Primo ToDo"));
    todos.add(new Todo("2", false, "Secondo ToDo"));
    todos.add(new Todo("3", false, "Terzo ToDo"));
    todos.add(new Todo("4", false, "Quarto ToDo"));
    
    return todos;
  }
  
  
  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Todo addTodo(Todo newTodo){
    UUID uuid = UUID.randomUUID();
    newTodo.setId(uuid.toString());
    return newTodo;
  }
  
  @DELETE
  @Path("/{id}")
  public String deleteTodo(@PathParam("id") String id){
    return "{}";
  }

}
