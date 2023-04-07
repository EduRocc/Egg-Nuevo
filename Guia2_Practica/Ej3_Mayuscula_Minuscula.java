/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Guia2_Practica;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej3_Mayuscula_Minuscula {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        String frase;

        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        String fraseMin = frase.toLowerCase();
        String fraseMay = frase.toUpperCase();
        
        System.out.println("En Mayuscula= " + fraseMay);
        System.out.println("En Minuscula= " + fraseMin);
        System.out.println("---------------------");
        System.out.println("Otra opcion sin linea 23 y 24");
        System.out.println("En Mayuscula= " + frase.toUpperCase());
        System.out.println("En Minuscula = " + frase.toLowerCase());
    }
}
