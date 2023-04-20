/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package Guia4_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej02_ContarMayoresYmenoresDeEdad {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        String opcion;
        String esc;

        do {
            esc = datos();
            System.out.println(esc);
            System.out.println("Desde continuar? (si/no)");
            opcion = leer.nextLine();

        } while (!opcion.equalsIgnoreCase("no"));
        System.out.println("Salio del programa");

    }

    public static String datos() {
        Scanner leer = new Scanner(System.in);
        String nombre, escribir;
        int edad;
        System.out.println("Ingrese el nombre: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();
        if (edad >= 18){
            escribir = nombre + " es mayor de edad";
        } else {
            escribir = nombre + " es menor de edad";
        }
        
        return escribir;
    }
        
        
   

}
