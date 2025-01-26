/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_4_ejercicio_1;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 *
 * @author Samuel Cataño C
 */
public class Actividad_4_Ejercicio_1 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de Ahorros");
        System.out.println("Ingrese el saldo inicial: $ ");
        float saldoInicialAhorros = input.nextFloat();
        System.out.println("Ingrese la tasa de interés: $ ");
        float tasaAhorros = input.nextFloat();
        
        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros,tasaAhorros);
        
        System.out.println("Ingrese la cantidad a consignar: $ ");
        float cantidadParaDepositar = input.nextFloat();
        cuenta1.consignar(cantidadParaDepositar);
        
        System.out.println("Ingrese la cantidad a retirar: $ ");
        float cantidadParaRetirar = input.nextFloat();
        cuenta1.retirar(cantidadParaRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
    }
}
