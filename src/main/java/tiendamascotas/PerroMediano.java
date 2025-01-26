/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author Samuel Cataño C
 */
public class PerroMediano extends Perro {
    protected String raza;
    
    protected String talla = "Mediano";
    
    PerroMediano(String nombre, int edad, String color, boolean muerde, double peso, RazasDePerroMediano raza) {
        super(nombre,edad,color,muerde,peso);
        switch (raza) {
            case COLLIE:
                this.raza = "Collie";
                break;
            case DALMATA:
                this.raza = "Dálmata";
                break;
            case BULLDOG:
                this.raza = "Bulldog";
                break;
            case GALGO:
                this.raza = "Galgo";
                break;
            case SABUESO:
                this.raza = "Sabueso";
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
