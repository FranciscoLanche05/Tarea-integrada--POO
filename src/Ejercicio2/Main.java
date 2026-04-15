package Ejercicio2;

public class Main {
    public static void main(String[] args){


        System.out.println("Iniciando Sistema Clínico...\n");
        Paciente paciente1 = new Paciente ("Carlos Pérez",
                "0102030405",
                "Premium",
                45,
                25.50,
                3, 4
        );


        paciente1.generarReporte();

    }
}
