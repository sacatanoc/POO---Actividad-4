/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author Samuel Cataño C
 */
public class Perro extends Mascota {
    
    protected String especie = "Perro";
    protected double peso;
    protected boolean muerde;
    
    Perro(String nombre, int edad, String color, boolean muerde, double peso) {
        super(nombre,edad,color);
        this.muerde = muerde;
        this.peso = peso;
    }
    
    public static void sonido() {
        System.out.println("");
        System.out.println("Los perros ladran");
        System.out.println("");
    }
    
    @Override public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Especie: "+especie);
        System.out.println("Peso: "+peso+" Kg");
        if (muerde) {
            System.out.println("¿Muerde?: Sí");
        } else {
            System.out.println("¿Muerde?: No");
        }
    }
    
}
