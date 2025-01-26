/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author Samuel Cataño C
 */
public class Gato extends Mascota {
    protected String especie = "Gato";
    protected double alturaDeSalto;
    protected double longitudDeSalto;
    
    Gato(String nombre, int edad, String color, double alturaDeSalto, double longitudDeSalto) {
        super(nombre,edad,color);
        this.alturaDeSalto = alturaDeSalto;
        this.longitudDeSalto = longitudDeSalto;
    }
    
    protected static void sonido() {
        System.out.println("");
        System.out.println("Los gatos maúllan y ronronean");
        System.out.println("");
    }
    
    @Override public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Especie: "+especie);
        System.out.println("Altura de salto: "+alturaDeSalto+" m");
        System.out.println("Longitud de salto: "+longitudDeSalto+" m");
    }
}
