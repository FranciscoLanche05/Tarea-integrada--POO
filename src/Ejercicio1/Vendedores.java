package Ejercicio1;

public class Vendedores {

    private String nombre;
    private String areaTrabajo;
    private double montoVendido;
    private double porcentajeComision;
    private double cumplimientoMeta;


    public Vendedores(String nombre, String areaTrabajo, double montoVendido, double porcentajeComision, double cumplimientoMeta) {
        this.nombre = nombre;
        this.areaTrabajo = areaTrabajo;


        this.setMontoVendido(montoVendido);
        this.setPorcentajeComision(porcentajeComision);
        this.setCumplimientoMeta(cumplimientoMeta);
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getAreaTrabajo() { return areaTrabajo; }
    public void setAreaTrabajo(String areaTrabajo) { this.areaTrabajo = areaTrabajo; }

    public double getMontoVendido() { return montoVendido; }
    public void setMontoVendido(double montoVendido) {
        if(montoVendido >= 0) this.montoVendido = montoVendido;
    }

    public double getPorcentajeComision() { return porcentajeComision; }
    public void setPorcentajeComision(double porcentajeComision) {
        if(porcentajeComision >= 0) this.porcentajeComision = porcentajeComision;
    }

    public double getCumplimientoMeta() { return cumplimientoMeta; }
    public void setCumplimientoMeta(double cumplimientoMeta) {
        if(cumplimientoMeta >= 0) this.cumplimientoMeta = cumplimientoMeta;
    }

    // Lógica de negocio
    public double calcularComision() {
        return montoVendido * (porcentajeComision / 100);
    }

    public double calcularIngresoTotal() {
        return montoVendido + calcularComision();
    }

    public String evaluarCumplimiento() {
        if (cumplimientoMeta >= 90) {
            return "Excelente";
        } else if (cumplimientoMeta >= 70) {
            return "Aceptable";
        } else {
            return "Bajo";
        }
    }

    public String generarMensajeDesempeno() {
        String estado = evaluarCumplimiento();
        if (estado.equals("Excelente")) {
            return "Vendedor con desempeño sobresaliente.";
        } else if (estado.equals("Aceptable")) {
            return "Vendedor con desempeño aceptable.";
        } else {
            return "Se requiere seguimiento comercial.";
        }
    }

    public void mostrarReporte() {
        System.out.println("--- REPORTE DE DESEMPEÑO DE VENTAS ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Área: " + areaTrabajo);
        System.out.println("Monto Vendido: $" + String.format("%.2f", montoVendido));
        System.out.println("Comisión Generada: $" + String.format("%.2f", calcularComision()));
        System.out.println("Ingreso Total: $" + String.format("%.2f", calcularIngresoTotal()));
        System.out.println("Estado de Cumplimiento: " + evaluarCumplimiento());
        System.out.println("Mensaje: " + generarMensajeDesempeno());
        System.out.println("--------------------------------------\n");
    }
}
