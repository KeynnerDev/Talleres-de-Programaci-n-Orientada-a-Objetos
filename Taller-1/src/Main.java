/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Keinner Ramos
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Libro con entrada de datos
        System.out.println("Ingresar datos del Libro:");
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Numero de paginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        Libro libro = new Libro(titulo, autor, numeroPaginas);

        // Crear un objeto CuentaBancaria con entrada de datos
        System.out.println("\nIngrese los datos de la cuenta bancaria:");
        System.out.print("Numero de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Saldo inicial: ");
        int saldo = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo);

        // Crear un objeto Estudiante con entrada de datos
        System.out.println("\nIngrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Curso: ");
        int curso = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        // Mostrar detalles de los objetos creados
        System.out.println("\nDetalles de los objetos creados:");
        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);

        // Crear objetos con constructores sin parámetros
        System.out.println("\nCreando objetos con constructores vacíos:");
        Libro libroDefault = new Libro();
        CuentaBancaria cuentaDefault = new CuentaBancaria();
        Estudiante estudianteDefault = new Estudiante(nombre, edad, curso);

        System.out.println(libroDefault);
        System.out.println(cuentaDefault);
        System.out.println(estudianteDefault);

        scanner.close();
    }
}
