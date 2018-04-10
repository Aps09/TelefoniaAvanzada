package Excepciones;

// Excepción para llamadas con duración igual o menor a 0
class DuracionNoValidaException extends Exception {

    public DuracionNoValidaException(String msg) {
        super(msg);
    }

}
