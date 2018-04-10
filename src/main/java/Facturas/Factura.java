package Facturas;

import Fecha.Fecha;
import Tarifa.Tarifa;
import Fecha.Fechable;
import java.io.Serializable;
public class Factura implements Fechable, Serializable {

    private int codigo;
    private Tarifa tarifa;
    private Fecha fechaEmision;
    private Periodo periodo;
    private double importe;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public Factura(){
        this.codigo = -1;
        this.tarifa = new Tarifa();
        this.fechaEmision = null;
        this.periodo = new Periodo();
        this.importe = -1;
    }

    //------------------------------------------------------------------
    // GETTERS
    //------------------------------------------------------------------

    public int getCodigo() {
        return codigo;
    }

    public Fecha getFecha() {
        return fechaEmision;
    }

    private double getImporte() {
        return importe;
    }

    //------------------------------------------------------------------
    // SETTERS
    //------------------------------------------------------------------

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public void setFecha(Fecha fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    //------------------------------------------------------------------
    // TO STRING
    //------------------------------------------------------------------

    public String toString() {

        return "Código: "+ this.codigo + "\n"+
                "Tarifa: "+ this.tarifa.getCantidad() + "€/min \n" +
                "Fecha: "+ this.getFecha().toString() + "\n" +
                "Periodo: " + this.periodo.getInicio() + " - " + this.periodo.getFin() + "\n" +
                "Importe: " + this.getImporte();
    }
}
