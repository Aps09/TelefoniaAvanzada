package Menu;
import Almacenamiento.Almacen;
import Almacenamiento.gestionIOs;
import java.util.Scanner;

class MenuIOs {

    static Almacen main(Almacen almacen) {

        opcionesIOs[] menu = opcionesIOs.values();
        Scanner scan = new Scanner(System.in);
        int opc;

        do {
            System.out.println("");
            for (opcionesIOs m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.print("Elija una opción: ");
            opc = scan.nextInt();
            if (opc >= 4 || opc <= 0)
                throw new IllegalArgumentException("La opción seleccionada no corresponde con ningún menú.");

            switch (opc) {
                case 1:
                    // Forzar Cargado
                    almacen = gestionIOs.CargadoDeDatos();

                    break;
                case 2:
                    // Forzar Guardado
                    gestionIOs.GuardadoDeDatos(almacen);
                    break;
            }
        } while (opc != 3);

    return almacen;
    }
}
