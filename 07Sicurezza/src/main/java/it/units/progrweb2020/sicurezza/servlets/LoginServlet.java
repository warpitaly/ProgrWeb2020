
package it.units.progrweb2020.sicurezza.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author giorgio
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  private final String passwordSegreta = "pippo";
  


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
    String username = request.getParameter("user");
    String password = request.getParameter("pwd");
    if(username != null && password != null && password.equals(passwordSegreta)){
      HttpSession session = request.getSession();
      session.setAttribute("user", username);
      session.setMaxInactiveInterval(30*60);
      response.sendRedirect("/private/LoginSuccessful.jsp");
    }else{
      response.sendRedirect("/login.html");
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
