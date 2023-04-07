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
public class Ej4_7_switch_Tipo_de_Motor {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        int tipoMotor;
        
        System.out.println("Ingrese tipo de motor entre 1 y 4");
        tipoMotor = leer.nextInt();
        
        switch(tipoMotor){
            case 1:
                System.out.println("Bomba de Agua");
                break;
            case 2:
                System.out.println("Bomba de Gasolina");
                break;
            case 3:
                System.out.println("Bomba de Hormigon");
                break;
            default:
                System.out.println("No exite tipo de bomba para ese valor");
        }
    }
}
