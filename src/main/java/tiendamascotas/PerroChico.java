/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author Samuel Cataño C
 */
public class PerroChico extends Perro {
    protected String raza;
    
    protected String talla = "Mediano";
    
    PerroChico(String nombre, int edad, String color, boolean muerde, double peso, RazasDePerroChico raza) {
        super(nombre,edad,color,muerde,peso);
        switch (raza) {
            case CANICHE:
                this.raza = "Caniche";
                break;
            case YORKSHIRE:
                this.raza = "Yorkshire";
                break;
            case TERRIER:
                this.raza = "Terrier";
                break;
            case SCHNAUZER:
                this.raza = "Schnauzer";
                break;
            case CHIHUAHUA:
                this.raza = "Chihuahua";
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
