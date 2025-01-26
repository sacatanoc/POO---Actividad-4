/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_4_Ejercicio_4_Ejercicio_propuesto;

/**
 *
 * @author Samuel Cataño C
 */
public class Círculo extends FiguraGeometrica {
    
    private final double radio;
    
    public Círculo(double radio){
        this.radio = radio;
    }
    
    @Override protected double calcularÁrea(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    @Override protected double calcularPerímetro(){
        return 2*Math.PI*radio;
    }
    
}
