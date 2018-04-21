package Almacenamiento;

import Serializable.EscritorAlmacen;
import Serializable.LectorAlmacen;

public class gestionIOs {

    private static String FICHERO = "Serializable.ficheroData";

    //------------------------------------------------------------------
    // METODOS DE USO
    //------------------------------------------------------------------

    public static Almacen CargadoDeDatos(){
        LectorAlmacen lectura = new LectorAlmacen();
        Almacen almacen = lectura.lee(FICHERO);
        return almacen;
    }

    public static void GuardadoDeDatos(Almacen almacen){
        EscritorAlmacen escritura = new EscritorAlmacen();
        escritura.Escribe(almacen, FICHERO);
    }

}
