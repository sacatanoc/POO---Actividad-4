/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_4_ejercicio_1;

/**
 *
 * @author Samuel Cataño C
 */
public class CuentaCorriente extends Cuenta {
    float sobregiro;
    
    public CuentaCorriente(float saldo, float tasa) {
    super(saldo, tasa);
    sobregiro = 0;
    }
    
    @Override public void retirar(float cantidad) {
        float resultado = saldo - cantidad;
        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }
    
    @Override public void consignar(float cantidad) {
        float residuo = cantidad-sobregiro;
        if (sobregiro > 0) {
        if (residuo > 0) {
            sobregiro = 0;
            saldo = residuo;
        } else {
            sobregiro = -residuo;
            saldo = 0;
        }
        } else {
            super.consignar(cantidad);
        }
    }
    
    @Override public void extractoMensual() {
        super.extractoMensual(); // Invoca al método de la clase padre
    }
    
    @Override public void imprimir() {
        System.out.println("Valor de sobregiro = $" + sobregiro);
        super.imprimir();
    }
}
