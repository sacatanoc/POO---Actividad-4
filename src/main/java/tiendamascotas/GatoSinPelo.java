/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author Samuel Cataño C
 */
public class GatoSinPelo extends Gato {
    protected String tipoDePelo = "Sin pelo";
    protected String raza;
    
    GatoSinPelo(String nombre, int edad, String color, double alturaDeSalto, double longitudDeSalto, RazaDeGatoSinPelo raza) {
        super(nombre,edad,color,alturaDeSalto,longitudDeSalto);
        switch (raza) {
            case ESFINGE:
                this.raza = "Esfinge";
                break;
            case ELFO:
                this.raza = "Elfo";
                break;
            case DONSKOY:
                this.raza = "Donskoy";
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
