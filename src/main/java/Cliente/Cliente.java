package Cliente;

import Fecha.Fecha;
import Tarifa.Tarifa;
import Fecha.Fechable;
import java.io.Serializable;

public class Cliente implements Fechable, Serializable {

    private String nombre;
    private String NIF;
    private Direccion direccion;
    private String correo;
    private Fecha fecha_Alta;
    private Tarifa tarifa;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Cliente(){
        this.nombre = null;
        this.NIF = null;
        this.direccion = null;
        this.correo = null;
        this.fecha_Alta = null;
        this.tarifa = new Tarifa();
    }

    //------------------------------------------------------------------
    // GETTERS
    //------------------------------------------------------------------

    public Fecha getFecha(){
        return this.fecha_Alta;
    }

    public String getNIF(){
        return this.NIF;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }


    //------------------------------------------------------------------
    // SETTERS
    //------------------------------------------------------------------

    public void setFecha(Fecha fecha_Alta) {
        this.fecha_Alta = fecha_Alta;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
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
                "NIF = " + NIF + "\n" +
                "Direccion = " + direccion.toString() + "\n" +
                "Correo = " + correo + "\n" +
                "Fecha de alta = " + fecha_Alta.toString() + "\n" +
                "Tarifa = " + tarifa.getCantidad() + "€/min";
    }
}