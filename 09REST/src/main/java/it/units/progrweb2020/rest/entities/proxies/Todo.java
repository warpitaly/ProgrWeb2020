package it.units.progrweb2020.rest.entities.proxies;

/**
 *
 * @author giorgio
 */
public class Todo {
  private String id;
  private boolean completed;
  private String title;

  public Todo() {
  }

  public Todo(String id, boolean completed, String title) {
    this.id = id;
    this.completed = completed;
    this.title = title;
  }
  
  

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
  
  
}
