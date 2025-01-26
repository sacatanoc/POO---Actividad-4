/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Numeros;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Prueba {

    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        
        Fraccion fraccion0 = new Fraccion(2,9);
        
        System.out.println("Ejemplo de fracción: "+fraccion0.toString());
        
        System.out.println("Por favor ingresa el numerador del primer número: ");
        int numerador1 = input.nextInt();
        System.out.println("Por favor ingresa el denominador del primer número: ");
        int denominador1 = input.nextInt();
        System.out.println("Por favor ingresa el numerador del segundo número: ");
        int numerador2 = input.nextInt();
        System.out.println("Por favor ingresa el denominar del segundo número: ");
        int denominador2 = input.nextInt();
        
        if (denominador1==0||denominador2==0) {
            System.out.println();
            System.out.println("Los denominadores deben ser diferentes de 0");
        } else {
            Fraccion fraccion1 = new Fraccion(numerador1,denominador1);
            Fraccion fraccion2 = new Fraccion(numerador2,denominador2);
            System.out.println();
            System.out.println("El primer número es: "+fraccion1.toString());
            System.out.println("El segundo número es: "+fraccion2.toString());
            if (fraccion1.equals(fraccion2)) {System.out.println("Son iguales");} else {System.out.println("No son iguales");}
            Fraccion suma = fraccion1.Numerica_sumar(fraccion2);
            System.out.println("Su suma es: "+suma.toString());
            Fraccion resta = fraccion1.Numerica_restar(fraccion2);
            System.out.println("El resultado de su resta es: "+resta.toString());
            Fraccion producto = fraccion1.Numerica_multiplicar(fraccion2);
            System.out.println("Su producto es: "+producto.toString());
            if (numerador2!=0) {
                Fraccion cociente = fraccion1.Numerica_dividir(fraccion2);
                System.out.println("Su cociente es es: "+cociente.toString());
            } else {
                System.out.println("Su cociente es indefinido");
            }
            
            
        }
        
        System.out.println();
                
    }
}
