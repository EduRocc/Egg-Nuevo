/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
Título, Autor, Número de páginas, 
y un constructor con todos los atributos pasados por parámetro 
y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego 
informar mediante otro método el número de ISBN, el título, 
el autor del libro y el número de páginas.

 */
package Guia7_Ej01_;

import java.util.Scanner;

/**
 *
 * @author rocc0
 */
public class Libro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String ISBN;
    public String titulo;
    public String autor;
    public int nroPag;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int nroPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
    }

    public void cargaLibro() {
        System.out.println("ingrese ISBN del libro:");
        ISBN = leer.next();
        System.out.println("ingrese Titulo del libro:");
        titulo = leer.next();
        System.out.println("ingrese el Autor del libro:");
        autor = leer.next();
        System.out.println("ingrese la cantidad de paginas:");
        nroPag = leer.nextInt();
    }

//    @Override
    //  public String toString() {
    //    return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nroPag=" + nroPag + '}';
    //}
    public void MostrarLibros() {
        System.out.println("el nombre del isbn " + ISBN + " el titulo " + titulo + " el autor " + autor);
        System.out.println("el numero de pagina " + nroPag);
    }
}