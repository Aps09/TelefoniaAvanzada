package Llamadas;

import Fecha.Fecha;
import Fecha.Fechable;
import java.io.Serializable;

public class Llamada implements Fechable, Serializable{

    private String numeroTelefono;
    private Fecha fechaLlamada;
    private int duracion; //en minutos
    private int horaInicio; // en hora exacta

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Llamada(){
        this.numeroTelefono = null;
        this.fechaLlamada = null;
        this.duracion = -1;
        this.horaInicio = -1; // -1 implica desconocida, no debe quedarse con ésta
    }


    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------



    //------------------------------------------------------------------
    // GETTERS
    //------------------------------------------------------------------

    public Fecha getFecha() {
        return fechaLlamada;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getHoraInicio(){ return horaInicio;}


    //------------------------------------------------------------------
    // SETTERS
    //------------------------------------------------------------------

    public void setFechaLlamada(Fecha fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setHoraInicio(int horaInicio){ this.horaInicio = horaInicio; }


    //------------------------------------------------------------------
    // SETTERS
    //------------------------------------------------------------------


    @Override
    public String toString() {
        return  "Número de telefono = " + numeroTelefono + "\n" +
                "Fecha de llamada = " + fechaLlamada.toString() + "\n" +
                "A la hora = " + horaInicio + "\n" +
                "Duracion = " + duracion;
    }
}
