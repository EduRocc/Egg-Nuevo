/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej5_LaSumaConLimite {
    //psvm
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int limite;
        int suma = 0;
        
        System.out.println("ingrese nro limite");
        limite = leer.nextInt();
        
        do {
            System.out.println("ingrese un numero");
            int num = leer.nextInt();
            suma += num;//suma = suma + num
            
            
        } while (suma <= limite);
        System.out.println("la suma es de : " + suma + " se supero limite");
        
    }
}
