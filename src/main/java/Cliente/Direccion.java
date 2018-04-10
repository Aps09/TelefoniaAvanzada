package Cliente;
import java.io.Serializable;

public class Direccion implements Serializable {

    private String provincia;
    private String calle;
    private int num;
    private int piso;
    private String puerta;

    // -----------------------------------------------
    // CONSTRUCTORES
    // -----------------------------------------------

    public Direccion(String provincia, String calle, int num, int piso, String puerta){
        this.provincia = provincia;
        this.calle = calle;
        this.num = num;
        this.piso = piso;
        this.puerta = puerta;
    }

    // -------------------------------------------------------------------------
    // GETTERS
    // -------------------------------------------------------------------------



    // -------------------------------------------------------------------------
    // GETTERS
    // -------------------------------------------------------------------------


    @Override
    public String toString() {
        return calle + ", nº" + num + ", " + piso + "º"+ puerta + ", " + provincia;
    }
}
