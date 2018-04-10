package Menu;

public enum opcionesIOs {
        CargarDatos("Forzar cargado de datos"),
        GuardarAhora("Forzar guardado actual"),
        Atras("Ir al menú anterior");

        private String description;

        opcionesIOs(String description) {
            this.description = description;
        }

        public String toString() {
            return description;
        }
}
