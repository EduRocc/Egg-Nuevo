/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3_Teoria;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej3_Ejemp_de_switch {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;

        System.out.println("Ingrese una opcion");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Esta linea de codigo se ejecuta si opcion = 1");
                break;
            case 2:
                System.out.println("Esta linea de codigo se ejecuta si opcion = 2");
                break;
            default:
                System.out.println("El valor ingresado en la variable opcion es diferente" + " a todos los casos analizados por el switch");
        }
    }
}
