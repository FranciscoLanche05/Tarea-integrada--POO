package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // PRUEBA PROBLEMA 1: SISTEMA DE VENTAS
        // ==========================================
        System.out.println("Iniciando Sistema de Ventas...\n");
        Vendedores vendedor1 = new Vendedores(
                "Andrea López",
                "Tecnología",
                2850.75,
                8.0,
                92.0
        );

        // Ejecutamos el reporte del vendedor
        vendedor1.mostrarReporte();



    }
}