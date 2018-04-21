package InterfazUsuario;

import Cliente.Cliente;
import Cliente.Direccion;
<<<<<<< HEAD
=======
import Cliente.Empresa;
import Cliente.Particular;
>>>>>>> 96156bdc438a17b9a692bb02d0da8a7db683b72d
import Factoria.FabricaClientes;
import Factoria.NuevosClientes;
import Fecha.Fecha;
import Tarifa.TarifaBasica;

import java.util.Scanner;

public class datosCliente {

    private static FabricaClientes fabrica = new NuevosClientes();
    private static Scanner scan = new Scanner(System.in);



    // ----------------------------------------------------------------------------
    // METODOS AÑADIR CLIENTE
    // ----------------------------------------------------------------------------

    public static Cliente addCliente() throws IllegalArgumentException{
<<<<<<< HEAD

        System.out.println(" ");
        System.out.print("Indique con el dígito indicado si se trata de un particular (1) o una empresa (2): ");
        int opc = Integer.parseInt(scan.nextLine());

        Cliente cliente;


        if (opc == 1){
            System.out.print("Indique el apellido del cliente: ");
            String apellido = scan.nextLine();
            cliente = fabrica.getParticular(apellido);
        }else
            cliente = fabrica.getEmpresa();
=======
       System.out.println(" ");

       System.out.print("Indique con el dígito indicado si se trata de un particular (1) o una empresa (2): ");
       int opc = Integer.parseInt(scan.nextLine());
>>>>>>> 96156bdc438a17b9a692bb02d0da8a7db683b72d

       // Comprobamos de qué tipo de cliente se trata y pedimos sus datos respectivamente
        if(opc == 1){
            // Se trata de un particular

<<<<<<< HEAD

        // NIF
        System.out.print("Indique el NIF del cliente: ");
        String nif = scan.nextLine();


             // Comprobamos que el NIF sea correcto
        if(nif.length() != 9)
            throw new IllegalArgumentException("El NIF indicado es incorrecto, debe contener 7 cifras y 1 carácter identificatorio.");
=======
            // Nombre
            System.out.print("Indique el nombre del cliente: ");
            String nombre = scan.nextLine();

            // Apellido
            System.out.print("Indique el apellido del cliente: ");
            String apellido = scan.nextLine();
>>>>>>> 96156bdc438a17b9a692bb02d0da8a7db683b72d

            // NIF
            System.out.print("Indique el NIF del cliente: ");
            String nif = scan.nextLine();

<<<<<<< HEAD

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
=======
            if(nif.length() != 9)
                throw new IllegalArgumentException("El NIF indicado es incorrecto, debe contener 8 cifras y 1 carácter identificatorio.");

            // Creamos el cliente
            Cliente cliente = fabrica.getParticular(apellido);

            // Aplicamos el nombre que guardamos anteriormente
            cliente.setNombre(nombre);
            cliente.setNIF(nif);

            // Direccion
            Direccion dir;

            System.out.print("Indique la provincia en la que habita el cliente: ");
            String provincia = scan.nextLine();

            System.out.print("Indique la calle donde vive el cliente: ");
            String calle = scan.nextLine();
>>>>>>> 96156bdc438a17b9a692bb02d0da8a7db683b72d

            System.out.print("Indique el número del portal del cliente: ");
            int num = Integer.parseInt(scan.nextLine());

<<<<<<< HEAD


        // Correo
        System.out.print("Indique el correo del cliente: ");
        cliente.setCorreo(scan.nextLine());
=======
            System.out.print("Indique el piso donde vive el cliente: ");
            int piso = Integer.parseInt(scan.nextLine());
>>>>>>> 96156bdc438a17b9a692bb02d0da8a7db683b72d

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

            // Devolvemos el particular
            return cliente;

        }else{
            // Se trata de una empresa

            System.out.print("Indique el NIF de la empresa: ");
            String nif = scan.nextLine();

            if(nif.length() != 9)
                throw new IllegalArgumentException("El NIF indicado es incorrecto, debe contener 8 cifras y 1 carácter identificatorio.");

            Cliente cliente = fabrica.getEmpresa();

<<<<<<< HEAD
        // Tarifa
        System.out.print("Indique la cantidad que paga con la tarifa básica actual: ");
        double precio = Double.parseDouble(scan.nextLine());
        cliente.setTarifa(new TarifaBasica(precio));

        return cliente;


=======
            cliente.setNIF(nif);

            // Nombre de la empresa
            System.out.print("Indique el nombre de la empresa: ");
            cliente.setNombre(scan.nextLine());

            // Direccion
            Direccion dir;

            System.out.print("Indique la provincia en la que se encuentra la empresa: ");
            String provincia = scan.nextLine();

            System.out.print("Indique la calle donde se encuentra la empresa: ");
            String calle = scan.nextLine();

            System.out.print("Indique el número del portal de la empresa: ");
            int num = Integer.parseInt(scan.nextLine());

            System.out.print("Indique el piso donde está la empresa: ");
            int piso = Integer.parseInt(scan.nextLine());

            System.out.print("Indique la puerta donde se encuentra la empresa: ");
            String puerta = scan.nextLine();

            dir = new Direccion(provincia,calle,num,piso,puerta);
            cliente.setDireccion(dir);

            // Correo
            System.out.print("Indique el correo de la empresa: ");
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

            // Devolvemos el particular
            return cliente;
        }
>>>>>>> 96156bdc438a17b9a692bb02d0da8a7db683b72d
    }

    // ----------------------------------------------------------------------------
    // METODOS ELIMINAR CLIENTE
    // ----------------------------------------------------------------------------

    public static String deleteCliente(){
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente ó empresa que quiere borrar: ");
        String nif = scan.nextLine();

        if(nif.length() != 9)
            throw new IllegalArgumentException("El NIF indicado es incorrecto, debe contener 8 cifras y 1 carácter identificatorio.");
        return nif;
    }

    // ----------------------------------------------------------------------------
    // METODOS RECOGER DATOS CLIENTE
    // ----------------------------------------------------------------------------

    public static String getDatos(){

        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente ó empresa que quieras recoger los datos: ");
        String nif = scan.nextLine();

        if(nif.length() != 9)
            throw new IllegalArgumentException("El NIF indicado es incorrecto, debe contener 8 cifras y 1 carácter identificatorio.");
        return nif;
    }

    // ----------------------------------------------------------------------------
    // METODOS CAMBIAR TARIFA
    // ----------------------------------------------------------------------------

    public static String getNIFTarifa(){
        System.out.println(" ");

        // NIF
        System.out.print("Indique el NIF del cliente ó empresa que quiera cambiar la tarifa: ");
        String nif = scan.nextLine();

        if(nif.length() != 9)
            throw new IllegalArgumentException("El NIF indicado es incorrecto, debe contener 8 cifras y 1 carácter identificatorio.");
        return nif;
    }

    public static double getCantTarifa(){

        // CANTIDAD
        System.out.print("Indique la cantidad con la que quiere actualizar la tarifa básica: ");
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