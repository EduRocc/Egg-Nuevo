/*
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package Guia4_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej01_Usuario_Funsiones_conMenu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un nro");
        int n1 = leer.nextInt();
        System.out.println("ingrese otro nro");
        int n2 = leer.nextInt();
        
        menu();
        int opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + suma(n1, n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + resta(n1, n2));                
                break;
            case 3:
                System.out.println(n1 + " x " + n2 + " = " + Multiplicar(n1, n2));                
                break;
            case 4:
                System.out.println(n1 + " / " + n2 + " = " + Dividir(n1, n2));                
                break;
            default:
                System.out.println("Ingrese una opcion valida");;
        }     
    }
    public static void menu(){
        System.out.println("Elejir opcion:\n 1.Suma\n 2.Resta\n 3.Multiplicar\n 4.Dividir");
    }
    public static int suma(int n1, int n2){
        int c = n1 + n2;
        return c;
    }
    public static int resta(int n1, int n2){
        int c = n1 - n2;
        return c;
    }
    public static int Multiplicar(int n1, int n2){
        int c = n1 * n2;
        return c;
    }
    public static int Dividir(int n1, int n2){
            int c = n1 / n2;
            return c;
    }
}
