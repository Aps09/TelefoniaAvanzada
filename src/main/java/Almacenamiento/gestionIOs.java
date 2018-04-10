package Almacenamiento;

import Serializable.EscritorAlmacen;
import Serializable.LectorAlmacen;

public class gestionIOs {

    private Almacen almacen;
    private String fichero;

    //------------------------------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------------------------------


    public gestionIOs (Almacen almacen, String fichero){
        this.almacen = almacen;
        this.fichero = fichero;
    }

    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------


    public Almacen CargadoDeDatos(){
        LectorAlmacen lectura = new LectorAlmacen();
        almacen = lectura.lee(fichero);
        return almacen;
    }

    public void GuardadoDeDatos(){
        EscritorAlmacen escritura = new EscritorAlmacen();
        escritura.Escribe(this.almacen, this.fichero);
    }

    public Almacen getAlmacen() {
        return this.almacen;
    }



}
