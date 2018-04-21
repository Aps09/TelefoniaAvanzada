package Tarifa;

import Llamadas.Llamada;

public class TarifaBasica extends Tarifa{

    public TarifaBasica(double precio){
        super(precio);
    }

    public boolean tarifaActiva(Llamada llamada){
        return true;
    }


}
