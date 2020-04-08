package it.units.progrweb2020.sicurezzajwt.setups;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author giorgio
 */
@WebListener
public class FirebaseBootstrapper implements ServletContextListener {

  private static final Logger log = Logger.getLogger(FirebaseBootstrapper.class.toString());
  
  public void contextInitialized(ServletContextEvent sce) {
    try {
      FirebaseOptions options = new FirebaseOptions.Builder()
              .setCredentials(GoogleCredentials.fromStream(new FileInputStream(new File("WEB-INF/credenzialiFirebase.json"))))
              .setDatabaseUrl("https://progrweb2020.firebaseio.com")
              .build();
      FirebaseApp.initializeApp(options);
      log.info("Firebase operativo");
    } catch (Exception e) {
      log.log(Level.SEVERE, "Errore inizializzazione Firebase: " + e, e);
    }
  }
  
  public void contextDestroyed(ServletContextEvent sce) {
    
  }
  
}
