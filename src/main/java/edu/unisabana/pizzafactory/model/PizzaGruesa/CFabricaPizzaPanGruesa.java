/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.pizzafactory.model.PizzaGruesa;

import edu.unisabana.pizzafactory.model.AFabricaPizza;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;

/**
 *
 * @author pablo
 */
public class CFabricaPizzaPanGruesa extends AFabricaPizza{

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaPanGruesa();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaPanGruesa();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaPanGruesa();
    }
    
}
