package Serializable;

import Almacenamiento.Almacen;
import java.io.*;

public class EscritorAlmacen {

    public EscritorAlmacen(){
        super();
    }

    public void Escribe( Almacen almacen, String ficheroData){

        OutputStream streamEscritura;
        ObjectOutput streamEscrituraObjeto = null;
        try {
        try {
            streamEscritura = new FileOutputStream(ficheroData);
            streamEscrituraObjeto = new ObjectOutputStream(streamEscritura);
            streamEscrituraObjeto.writeObject(almacen);
        }
        finally {
            if(streamEscrituraObjeto != null)
                streamEscrituraObjeto.close();
        }} catch (IOException e){
            e.printStackTrace();
        }
    }
}
