/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author Samuel Cataño C
 */
public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion,numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }

    @Override void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administración: " + valorAdministracion);
        System.out.println();
    }
}
