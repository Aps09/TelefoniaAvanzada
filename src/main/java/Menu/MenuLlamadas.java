package Menu;

import Almacenamiento.Almacen;
import Almacenamiento.gestionLlamadas;
import Excepciones.NoEncontrado;

import java.util.Scanner;

class MenuLlamadas {

    static Almacen main(Almacen almacen) throws NoEncontrado {
        gestionLlamadas gestion = new gestionLlamadas(almacen);
        opcionesLlamadas[] menu = opcionesLlamadas.values();
        Scanner scan = new Scanner(System.in);
        int opc;

        // Mostramos menú
        do{
            System.out.println("");
            for (opcionesLlamadas m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.print("Elija una opción: ");
            opc = scan.nextInt();

            if(opc > 4 || opc <= 0) throw new IllegalArgumentException("La opción seleccionada no corresponde con ningún menú.");

            switch(opc){
                case 1:
                    // Añadir llamada
                    gestion.addLlamada();
                    break;
                case 2:
                    // Listar llamadas
                    gestion.listarLlamadas();
                    break;
                case 3:
                    // Listar llamadas entre fechas
                    gestion.ListarLlamadasEntreFechas();
                    break;
            }
        }while (opc != 4);

        almacen = gestion.getAlmacen();
        return almacen;
    }
}
