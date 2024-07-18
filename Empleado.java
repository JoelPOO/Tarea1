/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//package com.mycompany.empleado;

/**
 *
 * @author Milton Sarmiento
 */

public class Empleado {
    private final String nombre;
    private int edad;
    private final double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }

    static class GestorEmpleados {

        public GestorEmpleados() {
        }
    }

   
}

    


