package it.units.progrweb2020.dati.persistence;
import com.googlecode.objectify.Key;
import static com.googlecode.objectify.ObjectifyService.ofy;

/**
 *
 * @author giorgio
 */
public abstract class AbstractHelper<T> {
  public static <T> void saveDelayed(T t){
    ofy().save().entity(t);
  }
  
  public static <T> void saveNow(T t){
    ofy().save().entity(t).now();
  }
  
  public static <T> T getById(Class<T> c, Long id){
    Key<T> k = Key.create(c, id);
    return ofy().load().key(k).now();
  }
}
