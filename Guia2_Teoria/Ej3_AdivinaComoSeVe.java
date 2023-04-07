/*
Adivina como se ve en java
*/
package Guia2_Teoria;

/**
 *
 * @author rocc0
 */
public class Ej3_AdivinaComoSeVe {
    public static void main(String[] args){
    
        int num1 = 5;
        int num2 = 5;
        
        int suma = num1 + num2;
        
        double division = num1 / num2;
        
        boolean logico = num2 < num1;
        
        num1++;// en este ejercicio que este o no este es lo mismo el num1++
        
        //Sin ln el print, no realiza salto de linea 
        System.out.print("suma 5+5= " + suma + " divido 5/5= " + division + " num2<num1 = " + logico);
        //Con ln el print, salta una linea
        System.out.println(" --Fin ejercicio-- ");
        System.out.println("Tercer linea");
        
    }
    
}
