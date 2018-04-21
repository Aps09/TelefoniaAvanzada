package Test;

import Almacenamiento.gestionLlamadas;
import Excepciones.NoEncontrado;
import Fecha.Fecha;
import Llamadas.Llamada;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestDiaSemana {



    @Test
    public void diaCorrecto() throws NoEncontrado {
        Llamada llamada = new Llamada();

        llamada.setDuracion(50);
        llamada.setHoraInicio(12);
        llamada.setNumeroTelefono("723981212");


        llamada.setFechaLlamada(new Fecha(28,11,2017));
        int diaTeorico = gestionLlamadas.getDiaSemana(llamada);
        assertEquals(2, diaTeorico);


        llamada.setFechaLlamada(new Fecha(3,12,2017));
        diaTeorico = gestionLlamadas.getDiaSemana(llamada);
        assertEquals(0, diaTeorico);


        llamada.setFechaLlamada(new Fecha(21,4,2018));
        diaTeorico = gestionLlamadas.getDiaSemana(llamada);
        assertEquals(6, diaTeorico);
    }


}
