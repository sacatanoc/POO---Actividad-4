/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author Samuel Cataño C
 */
public class GatoDePeloCorto extends Gato {
    protected String tipoDePelo = "Pelo corto";
    protected String raza;
    
    GatoDePeloCorto(String nombre, int edad, String color, double alturaDeSalto, double longitudDeSalto, RazaDeGatoDePeloCorto raza) {
        super(nombre,edad,color,alturaDeSalto,longitudDeSalto);
        switch (raza) {
            case ANGORA:
                this.raza = "Angora";
                break;
            case HIMALAYO:
                this.raza = "Himalayo";
                break;
            case BALINES:
                this.raza = "Balinés";
                break;
            case SOMALI:
                this.raza = "Somalí";
                break;
            default:
                this.raza = "Desconocida";
                break;
        }
    }
    
    @Override public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo de pelo: "+tipoDePelo);
        System.out.println("Raza: "+raza);
    }
}
