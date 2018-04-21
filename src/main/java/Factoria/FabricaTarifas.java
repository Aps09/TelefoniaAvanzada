package Factoria;


import Tarifa.*;
public interface FabricaTarifas {
    TarifaBasica getTarBasic(double num);
    TarifaEspecialDia getTarEspDia(Tarifa tarifaAnterior, double precio, int diaSemana );
    TarifaEspecialHoras getTarEspHoras(Tarifa tarifaAnterior, double precio, int horaIni, int horaFin);
public interface FabricaTarifas {

}
