/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package Guia5_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej02_VectroNrosAleatoriosY_ubicacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);//rellenar con nros aleatorios
        }
        System.out.println("Ingrese el numero buscado");
        int m = leer.nextInt();
        int j = 0;
        String aux = "";       
        for (int i = 0; i < n; i++) {
            if (vector[i] == m) {
                aux += i + " ,";
                j++;
            }
        }
        if (j == 0){
            System.out.println("No se encontro el numero buscado");
        } else if(j == 1){
            System.out.println("El numero se encontro una vez y su posición es: " + aux);
            
        } else{
           System.out.println("El numero se encontro " + j + " veces y sus posiciones son: " + aux); 
        }
    }
}
