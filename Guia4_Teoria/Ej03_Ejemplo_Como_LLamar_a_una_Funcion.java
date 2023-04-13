/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4_Teoria;

/**
 *
 * @author rocc0
 */
public class Ej03_Ejemplo_Como_LLamar_a_una_Funcion {
    public static void main(String[] args) {
        String nombre = "Mariano";
        int edad = 29;
        
        mostrarInfo(nombre, edad);
    }
    public static void mostrarInfo(String nombre, int edad){
        System.out.println("El nombre del usuario es: " + nombre + " y su edad: " + edad);
    }
}
