/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas_mejorado;

/**
 *
 * @author Samuel Cataño C
 */
public class Persona {
    
    String nombre;
    String apellidos;
    String teléfono;
    String dirección;

    public Persona(String nombre, String apellidos, String teléfono, String dirección) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.teléfono = teléfono;
        this.dirección = dirección;
    }
    
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setTeléfono(String teléfono) {this.teléfono = teléfono;}
    public void setDirección(String dirección) {this.dirección = dirección;}
    
}