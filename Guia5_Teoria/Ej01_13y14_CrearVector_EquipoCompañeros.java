/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 */
package Guia5_Teoria;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej01_13y14_CrearVector_EquipoCompañeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Vector
        String [] equipo = new String [8];
        String nombre;
        
        for (int i = 0; i < 8; i++) {
            System.out.println("ingrese nombre del compañero " + (8-i));
            nombre = leer.nextLine();
            equipo [i] = nombre;
        }
        for (int i = 0; i < 8; i++) {
            nombre = equipo [i];
            System.out.print("El equipo esta formado por : " + nombre + " , ");
        }
        System.out.println(" ");
    }
    
}
