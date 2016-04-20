/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apachedoc.log4j;

/**
 *
 * @author ayrat
 */
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
 
public class ApacheDoc {
 
    // Define a static logger variable so that it references the
    // Logger instance named "MyApp".
    private static final Logger logger = LogManager.getLogger(ApacheDoc.class);
 
    public static void main(final String... args) {
 
        // Set up a simple configuration that logs on the console.
 
        logger.trace("Entering application.");
        Bar bar = new Bar();
        if (!bar.doIt()) {
            logger.error("Didn't do it.");
        }
        logger.trace("Exiting application.");
    }
}
