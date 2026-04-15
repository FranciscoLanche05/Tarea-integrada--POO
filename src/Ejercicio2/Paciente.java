package Ejercicio2;

public class Paciente {

    private String nombreCompleto;
    private String numeroIdentificacion;
    private String tipoSeguro;
    private int edad;
    private double costoConsulta;
    private int numeroConsultas;
    private int nivelPrioridad;


    public Paciente(String nombreCompleto, String numeroIdentificacion, String tipoSeguro, int edad, double costoConsulta, int numeroConsultas, int nivelPrioridad) {
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoSeguro = tipoSeguro;
        this.setEdad(edad);
        this.setCostoConsulta(costoConsulta);
        this.setNumeroConsultas(numeroConsultas);
        this.setNivelPrioridad(nivelPrioridad);
    }


    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor a 0.");
        }
    }

    public void setCostoConsulta(double costoConsulta) {
        if (costoConsulta > 0) {
            this.costoConsulta = costoConsulta;
        } else {
            System.out.println("Error: El costo de la consulta debe ser mayor a 0.");
        }
    }

    public void setNumeroConsultas(int numeroConsultas) {
        if (numeroConsultas >= 0) {
            this.numeroConsultas = numeroConsultas;
        } else {
            System.out.println("Error: El número de consultas no puede ser negativo.");
        }
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        if (nivelPrioridad >= 1 && nivelPrioridad <= 5) {
            this.nivelPrioridad = nivelPrioridad;
        } else {
            System.out.println("Error: La prioridad debe estar entre 1 y 5.");
        }
    }


    public double calcularCostoTotal() {
        double subtotal = costoConsulta * numeroConsultas;
        double descuento = 0;

        if (tipoSeguro.equalsIgnoreCase("Basico")) {
            descuento = subtotal * 0.10;
        } else if (tipoSeguro.equalsIgnoreCase("Premium")) {
            descuento = subtotal * 0.20;
        }

        return subtotal - descuento;
    }

    public String clasificarPrioridad() {
        if (nivelPrioridad >= 4) {
            return "Alta prioridad";
        } else if (nivelPrioridad >= 2) {
            return "Prioridad media";
        } else {
            return "Prioridad baja";
        }
    }

    public String obtenerMensajeMedico() {
        String clasificacion = clasificarPrioridad();
        if (clasificacion.equals("Alta prioridad")) {
            return "Atención inmediata requerida.";
        } else if (clasificacion.equals("Prioridad media")) {
            return "Seguimiento necesario.";
        } else {
            return "Control regular.";
        }
    }

    public void generarReporte() {
        System.out.println("--- REPORTE DE ATENCIÓN MÉDICA ---");
        System.out.println("Paciente: " + nombreCompleto + " (ID: " + numeroIdentificacion + ")");
        System.out.println("Edad: " + edad + " | Seguro: " + tipoSeguro);
        System.out.println("Costo total a pagar: $" + String.format("%.2f", calcularCostoTotal()));
        System.out.println("Clasificación: " + clasificarPrioridad());
        System.out.println("Acción Médica: " + obtenerMensajeMedico());
        System.out.println("----------------------------------\n");
    }
}