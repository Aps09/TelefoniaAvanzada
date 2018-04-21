package Menu;

import Almacenamiento.Almacen;
import Almacenamiento.gestionTarifa;
import Excepciones.NoEncontrado;

import java.util.Scanner;

public class MenuTarifa {

    static Almacen main(Almacen almacen) throws NoEncontrado {
        gestionTarifa gestion = new gestionTarifa(almacen);


        opcionesTarifa[] menu = opcionesTarifa.values();
        Scanner scan = new Scanner(System.in);
        int opc;

        do{
            System.out.println("");
            for (opcionesTarifa m : menu) {
                System.out.printf("%d) %s%n", m.ordinal() + 1, m.name());
            }

            System.out.print("Elija una opción: ");
            opc = scan.nextInt();

            if(opc > 5 || opc <= 0) throw new IllegalArgumentException("La opción seleccionada no corresponde con ningún menú.");

            switch(opc){
                case 1:
                    // Cambiar Tarifa Básica
                    gestion.setTarifaBasica( almacen);
                    break;
                case 2:
                    // Dar/Cambiar Tarifa EspecialHoras
                    gestion.setTarifaEspecialHoras(almacen);
                    break;
                case 3:
                    // Dar/Cambiar Tarifa EspecialDia
                    gestion.setTarifaEspecialDia(almacen);
                    break;
                case 4:
                    // Ver tarifas de un cliente
                    gestion.getTarifaMomento(almacen);
                    break;
            }
        }while (opc != 5);

        almacen = gestion.getAlmacen();
        return almacen;
    }
}
