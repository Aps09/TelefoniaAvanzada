package Factoria;

import Cliente.*;

public class NuevosClientes implements FabricaClientes {

    @Override
    public Cliente getParticular(String apellido) {
        return new Particular(apellido);
    }

    @Override
    public Cliente getEmpresa() {
        return new Empresa();
    }
}