package Almacenamiento;

import Excepciones.NoEncontrado;
import Fecha.Fecha;
import InterfazUsuario.datosLlamada;
import Llamadas.Llamada;

import java.util.ArrayList;

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


    //0 es el domingo, miercoles el 3 y el sábado el 6

    public static int getDiaSemana(Llamada llamada) throws NoEncontrado{

        int a = llamada.getFecha().getAnyo();
        int p = llamada.getFecha().getMes();
        int d = llamada.getFecha().getDia();
        int m;
        p--;

        if ((a%4==0) && (a%100==0) && (a%400==0)){
            int[] vector = new int[]{0, 3, 4,0,2,5,0,3,6,1,4,6};
            m = vector[p];
        }else{
            int[] vector = new int[]{0, 3, 3,6,1,4,6,2,5,0,3,5};
            m = vector[p];
        }


        int n1 = (a-1)%7;
        int n2 = ( (a-1) / 4 - 3* ((a-1)/100 +1)/4) % 7;
        int n3 = m;
        int n4 = d%7;

        return (n1+n2+n3+n4)%7;


    }

    //------------------------------------------------------------------
    // GETTERS Y SETTERS
    //------------------------------------------------------------------

    public Almacen getAlmacen() {
        return this.almacen;
    }
}