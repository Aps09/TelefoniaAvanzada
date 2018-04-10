package Llamadas;

import Fecha.Fecha;
import Fecha.Fechable;
import java.io.Serializable;

public class Llamada implements Fechable, Serializable{

    private String numeroTelefono;
    private Fecha fechaLlamada;
    private double duracion;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Llamada(){
        this.numeroTelefono = null;
        this.fechaLlamada = null;
        this.duracion = -1;
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


    //------------------------------------------------------------------
    // SETTERS
    //------------------------------------------------------------------

    public void setFechaLlamada(Fecha fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    //------------------------------------------------------------------
    // SETTERS
    //------------------------------------------------------------------


    @Override
    public String toString() {
        return  "Número de telefono = " + numeroTelefono + "\n" +
                "Fecha de llamada = " + fechaLlamada.toString() + "\n" +
                "Duracion = " + duracion;
    }
}
