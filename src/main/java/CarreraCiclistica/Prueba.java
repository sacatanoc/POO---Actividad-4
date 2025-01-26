/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CarreraCiclistica;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Samuel Cataño C
 */
public class Prueba {

    public static void main(String[] args) {
        
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
            Equipo equipo1 = new Equipo("Sky", "Estados Unidos");
            
            Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320, 25);
            Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10);
            Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);
            
            equipo1.añadirCiclista(velocista1);
            equipo1.añadirCiclista(escalador1);
            equipo1.añadirCiclista(contrarrelojista1);
            
            velocista1.setTiempoAcumulado(365);
            escalador1.setTiempoAcumulado(385);
            contrarrelojista1.setTiempoAcumulado(370);
            
            equipo1.calcularTotalTiempo();
            
            equipo1.imprimir();
            equipo1.listarEquipo();
        
    }

}
