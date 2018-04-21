package Test;

import Almacenamiento.Almacen;
import Almacenamiento.gestionClientes;
import Cliente.Cliente;
import Cliente.Direccion;
import Fecha.Fecha;
import Tarifa.Tarifa;
import Tarifa.TarifaBasica;
import org.junit.Before;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestClientes {

    Cliente c1;
    gestionClientes gestion;
    Almacen almacen;


    @Before
    public void creaCliente(){
        c1 = new Cliente();

        c1.setNombre("Pepe");
        c1.setCorreo("Pepe@lasCosasDePepe");
        c1.setNIF("12345678A");

        c1.setFecha(new Fecha( 1, 12, 2017));
        c1.setDireccion(new Direccion( "Valencia", "C/ la Trinidad", 123 , 8, "a"));

        Tarifa tarifa = new TarifaBasica(25);
        c1.setTarifa(tarifa);
    }


    @Before
    public void creaAlmacenGestor(){
        almacen = new Almacen();
        gestion = new gestionClientes(almacen);
    }

    @Test
    public void testGetters() {
        assertEquals( 25.0, c1.getTarifa().getPrecio());

    }

    @Test
    public void testAñadirClientes(){
        //gestion.addCliente();
    }



}