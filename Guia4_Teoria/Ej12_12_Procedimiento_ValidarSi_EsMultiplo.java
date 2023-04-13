/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package Guia4_Teoria;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej12_12_Procedimiento_ValidarSi_EsMultiplo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n1;
        int n2;
        int resto = 0;
        
        System.out.println("Ingrese un numero");
        n1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        n2 = leer.nextInt();
        
        EsMultiplo(n1, n2, resto);
    }
    public static void EsMultiplo(int n1, int n2, int resto){
        resto = n1%n2;
        
        if (resto == 0) {
            System.out.println(" " + n1 + " es multiplo de " + n2);
        } else {
            System.out.println(" " + n1 + " NO es multiplo de " + n2);
        }
    }
}
