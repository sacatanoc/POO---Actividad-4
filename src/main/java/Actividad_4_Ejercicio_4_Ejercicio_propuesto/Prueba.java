/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Actividad_4_Ejercicio_4_Ejercicio_propuesto;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 *
 * @author Samuel Cataño C
 */
public class Prueba {

    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        
        Círculo círculo0 = new Círculo(2);
        Cuadrado cuadrado0 = new Cuadrado(3);
        Rectángulo rectángulo0 = new Rectángulo(4,7);
        TriánguloRectángulo triángulo0 = new TriánguloRectángulo(10,13);
        
        System.out.println("Ingrese la longitud del radio del círculo: ");
        double radio = input.nextDouble();
        Círculo círculo1 = new Círculo(radio);
        double áreaCírculo1 = círculo1.calcularÁrea();
        double perímetroCírculo1 = círculo1.calcularPerímetro();
        
        System.out.println();
        
        System.out.println("Ingrese la longitud de los lados del cuadrado: ");
        double lado = input.nextDouble();
        Cuadrado cuadrado1 = new Cuadrado(lado);
        double áreaCuadrado1 = cuadrado1.calcularÁrea();
        double perímetroCuadrado1 = cuadrado1.calcularPerímetro();
        
        System.out.println();
        
        System.out.println("Ingrese la longitud de la altura del rectángulo: ");
        double altura = input.nextDouble();
        System.out.println("Ingrese la longitud de la base del rectángulo: ");
        double base = input.nextDouble();
        Rectángulo rectángulo1 = new Rectángulo(base,altura);
        double áreaRectángulo1 = rectángulo1.calcularÁrea();
        double perímetroRectángulo1 = rectángulo1.calcularPerímetro();
        
        System.out.println();
        
        System.out.println("Ingrese la longitud de la altura del triángilo: ");
        double alturaT = input.nextDouble();
        System.out.println("Ingrese la longitud de la base del triángulo: ");
        double baseT = input.nextDouble();
        TriánguloRectángulo triángulo1 = new TriánguloRectángulo(baseT,alturaT);
        double áreaTriángulo1 = triángulo1.calcularÁrea();
        double perímetroTriángulo1 = triángulo1.calcularPerímetro();
        double hipotenusa = triángulo1.calcularHipotenusa();
        String tipo = triángulo1.determinarTipoTriángulo();
        
        System.out.println();
        
        System.out.println("--- Tu Círculo ---");
        System.out.println("Área: "+String.valueOf(áreaCírculo1));
        System.out.println("Perímetro: "+String.valueOf(perímetroCírculo1));
        
        System.out.println();
        
        System.out.println("--- Tu Cuadrado ---");
        System.out.println("Área: "+String.valueOf(áreaCuadrado1));
        System.out.println("Perímetro: "+String.valueOf(perímetroCuadrado1));
        
        System.out.println();
        
        System.out.println("--- Tu Rectángulo ---");
        System.out.println("Área: "+String.valueOf(áreaRectángulo1));
        System.out.println("Perímetro: "+String.valueOf(perímetroRectángulo1));
        
        System.out.println();
        
        System.out.println("--- Tu Triángulo ---");
        System.out.println("Área: "+String.valueOf(áreaTriángulo1));
        System.out.println("Perímetro: "+String.valueOf(perímetroTriángulo1));
        System.out.println("Hipotenusa: "+String.valueOf(hipotenusa));
        System.out.println("Tipo de triángulo: "+String.valueOf(tipo));
        
        System.out.println();
        
        System.out.println("--- Otras figuras ---");
        
        System.out.println();
        
        System.out.println("--- Círculo ---");
        System.out.println("Área: "+String.valueOf(círculo0.calcularÁrea()));
        System.out.println("Perímetro: "+String.valueOf(círculo0.calcularPerímetro()));
        
        System.out.println();
        
        System.out.println("--- Tu Cuadrado ---");
        System.out.println("Área: "+String.valueOf(cuadrado0.calcularÁrea()));
        System.out.println("Perímetro: "+String.valueOf(cuadrado0.calcularPerímetro()));
        
        System.out.println();
        
        System.out.println("--- Tu Rectángulo ---");
        System.out.println("Área: "+String.valueOf(rectángulo0.calcularÁrea()));
        System.out.println("Perímetro: "+String.valueOf(rectángulo0.calcularPerímetro()));
        
        System.out.println();
        
        System.out.println("--- Tu Triángulo ---");
        System.out.println("Área: "+String.valueOf(triángulo0.calcularÁrea()));
        System.out.println("Perímetro: "+String.valueOf(triángulo0.calcularPerímetro()));
        System.out.println("Hipotenusa: "+String.valueOf(triángulo0.calcularHipotenusa()));
        System.out.println("Tipo de triángulo: "+String.valueOf(triángulo0.determinarTipoTriángulo()));
    }
}
