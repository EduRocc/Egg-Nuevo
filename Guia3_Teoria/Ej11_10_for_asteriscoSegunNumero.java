/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package Guia3_Teoria;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej11_10_for_asteriscoSegunNumero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int nro;

        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese un nro");
            nro = leer.nextInt();
            System.out.print(nro + ": ");

            for (int j = 0; j < nro; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
