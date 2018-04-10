package Menu;

public enum opcionesLlamadas {

    Anyadir_Llamada("Añadir una llamada"),
    Listar_Llamadas("Listar llamadas de un cliente"),
    Listar_Llamadas_Entre_Fechas("Listar las llamadas de un cliente realizadas entre fechas"),
    Atras("Ir al menú anterior");

    private String description;

    opcionesLlamadas(String description) {
        this.description = description;
    }

    public String toString()
    {
        return description;
    }


}
