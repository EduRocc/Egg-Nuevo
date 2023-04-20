/*
 Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
Matriz Anticimetrica:
Matriz: 0 .-2 . 4       MatrizTranspuesta: 0 . 2 .-4
        2 . 0 . 2                         -2 . 0 .-2
       -4 .-2 . 0                          4 . 2 . 0
 */
package Guia5_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej05_Matriz_Antisimetrica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
int num,num2,x=0;
   int [][] matriz={{0,-2,4}, {2,0,2}, {-4,-2,0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num=matriz[i][j];
                num2=matriz[j][i];
                System.out.println(num+" "+num2);
                if (num==num2*-1) {
                   x++; 
                }
            }
        }
        System.out.println("Matriz Original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ " + matriz[i][j] + " ] ");
            }
        System.out.println(" ");
        }
        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [ " + -matriz[j][i] + " ] ");
            }
            System.out.println(" ");    
        }
if (x==(matriz.length)*matriz.length) {
    System.out.println("La Matriz Transpuesta es Antisimetrica");
    }else{
        System.out.println("no es antisimetrica");}
        System.out.println("");
    } 
    }
