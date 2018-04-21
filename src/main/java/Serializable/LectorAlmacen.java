package Serializable;

import Almacenamiento.Almacen;
import Almacenamiento.gestionIOs;

import java.io.*;

public class LectorAlmacen {


    public LectorAlmacen(){
        super();
    }



    public Almacen lee (String ficheroData) {
        InputStream streamLectura;
        ObjectInput streamLecturaAlmacen = null;
        Almacen almacen = null;
        try {
            try {

                streamLectura = new FileInputStream((ficheroData));
                streamLecturaAlmacen = new ObjectInputStream(streamLectura);
                almacen = (Almacen) streamLecturaAlmacen.readObject();

            } finally {
                if (streamLecturaAlmacen != null)
                    streamLecturaAlmacen.close();
            }
        } catch (IOException | ClassNotFoundException e) {

            almacen = new Almacen();
            gestionIOs.GuardadoDeDatos(almacen);
        }

        return almacen;

    }

}
