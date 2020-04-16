package it.units.progrweb2020.dataaccess;

import it.units.progrweb2020.dataaccess.entities.Automobile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giorgio
 */
public class JDBC {
  
  public static void main(String[] args){
    try{
      Connection conn = DriverManager.getConnection("jdbc:MYSQL://localhost/progrweb?serverTimezone=UTC", "units", "units");
      Statement stmt = conn.createStatement();
      String sql = "Select * from Automobili";
      ResultSet rs = stmt.executeQuery(sql);
      
      List<Automobile> cars = new ArrayList<Automobile>();
      while(rs.next()){
        System.out.println(rs.getString("modello"));
        Automobile a = new Automobile();
        a.setModello(rs.getString("modello"));
        a.setMarca(rs.getString("marca"));
        a.setPrezzo(rs.getDouble("prezzo"));
        cars.add(a);
      }
      
    }catch(Exception e){
      System.out.println("Errore!!! " + e);
    }
  }

}
