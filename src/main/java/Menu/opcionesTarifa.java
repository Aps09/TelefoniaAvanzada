package Menu;

public enum opcionesTarifa {

    Cambiar_Tarifa_Básica("Cambiar Tarifa Básica"),
    Cambiar_Tarifa_Por_Horas("Cambiar Tarifa Plus de horas"),
    Cambiar_Tarifa_Día("Cambiar Tarifa Plus de día"),
    Ver_Cliente("Ver tarifas completas de un cliente"),
    Volver_atrás("Volver atrás");



    private String description;

    opcionesTarifa(String description) {
        this.description = description;
    }

    public String toString()
    {
        return description;
    }

}