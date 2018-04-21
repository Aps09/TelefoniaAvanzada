package Factoria;

<<<<<<< HEAD
import Cliente.*;
=======
import Cliente.Cliente;
import Cliente.Empresa;
import Cliente.Particular;
>>>>>>> 96156bdc438a17b9a692bb02d0da8a7db683b72d

public class NuevosClientes implements FabricaClientes {

    @Override
    public Cliente getParticular(String apellido) {
        return new Particular(apellido);
    }

    @Override
    public Cliente getEmpresa() {
        return new Empresa();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 96156bdc438a17b9a692bb02d0da8a7db683b72d
