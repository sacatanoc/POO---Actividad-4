/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author Samuel Cataño C
 */
public class Mascota {
    protected String nombre;
    protected int edad;
    protected String color;
    
    Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    
    public void imprimirDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Color: "+color);
    }
}
