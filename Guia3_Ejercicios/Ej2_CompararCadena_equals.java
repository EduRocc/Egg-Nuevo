/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej2_CompararCadena_equals {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        String pass = "eureka";
        String palabra;
        
        System.out.println("ingrese palabra clave");
        palabra = leer.nextLine();
        
        if (pass.equals(palabra)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
