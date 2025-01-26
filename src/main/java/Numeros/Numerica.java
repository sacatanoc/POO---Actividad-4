/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Numeros;

/**
 *
 * @author Samuel Cataño C
 */
public abstract class Numerica {
    public abstract String toString();
    public abstract boolean equals(Fraccion numero);
    public abstract Fraccion Numerica_sumar(Fraccion numero);
    public abstract Fraccion Numerica_restar(Fraccion numero);
    public abstract Fraccion Numerica_multiplicar(Fraccion numero);
    public abstract Fraccion Numerica_dividir(Fraccion numero);
}
