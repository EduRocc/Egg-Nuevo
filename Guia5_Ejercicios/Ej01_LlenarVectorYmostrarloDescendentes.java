/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package Guia5_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej01_LlenarVectorYmostrarloDescendentes {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [] vector = new int [100];
        int [] vectorI = new int [100];
        
        System.out.println("Vector Normal");
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
            System.out.println(i);
        }
        System.out.println("Vector Invertido");
        for (int i = 99; i > 0; i--) {
            vectorI[i] = i-1;
            System.out.println(i);
        }
    }
}
