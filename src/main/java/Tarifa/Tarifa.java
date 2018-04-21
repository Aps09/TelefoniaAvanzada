package Tarifa;
import Excepciones.NoEncontrado;
import Llamadas.Llamada;

import java.io.Serializable;

public abstract class Tarifa implements Serializable {

    private double precio;

    public Tarifa(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public double getPrecio(Llamada llamada) throws NoEncontrado {return precio;}

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public abstract boolean tarifaActiva(Llamada llamada) throws NoEncontrado;





}
