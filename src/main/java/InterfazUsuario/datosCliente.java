package InterfazUsuario;

import Cliente.Cliente;
import Cliente.Direccion;
import Fecha.Fecha;
import Tarifa.Tarifa;
import java.util.Scanner;

public class datosCliente {

    private static Scanner scan = new Scanner(System.in);

    // ----------------------------------------------------------
    // METODOS DE USO
    // ----------------------------------------------------------

    // ----------------------------------------------------------------------------
    // METODOS AÑADIR CLIENTE
    // ----------------------------------------------------------------------------

    public static Cliente addCliente() throws IllegalArgumentException{
        Cliente cliente = new Cliente();

        System.out.println(" ");

        // Nombre
        System.out.print("Indique el nombre del cliente: ");
        cliente.setNombre(scan.nextLine());

        // NIF
        System.out.print("Indique el NIF del cliente: ");
        String nif = scan.nextLine();

        // Comprobamos que el NIF sea correcto
        if(nif.length() != 9)
            throw new IllegalArgumentException("El NIF indicado es incorrecto, debe contener 7 cifras y 1 carácter identificatorio.");

        cliente.setNIF(nif);

        // Direccion
        Direccion dir;

        System.out.print("Indique la provincia en la que habita el cliente: ");
        String provincia = scan.nextLine();

        System.out.print("Indique la calle donde vive el cliente: ");
        String calle = scan.nextLine();

        System.out.print("Indique el número del portal del cliente: ");
        int num = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el piso donde vive el cliente: ");
        int piso = Integer.parseInt(scan.nextLine());

        System.out.print("Indique la puerta donde vive el cliente: ");
        String puerta = scan.nextLine();

        dir = new Direccion(provincia,calle,num,piso,puerta);
        cliente.setDireccion(dir);

        // Correo
        System.out.print("Indique el correo del cliente: ");
        cliente.setCorreo(scan.nextLine());

        // Fecha de alta
        System.out.print("Indique el día de registro: ");
        int dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de registro: ");
        int mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de registro: ");
        int anyo = Integer.parseInt(scan.nextLine());

        Fecha fecha = new Fecha(dia,mes,anyo);
        cliente.setFecha(fecha);

        // Tarifa
        System.out.print("Indique la cantidad que paga con la tarifa actual: ");
        double tarifa = Double.parseDouble(scan.nextLine());
        cliente.setTarifa(new Tarifa(tarifa));

        return cliente;
    }

    // ----------------------------------------------------------------------------
    // METODOS ELIMINAR CLIENTE
    // ----------------------------------------------------------------------------

    public static String deleteCliente(){
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que quiere borrar: ");
        String nif = scan.nextLine();

        if(nif.length() != 9)
            throw new IllegalArgumentException("El NIF indicado es incorrecto, debe contener 7 cifras y 1 carácter identificatorio.");
        return nif;
    }

    // ----------------------------------------------------------------------------
    // METODOS RECOGER DATOS CLIENTE
    // ----------------------------------------------------------------------------

    public static String getDatos(){

        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que quieras recoger los datos: ");
        String nif = scan.nextLine();

        if(nif.length() != 9)
            throw new IllegalArgumentException("El NIF indicado es incorrecto, debe contener 7 cifras y 1 carácter identificatorio.");
        return nif;
    }

    // ----------------------------------------------------------------------------
    // METODOS CAMBIAR TARIFA
    // ----------------------------------------------------------------------------

    public static String getNIFTarifa(){
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente que quiera cambiar la tarifa: ");
        String nif = scan.nextLine();

        if(nif.length() != 9)
            throw new IllegalArgumentException("El NIF indicado es incorrecto, debe contener 8 cifras y 1 carácter identificatorio.");
        return nif;
    }

    public static double getCantTarifa(){

        // CANTIDAD
        System.out.print("Indique la cantidad con la que quiere actualizar la tarifa: ");
        return Double.parseDouble(scan.nextLine());
    }

    // ----------------------------------------------------------------------------
    // METODOS ENTRE FECHAS
    // ----------------------------------------------------------------------------

    public static Fecha getFechaIni(){

        System.out.print("Indique el día de la primera fecha del periodo que quieres saber los clientes registrados: ");
        int dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de la primera fecha del periodo que quieres saber los clientes registrados: ");
        int mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de la primera fecha del periodo que quieres saber los clientes registrados: ");
        int anyo = Integer.parseInt(scan.nextLine());

        return new Fecha(dia,mes,anyo);
    }

    public static Fecha getFechaFin(){
        System.out.print("Indique el día de la segunda fecha del periodo que quieres saber los clientes registrados: ");
        int dia = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el mes de la segunda fecha del periodo que quieres saber los clientes registrados: ");
        int mes = Integer.parseInt(scan.nextLine());

        System.out.print("Indique el año de la segunda fecha del periodo que quieres saber los clientes registrados: ");
        int anyo = Integer.parseInt(scan.nextLine());

        return new Fecha(dia,mes,anyo);
    }
}