package Cliente;

import Fecha.Fecha;
import Tarifa.Tarifa;
import Fecha.Fechable;
import Tarifa.TarifaBasica;

import java.io.Serializable;

public class Cliente implements Fechable, Serializable {

    private String nif;
    private String nombre;
    private Direccion direccion;
    private String correo;
    private Fecha fecha_Alta;
    private Tarifa tarifa;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Cliente(){
        this.nif = null;
        this.nombre = null;
        this.direccion = null;
        this.correo = null;
        this.fecha_Alta = null;
        this.tarifa = new TarifaBasica(-1);
    }

    //------------------------------------------------------------------
    // GETTERS
    //------------------------------------------------------------------

    public String getNIF(){ return this.nif; }

    public Fecha getFecha(){
        return this.fecha_Alta;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }


    //------------------------------------------------------------------
    // SETTERS
    //------------------------------------------------------------------

    public void setNIF(String nif){ this.nif = nif; }

    public void setFecha(Fecha fecha_Alta) {
        this.fecha_Alta = fecha_Alta;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    //------------------------------------------------------------------
    // TO STRING
    //------------------------------------------------------------------

    @Override
    public String toString() {
        return "Nombre = " + nombre + "\n" +
                "NIF: " + nif + "\n" +
                "Direccion = " + direccion.toString() + "\n" +
                "Correo = " + correo + "\n" +
                "Fecha de alta = " + fecha_Alta.toString() + "\n" +
                "Tarifa = " + tarifa.getPrecio() + "€/min";
    }
}