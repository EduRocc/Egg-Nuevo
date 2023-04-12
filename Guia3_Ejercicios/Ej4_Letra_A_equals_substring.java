/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej4_Letra_A_equals_substring {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        String palabra;
        
        System.out.println("ingrese palabra o frase");
        palabra = leer.nextLine();
        
        String letra = palabra.substring(0, 1);//me da la primer letra de la palabra
        
        if (letra.equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
            
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
