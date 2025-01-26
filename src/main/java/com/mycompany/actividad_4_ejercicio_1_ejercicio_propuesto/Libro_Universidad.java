/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_4_ejercicio_1_ejercicio_propuesto;

/**
 *
 * @author Samuel Cataño C
 */
public class Libro_Universidad extends Libro_con_curso {
    private String facultad;
    
    public Libro_Universidad(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo,autor,precio,curso);
        this.facultad = facultad;
    }
    
    @Override public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Facultad: "+facultad);
    }
    
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}
