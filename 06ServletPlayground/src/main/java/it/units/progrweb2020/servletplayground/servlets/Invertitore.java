
package it.units.progrweb2020.servletplayground.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giorgio
 */

@WebServlet("/Invertitore")
public class Invertitore extends HttpServlet {

 


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
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try {
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet Invertitore</title>");      
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Inverto!</h1>");
      String ricevuta = request.getParameter("invertimi");
      String invertita = "";
      for (int i = ricevuta.length() -1; i >=0; i--) {
        invertita += ricevuta.charAt(i);
      }
      out.println("<p>Invertita: <strong>" + invertita + "</strong></p>");
      out.println("</body>");
      out.println("</html>");
    } finally {
      out.close();
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
  }// </editor-fold>

}
