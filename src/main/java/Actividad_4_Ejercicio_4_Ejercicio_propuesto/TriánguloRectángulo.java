/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_4_Ejercicio_4_Ejercicio_propuesto;

/**
 *
 * @author Samuel Cataño C
 */
public class TriánguloRectángulo extends Triángulo {
    
    private final double base;
    private final double altura;
    
    public TriánguloRectángulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override protected double calcularÁrea(){
        return (base*altura)/2;
    }
    
    @Override protected double calcularPerímetro(){
        return (base+altura+calcularHipotenusa());
    }
    
    @Override protected double calcularHipotenusa() {
        return Math.pow(base*base+altura*altura, 0.5);
    }
    
    @Override protected String determinarTipoTriángulo() {
        
        if ((base==altura)&&(base==calcularHipotenusa())&(altura==calcularHipotenusa())) {
            return "Es un triángulo equilátero";
        } else if ((base!=altura)&&(base!=calcularHipotenusa())&(altura!=calcularHipotenusa())) {
            return "Es un triángulo escaleno";
        } else {
            return "Es un triángulo isósceles";
        }
        
    }
    
}
