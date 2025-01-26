/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author Samuel Cataño C
 */
public class PerroGrande extends Perro {
    
    protected String raza;
    
    protected String talla = "Grande";
    
    PerroGrande(String nombre, int edad, String color, boolean muerde, double peso, RazasDePerroGrande raza) {
        super(nombre,edad,color,muerde,peso);
        switch (raza) {
            case PASTORALEMAN:
                this.raza = "Pastor alemán";
                break;
            case DOBERMAN:
                this.raza = "Doberman";
                break;
            case ROTWEILLER:
                this.raza = "Rotweiller";
                break;
            default:
                this.raza = "Desconocida";
                break;
        }
    }
    
    @Override public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Talla: "+talla);
        System.out.println("Raza: "+raza);
    }
}
