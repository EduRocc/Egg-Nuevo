/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_Ej01_Main;

import Guia7_Ej01_.Libro;

/**
 *
 * @author rocc0
 */
public class LibroMain {

    public static void main(String[] args) {
        Libro li = new Libro();
        li.cargaLibro();
//        li.toString();
        li.MostrarLibros();
        
    }
}
