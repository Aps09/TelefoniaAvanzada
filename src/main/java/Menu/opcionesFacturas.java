package Menu;

public enum opcionesFacturas {

    Emitir_Factura("Emitir una factura"),
    Recoger_Factura("Recoger la información de una factura"),
    Recoger_Facturas_Cliente("Recoger todas las facturas de un cliente"),
    Recoger_Facturas_Emitidas_Entre_Fechas("Recoger todas las facturas emitidas entre dos fechas de un cliente"),
    Atras("Ir al menú anterior");

    private String description;

    opcionesFacturas(String description) {
        this.description = description;
    }

    public String toString()
    {
        return description;
    }


}
