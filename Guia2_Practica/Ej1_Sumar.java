package Guia2_Practica;

/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
*/

import java.util.Scanner;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rocc0
 */
public class Ej1_Sumar {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        
//        int nro1;
//        int nro2;
                
        System.out.println("Ingrese primero numero a sumar");
        int nro1 = leer.nextInt();
        
        System.out.println("Ingrese segundo numero a sumar");
        int nro2 = leer.nextInt();
        
        System.out.println("La suma de " + nro1 + " + " + nro2 + " = " + (nro1+nro2));
                
    } 
}
