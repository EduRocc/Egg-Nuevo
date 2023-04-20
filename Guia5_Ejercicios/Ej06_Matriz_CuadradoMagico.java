/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
2.7.6
9.5.1
4.3.8
todas sus lineas y diagonales dan 15.
 */
package Guia5_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej06_Matriz_CuadradoMagico {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[][] rectangulo = new int[3][3];
        int num, fila, magic = 15, columna, diagonal1 = 0, diagonal2 = 0;
        boolean veri = true;

        System.out.println("ingrese valores entre 1 y 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("ingrese nros en la matriz segun posicion: [ " + i + " ] [ " + j);
                    num = leer.nextInt();
                } while (num > 9 || num < 1);
                rectangulo[i][j] = num;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ " + rectangulo[i][j] + " ] ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            fila = 0;
            for (int j = 0; j < 3; j++) {
                fila += rectangulo[i][j];
            }
            if (fila != magic) {
                veri = false;
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            columna = 0;
            for (int j = 0; j < 3; j++) {
                columna += rectangulo[i][j];
            }
            if (columna != magic) {
                veri = false;
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diagonal1 += rectangulo[i][j];
                }
            }
        }
        if (diagonal1 != magic) {//este if, estaba afuera del for, creo q va aca.
            veri = false;
        }
        for (int i = 0; i < 3; i++) {
            diagonal2 += rectangulo[i][3 - i - 1];//evalua solo esas posiciones
        }
        if (diagonal2 != magic) {
            veri = false;
            
        }
        System.out.println("Esto es una matriz Magica ? : " + veri);
    }
}
