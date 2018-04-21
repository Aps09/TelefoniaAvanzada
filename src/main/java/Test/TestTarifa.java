package Test;

import Excepciones.NoEncontrado;
import Fecha.Fecha;
import Llamadas.Llamada;
import Tarifa.*;
import Tarifa.TarifaBasica;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestTarifa {

    private Llamada llamada;

@Test
    public void tarifaBasYEspDiaTest() throws NoEncontrado {

        Tarifa tarBasica = new TarifaBasica(12.5);
        TarifaEspecial tarEspecial = new TarifaEspecialDia(tarBasica, 10, 5 ); // El día 5 es el viernes


        llamada = new Llamada();
        llamada.setDuracion(50);
        llamada.setHoraInicio(12);
        llamada.setNumeroTelefono("723981212");


        llamada.setFechaLlamada(new Fecha(2,12,2017)); // Este día era sábado
        assertEquals( 12.5, tarEspecial.getPrecio(llamada)); // Realiza la llamada en sábado, se aplica tarifa básica


        llamada.setFechaLlamada(new Fecha(20,04,2018)); //Este día era viernes
        assertEquals( 10.0, tarEspecial.getPrecio(llamada)); // Realiza la llamada en viernes, se aplica tarifa Especial de día

    }


    @Test
    public  void TarifaBasYEspHorTest() throws NoEncontrado{

        Tarifa tarBasica = new TarifaBasica(12.5);
        TarifaEspecial tarEspecial = new TarifaEspecialHoras(tarBasica, 10, 12,15 ); // El día 5 es el viernes


        llamada = new Llamada();
        llamada.setDuracion(50);
        llamada.setNumeroTelefono("723981212");
        llamada.setFechaLlamada(new Fecha(2,12,2017));


        llamada.setHoraInicio(10);
        assertEquals( 12.5, tarEspecial.getPrecio(llamada));

        llamada.setHoraInicio(16);
        assertEquals( 12.5, tarEspecial.getPrecio(llamada));

        llamada.setHoraInicio(12);
        assertEquals( 10.0, tarEspecial.getPrecio(llamada));

        llamada.setHoraInicio(14);
        assertEquals( 10.0, tarEspecial.getPrecio(llamada));

    }

    @Test
    public void TarifaCompleja() throws NoEncontrado{
        Tarifa tarBasica = new TarifaBasica(12.5);
        TarifaEspecial tarHora = new TarifaEspecialHoras(tarBasica, 10, 12,15 ); // Tarifa reducida de 12:00 a 15:59
        TarifaEspecial tarDia = new TarifaEspecialDia(tarHora, 5, 5 ); // Tarifa hipereducida para los viernes

        llamada = new Llamada();
        llamada.setDuracion(50);
        llamada.setNumeroTelefono("723981212");

        // CASO 1: NO SE APLICA NINGUNA DE LAS TARIFAS ESPECIALES
        llamada.setFechaLlamada(new Fecha(21,04,2018)); // Es Sábado
        llamada.setHoraInicio(17);                                      // Está fuera de la tarifa

        assertEquals( 12.5, tarDia.getPrecio(llamada));


        // CASO 2: SE APLICA LA TARIFA DE HORAS (lA REDUCIDA)
        llamada.setFechaLlamada(new Fecha(21,04,2018)); // Es Sábado
        llamada.setHoraInicio(13);                                      // Está dentro de la tarifa de horas

        assertEquals( 10.0, tarDia.getPrecio(llamada));


        // CASO 3: SE APLICA LA TARIFA DE DIA (LA HIPEREDUCIDA)

        llamada.setFechaLlamada(new Fecha(20,04,2018)); // Es Viernes
        llamada.setHoraInicio(10);                                      // Está dentro de la tarifa de horas

        assertEquals( 5.0, tarDia.getPrecio(llamada));
    }


}
