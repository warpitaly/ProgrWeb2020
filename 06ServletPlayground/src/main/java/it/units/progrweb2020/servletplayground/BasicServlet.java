package it.units.progrweb2020.servletplayground;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giorgio
 */
public class BasicServlet extends HttpServlet {


 
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try {
      
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("  <head>");
      out.println("    <title>ServletTTTT BasicServlet</title>");      
      out.println("  </head>");
      out.println("  <body>");
      Date d = new Date();
      out.println("    <h1>Servlet BasicServlet at " + d.toString() + "</h1>");
      
      Enumeration<String> params = request.getParameterNames();
      out.println("<h2>Parametri:</h2><ul>");
      while(params.hasMoreElements()){
        String paramName = params.nextElement();
        out.println("<li>"+paramName + ": ");
        out.println(request.getParameter(paramName) + "</li>");
      }
      out.println("</ul>");
      
      Enumeration<String> headers = request.getHeaderNames();
      out.println("<h2>Headers:</h2><ul>");
      while(headers.hasMoreElements()){
        String headerName = headers.nextElement();
        out.println("<li>"+headerName + ": ");
        out.println(request.getHeader(headerName) + "</li>");
      }
      out.println("</ul>");
      
      
      out.println("  </body>");
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
    return "Servlet basilare";
  }// </editor-fold>

}
