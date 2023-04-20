package Guia4_Ejercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rocc0
 */
public class Guia04_Ejemplo_de_Video_LlamarAfunciones {

    public static void main(String[] args) {
        //llamamos a la funcion suma
        //creamos una variable que contenga el resultado
        int resultado = suma(10 , 10);
        //y lo mostramos:
        System.out.println(resultado);
        
        //llamamos al saludo personalizado con 3 opciones
        //opc 1 - nosotros ya le ponemos el dato
        saludoPersonalizado("Chiquito");
        //opc 2 y 3 necesitamos el scanner
        Scanner leer = new Scanner(System.in);
        //opc 2 - creamos una variable y pedimos q ingrese el nombre
        //luego llamamos a la funcion
        System.out.print("esperando nombre... ");
        String nombre = leer.next();
        saludoPersonalizado(nombre);
        //opc 3 - mas reducido y fusionada, donde entre parentesis pedimos el nombre
        System.out.println("esperando nombre ... ");
        saludoPersonalizado(leer.next());
        
        
    }

    public static int suma(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void saludoPersonalizado(String nombre){
        System.out.println("Hola " + nombre + " como estas?");
    }
}
