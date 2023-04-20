/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. 
La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package Guia4_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej03_ConvertirDivisas_a_otraMoneda {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        System.out.println("ingrese los euros a cambiar.");
        int euro = leer.nextInt();
            
        System.out.println("Seleccione la moneda que desea: \n a.Libra\n b.Dolar\n c.Yenes");
        String moneda = leer.nextLine();
        
        cambio(euro, moneda);
    }
    public static void cambio(int euro, String moneda){
        Scanner leer = new Scanner(System.in);
        moneda = leer.nextLine();
        switch (moneda.toLowerCase()) {
            case "a":
                System.out.println(euro + " euros son " + euro*0.86 + " Libras.");
                break;
            case "b":
                System.out.println(euro + " euros son " + euro*1.28611 + " Dolares.");
                break;
            case "c":
                System.out.println(euro + " euros son " + euro*129.852 + " Yenes.");
                break;
            default:
                System.out.println("ingrese una opcion valida");
        }
    }
    
}
