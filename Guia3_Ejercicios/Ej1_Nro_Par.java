/*
Crear un programa que dado un número determine si es par o impar.
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej1_Nro_Par {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        int nro;
        
        System.out.println("Ingrese nro");
        nro = leer.nextInt(); 
            
        if (nro % 2 == 0) {
            System.out.println("El nro " + nro + " es PAR");
        } else {
            System.out.println("El nro " + nro + " es IMPAR");
        }
        
    }
}
