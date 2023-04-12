/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej3_Palabra_de8Caract_lenght {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        String pala;
        
        System.out.println("Ingrese palabra o frase hasta 8 caracteres");
        pala = leer.nextLine();
        
        if (pala.length() == 8) {
            System.out.println("CORRECTO");            
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
