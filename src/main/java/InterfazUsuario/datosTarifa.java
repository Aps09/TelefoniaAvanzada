package InterfazUsuario;

import Tarifa.Tarifa;

import java.util.Scanner;

public class datosTarifa {

    private static Scanner scan = new Scanner(System.in);



    public static String donaDNI() throws IllegalArgumentException{
        System.out.print("Indique el NIF del cliente que quieras recoger los datos: ");
        String nif = scan.nextLine();

        return nif;
    }


    public static double donaquaCentPorMin () throws IllegalArgumentException{
        System.out.print("Indique el nuevo precio en cent/min para el cliente: ");
        Double precio = scan.nextDouble();

        return precio;
    }


    public static int[] donaFranjaDeHoras() throws IllegalArgumentException{
        int[] horaIniFin = new int[2];

        System.out.print("Indique la hora de inicio de la tarifa especial: ");
        int hora_ini = scan.nextInt();

        System.out.print("Indique la hora de fin de la tarifa especial: ");
        int hora_fin = scan.nextInt();

        horaIniFin[0]=hora_ini;
        horaIniFin[1]=hora_fin;

        return horaIniFin;
    }


    public static int donaDia() throws IllegalArgumentException{
        System.out.print("Indique el día de la semana de la tarifa especial: ");
        int dia = scan.nextInt();

        return dia;
    }





}
