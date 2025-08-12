
package edu.unisabana.pizzafactory.model.PizzaDelgada;

import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class AmasadorPizzaDelgada implements Amasador{

    
    @Override
    public void Amasar() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
