
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class AmasadorPizzaIntegral implements Amasador{
    
    @Override
    public void Amasar(){
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza con masa Integral.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
