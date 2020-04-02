package it.units.progrweb2020.servletplayground.servlets;

import it.units.progrweb2020.servletplayground.Entities.MessaggioMVC;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giorgio
 */
public class InvertitoreMVC extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String ricevuta = request.getParameter("invertimi");
    
    MessaggioMVC mess = new MessaggioMVC();
    mess.setStringaOriginale(ricevuta);
    if (ricevuta == null) {
      mess.setStringaInverita("ERRORE!!!!! Stringa nulla");
      mess.setErrore(true);
    } else {
      String invertita = "";
      for (int i = ricevuta.length() - 1; i >= 0; i--) {
        invertita += ricevuta.charAt(i);
      }
      mess.setStringaInverita(invertita);
    }
    request.setAttribute("invertita", mess);
    request.getRequestDispatcher("/WEB-INF/show-inverted.jsp").forward(request, response);
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
