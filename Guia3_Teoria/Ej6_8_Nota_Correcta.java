/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está 
entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Guia3_Teoria;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej6_8_Nota_Correcta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int nota ;

        System.out.println("Ingrese su nota");
//        int nota = leer.nextInt(); //Esto funciona pero quitando linea18 y 22
        nota = leer.nextInt();

        while (nota > 10 || nota <0) {
            System.out.println("No es una nota valida");
            System.out.println("Ingrese una nota valida");
            nota = leer.nextInt();
        }
        System.out.println("La nota es correcta");
    }
}
