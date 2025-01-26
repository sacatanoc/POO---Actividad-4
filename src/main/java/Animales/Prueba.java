/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Animales;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Samuel Cataño C
 */
public class Prueba {

    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Animal[] animales = new Animal[4];
    
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
    
        for (Animal animale : animales) {
            System.out.println(animale.getNombreCientifico());
            System.out.println("Sonido: " + animale.getSonido());
            System.out.println("Alimentos: " + animale.getAlimentos());
            System.out.println("Hábitat: " + animale.getHabitat());
            System.out.println("");
        }
        
    }
    
}
