package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.Interfaces.Horneador;
import edu.unisabana.pizzafactory.model.Interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.Interfaces.Amasador;
import edu.unisabana.pizzafactory.model.PizzaGruesa.CFabricaPizzaPanGruesa;
import edu.unisabana.pizzafactory.model.PizzaIntegral.CFabricaPizzaIntegral;
import edu.unisabana.pizzafactory.model.PizzaDelgada.CFabricaPizzaDelgada;
import edu.unisabana.pizzafactory.model.*;
import edu.unisabana.pizzafactory.model.AFabricaPizza;
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

            // Pizza delgada mediana
            AFabricaPizza fabricaDelgada = new CFabricaPizzaDelgada();
            pp.prepararPizza(fabricaDelgada, ingredientes, Tamano.MEDIANO);

            // Pizza pan gruesa pequeña
            AFabricaPizza fabricaGruesa = new CFabricaPizzaPanGruesa();
            pp.prepararPizza(fabricaGruesa, ingredientes, Tamano.PEQUENO);

            // Pizza integral mediana (opcional)
            AFabricaPizza fabricaIntegral = new CFabricaPizzaIntegral();
            pp.prepararPizza(fabricaIntegral, ingredientes, Tamano.MEDIANO);

        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName())
                  .log(Level.SEVERE, "Problema en la preparación de la Pizza", ex);
        }
    }

    public void prepararPizza(AFabricaPizza fabrica, Ingrediente[] ingredientes,
                              Tamano tam) throws ExcepcionParametrosInvalidos {

        Amasador amasador = fabrica.crearAmasador();
        Moldeador moldeador = fabrica.crearMoldeador();
        Horneador horneador = fabrica.crearHorneador();

        amasador.Amasar();

        if (null == tam) {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        } else switch (tam) {
            case PEQUENO:
                moldeador.moldearPizzaPequena();
                break;
            case MEDIANO:
                moldeador.moldearPizzaMediana();
                break;
            default:
                throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido: " + tam);
        }

        aplicarIngredientes(ingredientes);
        horneador.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
              .log(Level.INFO, "APLICANDO INGREDIENTES!: {0}", Arrays.toString(ingredientes));
    }
}
