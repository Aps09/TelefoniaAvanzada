package Menu;

import Almacenamiento.Almacen;
import Almacenamiento.gestionIOs;
import Excepciones.NoEncontrado;

import java.util.Scanner;
import static Menu.opcionesMenuPrincipal.*;

public class MenuPrincipal {

    public static void main (String[] args) throws NoEncontrado {

        Almacen almacen = gestionIOs.CargadoDeDatos();
        if(almacen == null)
            almacen = new Almacen();

<<<<<<< HEAD
=======
        Almacen almacen = new Almacen();
>>>>>>> 96156bdc438a17b9a692bb02d0da8a7db683b72d


        if(almacen == null) almacen = new Almacen();

        opcionesMenuPrincipal[] menu = values();
        int opc;


        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("");
            for (opcionesMenuPrincipal m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.print("Elija una opción: ");
            opc = scan.nextInt();

            if(opc >= 7 || opc <= 0) throw new IllegalArgumentException("La opción seleccionada no corresponde con ningún menú.");
            switch (opc){
                case 1:
                    //MENU DE CLIENTES
                    almacen = MenuClientes.main(almacen);
                    break;
                case 2:
                    //MENU DE LLAMADAS
                    almacen = MenuLlamadas.main(almacen);
                    break;
                case 3:
                    //MENU DE FACTURAS
                    almacen = MenuFacturas.main(almacen);
                    break;

                case 4:
                    //MENU IN/OUTPUT
                    almacen = MenuIOs.main(almacen);
                    break;

                case 5:
                //MENU IN/OUTPUT
                    almacen = MenuTarifa.main(almacen);
                    break;

            }

        }while (opc != 6);

        // Guardado inmediato
        gestionIOs.GuardadoDeDatos(almacen);


    }

}
