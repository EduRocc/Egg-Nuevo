/*
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package Guia3_Teoria;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej2_6_Mayor_q_25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese su segundo numero");
        num2 = leer.nextInt();

        if (num1 > 25 && num2 < 25) {
            System.out.println("El num1 -" + num1 + "- es MAYOR que 25");
        }
        if (num1 < 25 && num2 > 25) {
            System.out.println("El num2 -" + num2 + "- es Menor que 25");
        }
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son MAYORES que 25");
        }
        if (num1 == 25 && num2 == 25) {
            System.out.println("Ambos numeros son Iguales a 25");
        }
        if (num1 > 25 && num2 == 25) {
            System.out.println("El num1 es MAYOR y el num2 es igual a 25");
        }
        if (num1 == 25 && num2 > 25) {
            System.out.println("El num1 es igual y el num2 es MAYOR a 25");
        } else {
            System.out.println("Ambos son Menores a 25");
        }

    }
}
