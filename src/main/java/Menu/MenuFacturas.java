package Menu;

import Almacenamiento.Almacen;
import Almacenamiento.gestionFacturas;
import Excepciones.NoEncontrado;

import java.util.Scanner;

class MenuFacturas {

    static Almacen main(Almacen almacen) throws NoEncontrado {

        gestionFacturas gestion = new gestionFacturas(almacen);

        // Igual, creamos las herramientas del menú
        opcionesFacturas[] menu = opcionesFacturas.values();
        Scanner scan = new Scanner(System.in);
        int opc;

        // Mostramos menú
        do {
            System.out.println("");
            for (opcionesFacturas m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.print("Elija una opción: ");
            opc = scan.nextInt();

            if (opc > 5 || opc <= 0)
                throw new IllegalArgumentException("La opción seleccionada no corresponde con ningún menú.");

            switch (opc) {
                case 1:
                    // Emitir factura
                    gestion.emitirFactura();
                    break;
                case 2:
                    // Recuperar datos de una factura (a partir de codigo)
                    gestion.recuperarFactura();
                    break;
                case 3:
                    // Recuperar facturas de un cliente
                    gestion.recuperarFacturasCliente();
                    break;
                case 4:
                    // Recuperar facturas emitidas entre dos fechas de un cliente
                    gestion.recuperarFacturasEntreFechas();
                    break;
            }
        } while (opc != 5);

        // Finalmente actualizamos el almacen de datos y lo devolvemos al menu principal para que esté actualizado
        almacen = gestion.getAlmacen();
        return almacen;
    }
}
