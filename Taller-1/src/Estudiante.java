/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Keinenr Ramos
 */
public class Estudiante {
    String nombre;
    int edad;
    int curso;
    
    
    public Estudiante(String nombre1, int edad1, int curso) {
        nombre = "";
        edad = 0;
        curso = 0;
    }
    
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
   /* public Estudiante(int edad) {
        this.edad = edad;
    } */
    
    public Estudiante(String nombre, int edad) {
        this(nombre);
        this.edad = edad;
    }
   
}
