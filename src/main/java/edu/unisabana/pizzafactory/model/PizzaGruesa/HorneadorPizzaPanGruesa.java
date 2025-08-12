/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.PizzaGruesa;

import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author pablo
 */
public class HorneadorPizzaPanGruesa implements Horneador {
    
    @Override
    public void hornear() {
        Logger.getLogger(AmasadorPizzaPanGruesa.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza gruesa con masa de pan.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
