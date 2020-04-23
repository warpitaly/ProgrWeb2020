/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.units.progrweb2020.dati.servlets;

import com.googlecode.objectify.Key;
import it.units.progrweb2020.dati.entities.Car;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.googlecode.objectify.ObjectifyService.ofy;
import com.googlecode.objectify.Result;
import it.units.progrweb2020.dati.entities.Suv;
import it.units.progrweb2020.dati.persistence.CarHelper;
import it.units.progrweb2020.dati.persistence.SuvHelper;
import java.util.List;

/**
 *
 * @author giorgio
 */
public class SalvaOfy extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    try {
      /* TODO output your page here. You may use following sample code. */
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet SalvaOfy</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Servlet SalvaOfy at " + request.getContextPath() + "</h1>");

      Car auto = new Car();
      auto.setColore(123);
      auto.setModello("Audi A6");
      auto.setNonMiSalvare(100);

      Result<Key<Car>> res = ofy().save().entity(auto);
      out.println("<p>Id prima del salvataggio finale: " + auto.getId() +"</p>");
      res.now();
      out.println("<p>Id prima dopo la forzatura del salvataggio: " + auto.getId() +"</p>");

           
      
      //List<Car> cars = ofy().load().type(Car.class).list();
      List<Car> cars = ofy().load().type(Car.class).filter("modello", "Audi A5").list();
      out.println("<ul>");
      
      
      
      for(Car c: cars){
        out.println("<li>" + c.getModello() + "</li>");
      }
      
      out.println("</ul>");
      
      Car primaTrovata = ofy().load().type(Car.class).filter("modello", "Audi A5").first().now();
      
      
      Suv suv = new Suv();
      suv.setModello("Mercedes GLS");
      suv.setColore(987);
      suv.setQuantoInquina(100000);
      
      //ofy().save().entity(suv);
      SuvHelper.saveDelayed(suv);
      
      
      Car appenaSalvata = CarHelper.getById(Car.class, auto.getId());
      
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
