package Factoria;

import Tarifa.Tarifa;
import Tarifa.TarifaBasica;
import Tarifa.TarifaEspecialDia;
import Tarifa.TarifaEspecialHoras;

public class NuevasTarifas implements FabricaTarifas {


    @Override
    public TarifaBasica getTarBasic(double num) {
        return new TarifaBasica(num);
    }

    @Override
    public TarifaEspecialDia getTarEspDia(Tarifa tarifaAnterior, double precio, int diaSemana) {
        return new TarifaEspecialDia(tarifaAnterior, precio, diaSemana);
    }

    @Override
    public TarifaEspecialHoras getTarEspHoras(Tarifa tarifaAnterior, double precio, int horaIni, int horaFin) {
        return new TarifaEspecialHoras(tarifaAnterior, precio, horaIni, horaFin);
    }
}
