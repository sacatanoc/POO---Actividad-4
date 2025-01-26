/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_4_ejercicio_1_ejercicio_propuesto;

/**
 *
 * @author Samuel Cataño C
 */
public class Novela extends Libro {
    private String tipo;
    public Novela(String titulo, String autor, double precio, String tipo) {
        super(titulo,autor,precio);
        this.tipo = tipo;
    }
    
    @Override public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Tipo: "+tipo);
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
