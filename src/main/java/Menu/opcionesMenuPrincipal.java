package Menu;

public enum opcionesMenuPrincipal {
    Menu_Clientes("Menu de clientes"),
    Menu_Llamadas("Menu de llamadas"),
    Menu_Facturas("Menu de facturas"),
    Menu_IOS("Menu de copias de seguridad"),
    Salir("Salir");

    private String description;

    opcionesMenuPrincipal(String description) {
        this.description = description;
    }

    public String toString()
    {
        return description;
    }


}
