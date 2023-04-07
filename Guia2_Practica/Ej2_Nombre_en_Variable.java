/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package Guia2_Practica;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej2_Nombre_en_Variable {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        String nomb;//Esta es la vairable
        
        System.out.println("Ingrese su nombre");
        nomb = leer.nextLine();
                
        System.out.println("El nombre es = " + nomb);

        
    }
    
}
