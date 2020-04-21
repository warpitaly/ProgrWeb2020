package it.units.progrweb2020.dati.utils;

import com.googlecode.objectify.ObjectifyService;
import it.units.progrweb2020.dati.entities.Car;
import it.units.progrweb2020.dati.entities.Suv;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author giorgio
 */
public class OfyStarter implements ServletContextListener{

  public void contextInitialized(ServletContextEvent sce) {
    
    ObjectifyService.register(Car.class);
    ObjectifyService.register(Suv.class);
    
  }

  public void contextDestroyed(ServletContextEvent sce) {
    
  }

}
