/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas_mejorado;
import java.util.*;

/**
 *
 * @author Samuel Cataño C
 */
public class ListaPersonas {
    
    Vector listaPersonas;
    int size;

    public ListaPersonas() {
        listaPersonas = new Vector();
        size = 0;
    }

    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
        size++;
    }

    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
        size--;
    }

    public void borrarLista() {
        listaPersonas.removeAllElements();
        size = 0;
    }
    
    public void cambiarPersona(int i, Persona newP) {
        listaPersonas.set(i, newP);
    }
    
}
