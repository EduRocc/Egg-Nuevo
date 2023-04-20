/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
MATRIZ A = 1.0.4    MATRIZ B = 1.0.6
           0.5.0               0.5.0
           6.0.-9              4.0.-9 
 */
package Guia5_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej04_Trasponer_Matriz_4x4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//Ala izquierda declaramos y a la derecha construimos
        int [][] matrizA = new int [4][4];//primer corchete[4]es lineas y el otro columnas
        int [][] matrizB = new int [4][4];
//Rellenamos Original
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);  
            }
        }
//Trasponemos matriz original
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }
//Imprimimos original        
        System.out.println("Matriz Original:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j]);
            }
            System.out.println(" ");
//Imprimo Transpuesta
        }
        System.out.println("Matriz Transpuesta:");    
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j]);
            }
            System.out.println(" ");
        }
           
    }
}
