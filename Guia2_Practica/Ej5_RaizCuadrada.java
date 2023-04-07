/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package Guia2_Practica;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej5_RaizCuadrada {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero a calcular");
        int nro = leer.nextInt();
        
        System.out.println("El doble de lo ingresado es: " + nro*2);
        System.out.println("El triple de lo ingresado es: " + nro*3);
        System.out.println("La raiz cuadrada de lo ingresado es: " + Math.sqrt(nro) );
        
    }
}
