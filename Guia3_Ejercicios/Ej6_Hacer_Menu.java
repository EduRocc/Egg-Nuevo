/*
Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej6_Hacer_Menu {

    //psvm
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, num2;

        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextInt();

        int opcion;
        String confirma = null;

        do {
            System.out.println("MENU\n 1.Suma\n 2.Resta\n 3.Multiplicar\n 4.Dividir\n 5.Salir");
            System.out.println("Ingrese la Opcion:");
            opcion = leer.nextInt();

            //sw luego tab = switch
            switch (opcion) {
                case 1:
                    System.out.println("Suma: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resta: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplicar: " + num1 + " x " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Dividir: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    confirma = leer.next();

                    break;
                default:
                    System.out.println("Ingrese una opccion valida");
                    break;

            }//Shif + Ctrl + flecha = esto repite la linea pintada
            //Shit + Alt + flecha = esto mueve lo mintado a otra linea

        } while (!confirma.equalsIgnoreCase("S"));
        System.out.println("Oky ...");

    }
}
