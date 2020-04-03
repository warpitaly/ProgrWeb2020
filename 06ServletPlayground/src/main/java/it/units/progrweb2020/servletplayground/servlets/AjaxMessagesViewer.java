
package it.units.progrweb2020.servletplayground.servlets;

import com.google.appengine.repackaged.com.google.gson.Gson;
import it.units.progrweb2020.servletplayground.entities.MessaggioAjax;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giorgio
 */
public class AjaxMessagesViewer extends HttpServlet {

  

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
    List<MessaggioAjax> messaggi = new ArrayList<MessaggioAjax>();
    Random rand = new Random();
    int nMessaggi = rand.nextInt(10);
    String[] mittenti = {"Giorgio", "Alberto", "Eric", "Andrea", "Laura"};
    String[] oggetti = {"Ciao!", "Bella lì!", "Whey!", "VIRUS", "SPAM"};
    for (int i = 0; i < nMessaggi; i++) {
      MessaggioAjax m = new MessaggioAjax();
      m.setMittente(mittenti[rand.nextInt(mittenti.length)]);
      m.setOggetto(oggetti[rand.nextInt(oggetti.length)]);
      messaggi.add(m);
    }
    request.setAttribute("messaggi", messaggi);
    
    
    if(request.getParameter("json")!=null){
      response.setContentType("application/json");
      Gson gson = new Gson();
      String out = gson.toJson(messaggi);
      response.getWriter().println(out);
    }else if(request.getParameter("partial") != null){
      request.getRequestDispatcher("/WEB-INF/SelfUpdatingPartial.jsp").forward(request, response);
    }else{
      request.getRequestDispatcher("/WEB-INF/SelfUpdating.jsp").forward(request, response);
    }
    
  }

 

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }

}
