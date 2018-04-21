package Tarifa;

import Almacenamiento.gestionLlamadas;
import Excepciones.NoEncontrado;
import Llamadas.Llamada;

public class TarifaEspecialDia extends TarifaEspecial{

    int diaSemana;

    public TarifaEspecialDia(Tarifa tarifaAnterior, double precio, int diaSemana){
        super(tarifaAnterior, precio);
        this.diaSemana = diaSemana;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public boolean tarifaActiva(Llamada llamada) throws NoEncontrado {

        return gestionLlamadas.getDiaSemana(llamada) == diaSemana;


    }
}
