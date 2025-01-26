/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author Samuel Cataño C
 */
public class Apartamento extends InmuebleVivienda {
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion,numeroHabitaciones, numeroBanos);
    }

    @Override void imprimir() {
        super.imprimir();
    }
}
