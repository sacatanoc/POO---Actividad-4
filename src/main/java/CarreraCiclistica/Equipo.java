/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;
import java.util.*;
/**
 *
 * @author Samuel Cataño C
 */
public class Equipo {
    
    private String nombre;
    private static double totalTiempo;
    private String pais;
    Vector listaCiclistas;
    
    public Equipo(String nombre, String país) {
        this.nombre = nombre;
        this.pais = país;
        totalTiempo = 0;
        listaCiclistas = new Vector();
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    protected void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            System.out.println(c.getNombre());
        }
    }

    protected void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre());
            }
        }
    }

    protected void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size(); i++) { // Se recorre el vector
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            totalTiempo = totalTiempo + c.getTiempoAcumulado();
        }
    }

    protected void imprimir() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo: " + totalTiempo);
    }
    
}
