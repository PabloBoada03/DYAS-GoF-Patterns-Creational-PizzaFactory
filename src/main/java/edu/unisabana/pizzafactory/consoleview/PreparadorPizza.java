package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparadorPizza {

    public static void main(String args[]) {
        try {
            Ingrediente[] ingredientes = {
                new Ingrediente("queso", 1),
                new Ingrediente("jamon", 2)
            };

            PreparadorPizza pp = new PreparadorPizza();

            //Pizza delgada mediana
            pp.prepararPizza(
                new AmasadorPizzaDelgada(),
                new MoldeadorPizzaDelgada(),
                new HorneadorPizzaDelgada(),
                ingredientes,
                Tamano.MEDIANO
            );

            //Pizza pan gruesa pequeña
            pp.prepararPizza(
                new AmasadorPizzaPanGruesa(),
                new MoldeadorPizzaPanGruesa(),
                new HorneadorPizzaPanGruesa(),
                ingredientes,
                Tamano.PEQUENO
            );

        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName())
                  .log(Level.SEVERE, "Problema en la preparación de la Pizza", ex);
        }
    }

    public void prepararPizza(Amasador amasador, Moldeador moldeador,
                              Horneador horneador, Ingrediente[] ingredientes,
                              Tamano tam) throws ExcepcionParametrosInvalidos {

        amasador.Amasar();

        if (tam == Tamano.PEQUENO) {
            moldeador.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            moldeador.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }

        aplicarIngredientes(ingredientes);
        horneador.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
              .log(Level.INFO, "APLICANDO INGREDIENTES!: {0}", Arrays.toString(ingredientes));

        // Aquí iría el código para el microcontrolador
    }
}
