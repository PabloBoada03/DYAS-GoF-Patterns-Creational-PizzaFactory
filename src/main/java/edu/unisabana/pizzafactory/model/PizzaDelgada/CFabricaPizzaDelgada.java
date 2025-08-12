/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.PizzaDelgada;

import edu.unisabana.pizzafactory.model.AFabricaPizza;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;

/**
 *
 * @author pablo
 */
public class CFabricaPizzaDelgada extends AFabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaDelgada(); 
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada(); 
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }
    
}
