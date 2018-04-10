package Almacenamiento;

import Fecha.Fecha;
import InterfazUsuario.datosLlamada;
import Llamadas.Llamada;

import java.util.ArrayList;
import Excepciones.NoEncontrado;

public class gestionLlamadas {


    private Almacen almacen;
    private Fechador<Llamada> fechador;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------

    public gestionLlamadas (Almacen almacen){
        this.almacen = almacen;
        this.fechador = new Fechador<Llamada>();
    }

    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------

    public void addLlamada() throws NoEncontrado {
        // Recogemos el NIF del usuario y creamos la llamada y la pasamos al almacen
        String NIF = datosLlamada.addLlamadaNIF();
        Llamada llamada = datosLlamada.addLlamada();
        this.almacen.addLlamada(NIF,llamada);
    }

    public void listarLlamadas() throws NoEncontrado {
        // Recogemos el NIF del cliente y mostramos las llamadas
        String NIF = datosLlamada.listarLlamadas();
        ArrayList<Llamada> llamadas = this.almacen.getLlamadas(NIF);
        for(Llamada llamada : llamadas) {
            System.out.print(llamada.toString());
            System.out.println("\n");
        }
    }

    public void ListarLlamadasEntreFechas() throws NoEncontrado {
        String NIF = datosLlamada.getNIFEntreFechas();
        Fecha fechaIni = datosLlamada.getFechaIni();
        Fecha fechaFin = datosLlamada.getFechaFin();

        if(fechaIni.compareTo(fechaFin)>0) throw new IllegalArgumentException("La fecha inicial es posterior a la final.");

        ArrayList<Llamada> listaLlamadas = almacen.getLlamadas(NIF);
        listaLlamadas = fechador.entreTiempos(listaLlamadas, fechaIni, fechaFin);

        for(Llamada llamada : listaLlamadas){
            System.out.println();
            System.out.print(llamada.toString());
            System.out.println("\n");
        }
    }

    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Almacen getAlmacen() {
        return this.almacen;
    }
}