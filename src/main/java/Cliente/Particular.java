package Cliente;

public class Particular extends Cliente {

    private String apellido;

    public Particular(String apellido){
        super();
        this.apellido = apellido;
    }

    // ---------------------------------------------------------------------------
    // GETTERS
    // ---------------------------------------------------------------------------

    public String getApellido(){
        return this.apellido;
    }


    // ---------------------------------------------------------------------------
    // SETTERS
    // ---------------------------------------------------------------------------

    public void setApellido(String apellido){
        this.apellido = apellido;
    }


    // ---------------------------------------------------------------------------
    // TO STRING
    // ---------------------------------------------------------------------------

    @Override
    public String toString() {
        String frase = super.toString();
        frase = frase + "\n" + "Apellido: " + this.apellido;
        return frase;
    }
}