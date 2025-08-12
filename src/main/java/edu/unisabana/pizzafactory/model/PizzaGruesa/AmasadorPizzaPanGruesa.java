
package edu.unisabana.pizzafactory.model.PizzaGruesa;


import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author pablo
 */
public class AmasadorPizzaPanGruesa implements Amasador {
    @Override
    public void Amasar(){
        Logger.getLogger(AmasadorPizzaPanGruesa.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza Gruesa con masa de Pan.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
            
}
