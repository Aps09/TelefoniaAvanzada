package Menu;

import Almacenamiento.Almacen;
import Almacenamiento.gestionClientes;
import Excepciones.NoEncontrado;

import java.util.Scanner;

class MenuClientes {

    static Almacen main(Almacen almacen) throws NoEncontrado {
        // Creamos la herramienta que nos ayudará a gestionar los clientes
        gestionClientes gestion = new gestionClientes(almacen);

        // Igual, creamos las herramientas del menú
        opcionesCliente[] menu = opcionesCliente.values();
        Scanner scan = new Scanner(System.in);
        int opc;

        // Mostramos menú
        do{
            System.out.println("");
            for (opcionesCliente m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.print("Elija una opción: ");
            opc = scan.nextInt();

            if(opc > 7 || opc <= 0) throw new IllegalArgumentException("La opción seleccionada no corresponde con ningún menú.");

            switch(opc){
                case 1:
                    // Añadir cliente
                    gestion.addCliente();
                    break;
                case 2:
                    // Borrar cliente
                    gestion.deleteCliente();
                    break;
                case 3:
                    // Cambiar tarifa de un cliente
                    gestion.CambiarTarifaBasica();
                    break;
                case 4:
                    // Recoger datos de un cliente
                    gestion.getDatosCliente();
                    break;
                case 5:
                    // Recoger datos de todos los clientes
                    gestion.getDatosClientes();
                    break;
                case 6:
                    // Recoger datos de clientes entre fechas
                    gestion.getClienteFechas();
                    break;
            }
        }while (opc != 7);

        // Finalmente actualizamos el almacen de datos y lo devolvemos al menu principal para que esté actualizado
        almacen = gestion.getAlmacen();
        return almacen;
    }
}
