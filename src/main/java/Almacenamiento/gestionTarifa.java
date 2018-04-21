package Almacenamiento;


import Excepciones.NoEncontrado;
import InterfazUsuario.datosTarifa;
import Cliente.*;
import Llamadas.Llamada;
import Tarifa.*;

public class gestionTarifa {


    private Almacen almacen;
   // private Tarifa tarifa;

    public gestionTarifa ( Almacen almacen ){
        this.almacen = almacen;
    }


    public void setTarifaBasica(Almacen almacen) throws NoEncontrado {
        String NIF = datosTarifa.donaDNI();
        Cliente cliente = this.almacen.getCliente(NIF);

        cliente.getTarifa().setPrecio(datosTarifa.donaquaCentPorMin());
    }


    public void setTarifaEspecialHoras (Almacen almacen) throws NoEncontrado {
        String NIF = datosTarifa.donaDNI();
        Cliente cliente = this.almacen.getCliente(NIF);
        int[] franja = datosTarifa.donaFranjaDeHoras();

        Tarifa viejaTarifa = cliente.getTarifa();
        Tarifa nuevaTarifa = new TarifaEspecialHoras( viejaTarifa, datosTarifa.donaquaCentPorMin(), franja[0], franja[1]);

        cliente.setTarifa(nuevaTarifa);
    }

    public void setTarifaEspecialDia (Almacen almacen) throws NoEncontrado {
        String NIF = datosTarifa.donaDNI();
        Cliente cliente = this.almacen.getCliente(NIF);

        int diaEspecial = datosTarifa.donaDia();

        Tarifa viejaTarifa = cliente.getTarifa();
        Tarifa nuevaTarifa = new TarifaEspecialDia( viejaTarifa, datosTarifa.donaquaCentPorMin(), diaEspecial);

        cliente.setTarifa(nuevaTarifa);
    }

    public double getTarifaMomento(Almacen almacen) throws NoEncontrado{
        String NIF = datosTarifa.donaDNI();
        Cliente cliente = this.almacen.getCliente(NIF);

        return (cliente.getTarifa().getPrecio());

    }

    public Almacen getAlmacen() {
        return this.almacen;
    }
}
