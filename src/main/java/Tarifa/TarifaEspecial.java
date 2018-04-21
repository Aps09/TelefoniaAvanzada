package Tarifa;

import Excepciones.NoEncontrado;
import Llamadas.Llamada;

public abstract class TarifaEspecial extends Tarifa {

    Tarifa tarifaAnterior;

    public TarifaEspecial(Tarifa tarifaAnterior, double precio) {
        super(precio);
        this.tarifaAnterior = tarifaAnterior;
    }

    public abstract boolean tarifaActiva(Llamada llamada) throws NoEncontrado;

    // Sobrecargamos getPrecio, pero seguimos dando la tarea clara de devolver el valor de precio a super


    public double getPrecio(Llamada llamada) throws NoEncontrado {

        // super referencia el precio propio. Por la construcción de la madre
        // tarifaAnterior es el resto de tarifas que se accederán de manera recursiva

        if (tarifaActiva(llamada) && tarifaAnterior.getPrecio() > super.getPrecio()) {
            return super.getPrecio(llamada);
        }

        return tarifaAnterior.getPrecio(llamada);


    }
}