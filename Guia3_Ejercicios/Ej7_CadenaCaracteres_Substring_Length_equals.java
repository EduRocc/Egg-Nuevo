/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package Guia3_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Ej7_CadenaCaracteres_Substring_Length_equals {
    //psvm
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String cadena = null;
        String c1 = null;
        String c2 = null;
        int contIncorrectas = 0;
        int contCorrectas = 0;
        
        System.out.println("Dispositivo RS232\n Bienvenido\n ");
        do {
            System.out.println("Ingrese palabra: ");
            cadena = leer.nextLine();
            
            if (cadena.length() == 5 ) {
                c1 = cadena.substring(0, 1);
                c2 = cadena.substring(4, 5);
                if (c1.equalsIgnoreCase("X") && c2.equalsIgnoreCase("O")) {
                    System.out.println("EFE es Correcto");
                    contCorrectas++;
                } else {
                    System.out.println("No cumple con los requisitos");
                    contIncorrectas++;
                }
            } else {
                System.out.println("La palabra no tiene 5 caracteres");
                contIncorrectas++;
            }
            
        } while (!cadena.equalsIgnoreCase("&&&&&"));
            System.out.println("Se ingresaron : " + contCorrectas + " instancias correctas");
            System.out.println("Se ingresaron : " + contCorrectas + " instancias correctas");
        
    }
}
