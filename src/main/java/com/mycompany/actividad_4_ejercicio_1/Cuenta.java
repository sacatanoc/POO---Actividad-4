/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_4_ejercicio_1;

/**
 *
 * @author Samuel Cataño C
 */
public class Cuenta {
    protected float saldo;
    protected int numCons = 0;
    protected int numRets = 0;
    protected float tasaAnual;
    protected float comMen = 0;
    
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public void consignar(float cantidad) {
        if (cantidad>0) {
            saldo = saldo + cantidad;
            numCons = numCons + 1;
        }
    }
    
    public void retirar(float cantidad) {
        if (cantidad>0) {
            float nuevoSaldo = saldo - cantidad;
            if (nuevoSaldo >= 0) {
                saldo -= cantidad;
                numRets = numRets + 1;
            } else {
                System.out.println("La cantida a retirar excede el saldo actual.");
            }
        }     
    }   
    
    public void calcularInt() {
        float tasaMen = tasaAnual / 12;
        float intMen = saldo * tasaMen;
        saldo += intMen;
    }
    
    public void extractoMensual() {
        saldo -= comMen;
        calcularInt();
    }
    
    public void imprimir() {
        System.out.println();
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " +comMen);
        System.out.println("Número de transacciones = " + (numCons + numRets));
        System.out.println();
    }
}
