/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
 */
package Guia4_Teoria;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej02_11_Remplazando_Vocales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String palabras, letra = null;
        
        System.out.println("Ingrese palabra o Frase termina en punto");
        palabras = leer.nextLine();
        
        System.out.println("Original: " + palabras);
        codifica(palabras, letra);
    }
    public static void codifica (String string, String letra){
        
        for (int i = 0; i < string.length(); i++) {
            letra = string.substring(i, i + 1);
            switch (letra.toLowerCase()) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
        System.out.print(letra);
            
        }System.out.println(" ");    
    }
}
