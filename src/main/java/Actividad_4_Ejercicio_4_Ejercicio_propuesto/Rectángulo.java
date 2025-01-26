/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_4_Ejercicio_4_Ejercicio_propuesto;

/**
 *
 * @author Samuel Cataño C
 */
public class Rectángulo extends FiguraGeometrica {
    
    private double base;
    private double altura;
    
    public Rectángulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override protected double calcularÁrea(){
        return base*altura;
    }
    @Override protected double calcularPerímetro(){
        return (2*base)+(2*altura);
    }
}
