/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_4_ejercicio_1;

/**
 *
 * @author Samuel Cataño C
 */
public class CuentaAhorros extends Cuenta{
    private boolean activa = false;
    
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo >= 10000) {activa = true;}
    }
    
    @Override public void retirar(float cantidad) {
        if (activa) super.retirar(cantidad);
    }
    
    @Override public void consignar(float cantidad) {
        if (activa) super.consignar(cantidad);
    }
    
    @Override public void extractoMensual() {
        if (numRets > 4) {
            comMen += (numRets - 4) * 1000;
        }
        super.extractoMensual();
        if ( saldo < 10000 ) activa = false;
    }
}
