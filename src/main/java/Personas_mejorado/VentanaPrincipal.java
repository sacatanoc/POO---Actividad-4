/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas_mejorado;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Samuel Cataño C
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    
    private ListaPersonas lista;
    private Container contenedor;

    private JLabel nombre, apellidos, teléfono, dirección;

    private JTextField campoNombre, campoApellidos, campoTeléfono, campoDirección;
    private JButton añadir, eliminar, cambiar, borrarLista;
    private JList listaNombres;
    private DefaultListModel modelo;
    private JScrollPane scrollLista;

    public VentanaPrincipal(){
        lista = new ListaPersonas();
        inicio();
        setTitle("Personas");
        setSize(270,375);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        
        contenedor = getContentPane();
        contenedor.setLayout(null);
        
        nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(20, 20, 135, 23);
        
        campoNombre = new JTextField();
        campoNombre.setBounds(105, 20, 135, 23);
        
        apellidos = new JLabel();
        apellidos.setText("Apellidos:");
        apellidos.setBounds(20, 50, 135, 23);
        
        campoApellidos = new JTextField();
        campoApellidos.setBounds(105, 50, 135, 23);

        teléfono = new JLabel();
        teléfono.setText("Teléfono:");
        teléfono.setBounds(20, 80, 135, 23);
        
        campoTeléfono = new JTextField();
        campoTeléfono.setBounds(105, 80, 135, 23);

        dirección = new JLabel();
        dirección.setText("Dirección:");
        dirección.setBounds(20, 110, 135, 23);
        
        campoDirección = new JTextField();
        campoDirección.setBounds(105, 110, 135, 23);

        añadir = new JButton();
        añadir.setText("Añadir");
        añadir.setBounds(105, 150, 80, 23);
        añadir.addActionListener(this);

        eliminar= new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(20, 280, 80, 23);
        eliminar.addActionListener(this);
        
        cambiar = new JButton();
        cambiar.setText("Cambiar");
        cambiar.setBounds(135, 280, 100, 23);
        cambiar.addActionListener(this);

        borrarLista= new JButton();
        borrarLista.setText("Borrar lista");
        borrarLista.setBounds(75, 310, 120, 23);
        borrarLista.addActionListener(this);

        listaNombres = new JList();
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        modelo = new DefaultListModel();

        scrollLista = new JScrollPane();
        scrollLista.setBounds(20, 190 ,220, 80);
        scrollLista.setViewportView(listaNombres);

        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(teléfono);
        contenedor.add(campoTeléfono);
        contenedor.add(dirección);
        contenedor.add(campoDirección);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(cambiar);
        contenedor.add(scrollLista);
    }

    @Override public void actionPerformed(ActionEvent evento) {
        
        if (evento.getSource() == añadir) {
            añadirPersona();
        }
        
        if (evento.getSource() == eliminar) { 
            eliminarNombre(listaNombres.getSelectedIndex() );
        }
        
        if (evento.getSource() == cambiar) { 
            cambiarPersona(listaNombres.getSelectedIndex() );
        }

        if (evento.getSource() == borrarLista) {
            borrarLista();
        }
        
    }

    private void añadirPersona() {
        
        boolean a = false;
        Persona p = new Persona(campoNombre.getText(),campoApellidos.getText(),campoTeléfono.getText(), campoDirección.getText());
        String elemento = campoNombre.getText() + "-" + campoApellidos.getText() + "-" + campoTeléfono.getText() + "-" + campoDirección.getText();
        
        for (int i=0;i<lista.size;i++) {
            if(modelo.elementAt(i).equals(elemento)){
                a=true;
            }
        }
        
        if (a) {
            JOptionPane.showMessageDialog(null, "Ya hay una persona con esas características en la lista","Advertencia",JOptionPane.WARNING_MESSAGE);
            campoNombre.setText("");
            campoApellidos.setText("");
            campoTeléfono.setText("");
            campoDirección.setText("");
        } else {
        
        lista.añadirPersona(p);
        modelo.addElement(elemento);
        listaNombres.setModel(modelo);
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTeléfono.setText("");
        campoDirección.setText("");
        
        }
    }
    
    private void eliminarNombre(int indice) {
        if (indice >= 0) {
            modelo.removeElementAt(indice);
            lista.eliminarPersona(indice);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cambiarPersona(int indice) {
        if (indice >= 0) {
            //modelo.removeElementAt(indice);
            //lista.eliminarPersona(indice);
            Persona newP = new Persona(campoNombre.getText(),campoApellidos.getText(),campoTeléfono.getText(), campoDirección.getText());
            String subElemento = campoNombre.getText() + "-" + campoApellidos.getText() + "-" + campoTeléfono.getText() + "-" + campoDirección.getText();
            modelo.setElementAt(subElemento, indice);
            lista.cambiarPersona(indice, newP);
            listaNombres.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarLista() {
        lista.borrarLista();
        modelo.clear();
    }
    
}
