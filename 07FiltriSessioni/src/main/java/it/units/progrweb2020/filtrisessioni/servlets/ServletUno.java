
package it.units.progrweb2020.filtrisessioni.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giorgio
 */
public class ServletUno extends HttpServlet {

  private static final Logger log = Logger.getLogger(ServletUno.class.toString());

  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    log.info("Richiesta da: " + request.getRemoteAddr());
    PrintWriter out = response.getWriter();
    out.println("Servlet Uno RULEZ!");
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
