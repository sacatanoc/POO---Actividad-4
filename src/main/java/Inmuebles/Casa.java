/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author Samuel Cataño C
 */
public class Casa extends InmuebleVivienda {
    protected int numeroPisos;

    public Casa(int identificadorInmobiliario, int area, String direccion,
        int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario,area,direccion,numeroHabitaciones,numeroBanos);
        this.numeroPisos = numeroPisos;
    }

    @Override void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de pisos: " + numeroPisos);
    }
}
