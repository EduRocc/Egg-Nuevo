/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */
package Guia7_Ej01_;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Circunferencia {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    /*Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.*/
    public void calcularCircunferencia (){
        System.out.println("Ingrese el radio");
        radio = leer.nextDouble();
    }
    /*Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).*/
    public void calcularArea (){
        double area;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del radio :" + radio + " es: " + area);
    }
    /*Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).*/
    public void calcularPerimetro(){
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        System.out.println("El Perimetro del radio: " + radio + " es: " + perimetro);
    }
}
