/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamascotas;

/**
 *
 * @author Samuel Cataño C
 */
public class GatoDePeloLargo extends Gato {
    protected String tipoDePelo = "Pelo largo";
    protected String raza;
    
    GatoDePeloLargo(String nombre, int edad, String color, double alturaDeSalto, double longitudDeSalto, RazaDeGatoDePeloLargo raza) {
        super(nombre,edad,color,alturaDeSalto,longitudDeSalto);
        switch (raza) {
            case AZULRUSO:
                this.raza = "Azul ruso";
                break;
            case BRITANICO:
                this.raza = "Británico";
                break;
            case MANX:
                this.raza = "Manx";
                break;
            case DEVONREX:
                this.raza = "Devon Rex";
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
