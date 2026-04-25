# 📚 Tarea integrada: Encapsulamiento y POO

**Escuela Politécnica Nacional** **Escuela de Formación de Tecnólogos** **Asignatura:** Programación Orientada a Objetos (POO)  
**Profesor:** Ing. Yadira Franco MSc.  
**Estudiante:** Francisco Lanche

---

## 📌 Descripción del Proyecto
Este repositorio contiene la resolución del **Deber 1**, el cual se enfoca en el desarrollo de soluciones orientadas a objetos aplicando correctamente los principios de encapsulamiento (uso de `private` / `public`, métodos `getter` y `setter`, validaciones de negocio y constructores).

El proyecto resuelve dos casos de estudio principales:
1. **Sistema de Ventas:** Control de facturación y desempeño de vendedores.
2. **Sistema Clínico:** Control de atención, costos y prioridades de pacientes.

## ⚙️ Estructura del Código
El proyecto está desarrollado en **Java** y consta de las siguientes clases principales:

* `Vendedor.java`: Modela la entidad del vendedor, protegiendo datos sensibles como montos y comisiones. Incluye métodos para calcular ingresos y evaluar el desempeño.
* `Paciente.java`: Modela la entidad de un paciente de clínica. Implementa reglas de negocio estrictas a través de sus *setters* (ej. edad mayor a 0, prioridad entre 1 y 5) y calcula costos finales con descuentos.
* `Main.java`: Clase principal que instancia los objetos con los datos de prueba y ejecuta los reportes por consola.

## 🚀 Cómo Ejecutar

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone [https://github.com/tu-usuario/Deber1-POO.git](https://github.com/tu-usuario/Deber1-POO.git)
