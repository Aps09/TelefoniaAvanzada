package Tarifa;

import Llamadas.Llamada;

public class TarifaEspecialHoras extends TarifaEspecial {

    int horaIni;
    int horaFin;

    public TarifaEspecialHoras(Tarifa tarifaAnterior, double precio, int horaIni, int horaFin){
        super(tarifaAnterior, precio);
        this.horaIni = horaIni;
        this.horaFin = horaFin;
    }

    public int getHoraIni() {
        return horaIni;
    }

    public int getHoraFin(){
        return horaFin;
    }

    public boolean tarifaActiva(Llamada llamada){

        return (llamada.getHoraInicio() >= horaIni) && (llamada.getHoraInicio() <= horaFin);


    }




}
