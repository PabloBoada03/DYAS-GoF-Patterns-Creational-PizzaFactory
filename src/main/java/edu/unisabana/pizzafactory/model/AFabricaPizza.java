package edu.unisabana.pizzafactory.model;

import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;

public abstract class AFabricaPizza {
    
    public abstract Amasador crearAmasador();
    public abstract Moldeador crearMoldeador();
    public abstract Horneador crearHorneador();
}
