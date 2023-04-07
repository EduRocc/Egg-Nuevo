/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
otro ejemplo: (10 °C × 9/5) + 32 = 50 °F
 */
package Guia2_Practica;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej4_Convertir_GradosFahrenheit {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        float grados;//Float tiene 32bits y double 64bits, tener en cuenta
        
        System.out.println("Conversor de Grados Centigrados a Fahrenheit");
        System.out.println("Ingrese los grados a consultar");
        grados = leer.nextFloat();
        
        float grados2 = ((grados*(9/5))+32);
                
        System.out.println("Ingreso " + grados + "°C y su equivalente es " + grados2 + "°F");
                
    }
}
