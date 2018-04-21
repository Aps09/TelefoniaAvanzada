package Factoria;

import Cliente.Cliente;

public interface FabricaClientes {
    Cliente getParticular(String apellido);
    Cliente getEmpresa();
}