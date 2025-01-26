/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_4_ejercicio_1_ejercicio_propuesto;

/**
 *
 * @author Samuel Cataño C
 */
public class Libro_con_curso extends Libro {
    private String curso;
    
    public Libro_con_curso(String titulo, String autor, double precio, String curso) {
        super(titulo,autor,precio);
        this.curso = curso;
    }
    
    @Override public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Curso: "+curso);
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
