/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej8_Cuadrado_de_Asteriscos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int lad1 = 1;
        int lad2 = 1;
        
        System.out.println("Ingrese un nro");
        lad1 = leer.nextInt();
        System.out.println("Infrese otro nro");
        lad2 = leer.nextInt();
        
        //Lado superior
        for (int i = 0; i < lad1; i++){
            System.out.print("* ");
        }
        System.out.println();//Salto a la segunda linea
            //Completo segunda linea
            for (int i = 0; i < lad1-2; i++) {
                System.out.print("* ");
                //Completo inferior y anteultima
                for (int j = 0; j < lad2-2; j++) {
                    System.out.print("  ");
                }System.out.println("*");
            }
        //Lado inferior    
        for (int i = 0; i < lad1; i++) {
            System.out.print("* ");
        }System.out.println();
    }
}
