
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Milton Sarmiento
 */

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado.GestorEmpleados gestorEmpleados = new Empleado.GestorEmpleados();

        OUTER:
        while (true) {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar detalles de empleados");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();
                    Empleado.Empleado empleado = new Empleado.Empleado(nombre, edad, salario);
                    gestorEmpleados.agregarEmpleado(empleado);
                    System.out.println("Empleado agregado correctamente.");
                    break;
                case 2:
                    gestorEmpleados.mostrarDetallesEmpleados();
                    break;
                case 3:
                    break OUTER;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    }
}


