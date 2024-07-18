
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Milton Sarmiento
 */
    
public class GestorEmpleados {
    private final List<Empleado.Empleado> empleados;

    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado.Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarDetallesEmpleados() {
        for (Empleado.Empleado empleado : empleados) {
            empleado.imprimirInformacion();
            System.out.println("--------------------");
        }
    }
}

