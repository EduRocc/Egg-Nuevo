/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.

 */
package Guia3_Teoria;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej10_9_Captura_el_Cero_Bueno {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int cont = 1;
        int suma = 0;
        do {
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();

            if (numero == 0) {
                System.out.println("Se capturo cero");
                break;
            } else if (numero > 0) {
                suma = suma + numero;
            }
            cont++;
        } while (cont <= 5);
        System.out.println("Se ingresaron " + (cont - 1) + " numeros");
        System.out.println("la suma es de: " + suma);
    }
}
