package Excepciones;

// Excepción que hace referencia a no haber encontrado un cliente en el almacén

class ClienteNoEncontradoException extends Exception {

    public ClienteNoEncontradoException(String msg){
        super(msg);
    }

}
