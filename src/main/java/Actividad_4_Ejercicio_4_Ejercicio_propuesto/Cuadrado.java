/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_4_Ejercicio_4_Ejercicio_propuesto;

/**
 *
 * @author Samuel Cataño C
 */
public class Cuadrado extends FiguraGeometrica {
    
    private final double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override protected double calcularÁrea(){
        return lado*lado;
    }
    
    @Override protected double calcularPerímetro(){
        return 4*lado;
    }
    
}
