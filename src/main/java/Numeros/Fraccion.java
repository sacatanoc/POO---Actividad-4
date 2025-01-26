/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Numeros;

/**
 *
 * @author Samuel Cataño C
 */
public class Fraccion extends Numerica {
    protected int numerador;
    protected int denominador;
    
    public Fraccion(int numerador, int denominador) {
        if ((numerador<=0&&denominador<0)||((numerador/denominador)<=0&&denominador<0)) {
            this.numerador = (-1)*numerador;
            this.denominador = (-1)*denominador;
        } else {
            this.numerador = numerador;
            this.denominador = denominador;
        }
    }
    
    @Override public String toString(){
        return String.valueOf(numerador)+"/"+String.valueOf(denominador);
    }
    
    @Override public boolean equals(Fraccion num) {
        double div1 = this.numerador * 1.0 / this.denominador;
        double div2 = num.numerador * 1.0 / num.denominador;
        boolean igualdad = String.valueOf(div1).equals(String.valueOf(div2));
        return igualdad;
    }
    
    @Override public Fraccion Numerica_sumar(Fraccion numero) {
        if (denominador == numero.denominador) {
            int resta = numerador+numero.numerador;
            return new Fraccion(resta,denominador);
        } else {
            int producto = denominador*numero.denominador;
            int resta = numerador*numero.denominador+numero.numerador*denominador;
            return new Fraccion(resta,producto);
        }
    }
    
    @Override public Fraccion Numerica_restar(Fraccion numero) {
        if (denominador == numero.denominador) {
            int resta = numerador-numero.numerador;
            return new Fraccion(resta,denominador);
        } else {
            int producto = denominador*numero.denominador;
            int resta = numerador*numero.denominador-numero.numerador*denominador;
            return new Fraccion(resta,producto);
        }
    }
    
     @Override public Fraccion Numerica_multiplicar(Fraccion numero) {
        int producto1 = numerador*numero.numerador;
        int producto2 = denominador*numero.denominador;
        return new Fraccion(producto1,producto2);
    }
    
    @Override public Fraccion Numerica_dividir(Fraccion numero) {
        int producto1 = numerador*numero.denominador;
        int producto2 = denominador*numero.numerador;
        return new Fraccion(producto1,producto2);
    }
    
}
