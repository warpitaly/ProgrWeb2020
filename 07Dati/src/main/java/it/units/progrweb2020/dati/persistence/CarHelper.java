package it.units.progrweb2020.dati.persistence;
import it.units.progrweb2020.dati.entities.Car;
import static com.googlecode.objectify.ObjectifyService.ofy;
import java.util.List;

/**
 *
 * @author giorgio
 */
public class CarHelper extends AbstractHelper<Car>{
  
  public List<Car> cercaAutoLusso(){
    return ofy().load().type(Car.class).filter("lussuosa", true).list();
  }
  
}
