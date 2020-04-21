
package it.units.progrweb2020.dati.servlets;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Query;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giorgio
 */
public class SalvaManuale extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    
    Entity stud = new Entity("Studente");
    stud.setIndexedProperty("nome", "Paperon");
    stud.setIndexedProperty("cognome", "de Paperoni");
    stud.setUnindexedProperty("fuoriCorso", false);
    
    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    datastore.put(stud);
    
    Entity address = new Entity("Indirizzo", stud.getKey());
    address.setProperty("Via", "Collina Scassamotori, 1");
    address.setProperty("Citta", "Paperopoli");
    datastore.put(address);
    
    Query q = new Query("Studente");
    List<Entity> results = datastore.prepare(q).asList(FetchOptions.Builder.withDefaults());
    
    
    PrintWriter out = response.getWriter();
    try {
      /* TODO output your page here. You may use following sample code. */
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet SalvaManuale</title>");      
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Studenti trovati: " + results.size() + "</h1>");
      
      out.println("<ul>");
      
      for(Entity e: results){
        out.println("<li>" + e.getProperty("nome") + "</li>");
      }
      
      out.println("</ul>");
      
      out.println("</body>");
      out.println("</html>");
    } finally {
      out.close();
    }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
