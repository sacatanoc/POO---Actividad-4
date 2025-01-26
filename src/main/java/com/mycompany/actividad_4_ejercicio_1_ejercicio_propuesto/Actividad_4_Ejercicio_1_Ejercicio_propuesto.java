/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_4_ejercicio_1_ejercicio_propuesto;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Actividad_4_Ejercicio_1_Ejercicio_propuesto {

    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar libro");
        System.out.println("Ingrese el título del libro: ");
        String titulo = input.nextLine();
        System.out.println("Ingrese el nombre del autor del libro: ");
        String autor = input.nextLine();
        System.out.println("Ingrese el precio del libro: ");
        double precio = input.nextDouble();
        
        Libro libro1 = new Libro(titulo, autor, precio);
        
        System.out.println("");
        libro1.imprimirDetalles();
        System.out.println("");
        
        input.nextLine();
        
        System.out.println("Ingresar libro de universidad");
        System.out.println("Ingrese el título del libro: ");
        String titulo2 = input.nextLine();
        System.out.println("Ingrese el nombre del autor del libro: ");
        String autor2 = input.nextLine();
        System.out.println("Ingrese el precio del libro: ");
        double precio2 = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese el curso al que pertenece el libro: ");
        String curso = input.nextLine();
        System.out.println("Ingrese la facultad a la que pertenece el libro: ");
        String facultad = input.nextLine();
        
        Libro_Universidad libro2 = new Libro_Universidad(titulo2, autor2, precio2, curso, facultad);
        
        System.out.println("");
        libro2.imprimirDetalles();
        System.out.println("");
    }
}
