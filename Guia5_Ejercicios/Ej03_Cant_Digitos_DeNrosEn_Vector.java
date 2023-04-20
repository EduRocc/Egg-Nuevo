/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia5_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej03_Cant_Digitos_DeNrosEn_Vector {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del Vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, digitos = 0;

        for (int i = 0; i < n; i++) {
            int nro = (int) (Math.random() * 99999);
            vector[i] = nro;

            while (nro != 0) {
                nro = nro / 10;
                digitos++;
            }
            switch (digitos) {
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
            }
            digitos=0;
        }

        System.out.println("Hay " + d1 + " numeros de 1 digito");
        System.out.println("Hay " + d2 + " numeros de 2 digitos");
        System.out.println("Hay " + d3 + " numeros de 3 digitos");
        System.out.println("Hay " + d4 + " numeros de 4 digitos");
        System.out.println("Hay " + d5 + " numeros de 5 digitos");
    }

}
