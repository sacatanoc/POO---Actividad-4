/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tiendamascotas;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 *
 * @author Samuel Cataño C
 */

public class TiendaMascotas {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        
        RazasDePerroMediano collie = RazasDePerroMediano.COLLIE;
        RazaDeGatoSinPelo esfinge = RazaDeGatoSinPelo.ESFINGE;
        
        PerroMediano perro1 = new PerroMediano("Alyn",10,"Dorado",false,23,collie);
        GatoSinPelo gato1 = new GatoSinPelo("Miriam", 8, "Blanco", 17.7, 1.4, esfinge);
        
        System.out.println("Ingrese el nombre de la nueva mascota: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese el color de la nueva mascota: ");
        String color = input.nextLine();
        System.out.println("Ingrese la edad de la nueva mascota: ");
        int edad = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Ingrese la especie de la nueva mascota: ");
        String especie = input.nextLine();
        
        switch(especie.toLowerCase()){
            case "perro" -> {
                boolean muerde = true;
                System.out.println("Ingrese el peso del perro: ");
                double peso = input.nextDouble();
                input.nextLine();
                System.out.println("¿El perro muerde? (La respuesto por defecto es sí): ");
                String resp = input.nextLine();
                if (resp.toLowerCase().equals("no")) {
                    muerde = false;
                }
                System.out.println("Ingrese la raza del perro: ");
                String raza = input.nextLine();
                raza = raza.toLowerCase();
                switch(raza) {
                    case "caniche" -> {
                        RazasDePerroChico razadef = RazasDePerroChico.CANICHE;
                        PerroChico nuevoPerro = new PerroChico(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "yorkshire" -> {
                        RazasDePerroChico razadef = RazasDePerroChico.YORKSHIRE;
                        PerroChico nuevoPerro = new PerroChico(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "terrier" -> {
                        RazasDePerroChico razadef = RazasDePerroChico.TERRIER;
                        PerroChico nuevoPerro = new PerroChico(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "schnauzer" -> {
                        RazasDePerroChico razadef = RazasDePerroChico.SCHNAUZER;
                        PerroChico nuevoPerro = new PerroChico(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "chihuahua" -> {
                        RazasDePerroChico razadef = RazasDePerroChico.CHIHUAHUA;
                        PerroChico nuevoPerro = new PerroChico(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "collie" -> {
                        RazasDePerroMediano razadef = RazasDePerroMediano.COLLIE;
                        PerroMediano nuevoPerro = new PerroMediano(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "dalmata" -> {
                        RazasDePerroMediano razadef = RazasDePerroMediano.DALMATA;
                        PerroMediano nuevoPerro = new PerroMediano(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "dálmata" -> {
                        RazasDePerroMediano razadef = RazasDePerroMediano.DALMATA;
                        PerroMediano nuevoPerro = new PerroMediano(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "bulldog" -> {
                        RazasDePerroMediano razadef = RazasDePerroMediano.BULLDOG;
                        PerroMediano nuevoPerro = new PerroMediano(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "galgo" -> {
                        RazasDePerroMediano razadef = RazasDePerroMediano.GALGO;
                        PerroMediano nuevoPerro = new PerroMediano(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "sabueso" -> {
                        RazasDePerroMediano razadef = RazasDePerroMediano.SABUESO;
                        PerroMediano nuevoPerro = new PerroMediano(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "pastor aleman" -> {
                        RazasDePerroGrande razadef = RazasDePerroGrande.PASTORALEMAN;
                        PerroGrande nuevoPerro = new PerroGrande(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "pastor alemán" -> {
                        RazasDePerroGrande razadef = RazasDePerroGrande.PASTORALEMAN;
                        PerroGrande nuevoPerro = new PerroGrande(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "doberman" -> {
                        RazasDePerroGrande razadef = RazasDePerroGrande.DOBERMAN;
                        PerroGrande nuevoPerro = new PerroGrande(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "rottweiller" -> {
                        RazasDePerroGrande razadef = RazasDePerroGrande.ROTWEILLER;
                        PerroGrande nuevoPerro = new PerroGrande(nombre,edad,color,muerde,peso,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    default -> {
                        System.out.println("");
                        System.out.println("Raza desconocida");
                    }
                }
            }
            case "gato" -> {
                System.out.println("Ingrese la longitud de salto del gato: ");
                double salto = input.nextDouble();
                input.nextLine();
                System.out.println("Ingrese la altura máxima del salto: ");
                double altura = input.nextDouble();
                input.nextLine();
                System.out.println("Ingrese la raza del gato: ");
                String raza = input.nextLine();
                raza = raza.toLowerCase();
                switch(raza) {
                    case "esfinge" -> {
                        RazaDeGatoSinPelo razadef = RazaDeGatoSinPelo.ESFINGE;
                        GatoSinPelo nuevoGato = new GatoSinPelo(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoGato.imprimirDatos();
                    }
                    case "elfo" -> {
                        RazaDeGatoSinPelo razadef = RazaDeGatoSinPelo.ELFO;
                        GatoSinPelo nuevoGato = new GatoSinPelo(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoGato.imprimirDatos();
                    }
                    case "donskoy" -> {
                        RazaDeGatoSinPelo razadef = RazaDeGatoSinPelo.DONSKOY;
                        GatoSinPelo nuevoGato = new GatoSinPelo(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoGato.imprimirDatos();
                    }
                    case "angora" -> {
                        RazaDeGatoDePeloCorto razadef = RazaDeGatoDePeloCorto.ANGORA;
                        GatoDePeloCorto nuevoGato = new GatoDePeloCorto(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoGato.imprimirDatos();
                    }
                    case "himalayo" -> {
                        RazaDeGatoDePeloCorto razadef = RazaDeGatoDePeloCorto.HIMALAYO;
                        GatoDePeloCorto nuevoGato = new GatoDePeloCorto(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoGato.imprimirDatos();
                    }
                    case "balines" -> {
                        RazaDeGatoDePeloCorto razadef = RazaDeGatoDePeloCorto.BALINES;
                        GatoDePeloCorto nuevoGato = new GatoDePeloCorto(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoGato.imprimirDatos();
                    }
                    case "balinés" -> {
                        RazaDeGatoDePeloCorto razadef = RazaDeGatoDePeloCorto.BALINES;
                        GatoDePeloCorto nuevoGato = new GatoDePeloCorto(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoGato.imprimirDatos();
                    }
                    case "somali" -> {
                        RazaDeGatoDePeloCorto razadef = RazaDeGatoDePeloCorto.SOMALI;
                        GatoDePeloCorto nuevoGato = new GatoDePeloCorto(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoGato.imprimirDatos();
                    }
                    case "somalí" -> {
                        RazaDeGatoDePeloCorto razadef = RazaDeGatoDePeloCorto.SOMALI;
                        GatoDePeloCorto nuevoGato = new GatoDePeloCorto(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoGato.imprimirDatos();
                    }
                    case "azul ruso" -> {
                        RazaDeGatoDePeloLargo razadef = RazaDeGatoDePeloLargo.AZULRUSO;
                       GatoDePeloLargo nuevoPerro = new GatoDePeloLargo(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "britanico" -> {
                        RazaDeGatoDePeloLargo razadef = RazaDeGatoDePeloLargo.BRITANICO;
                       GatoDePeloLargo nuevoPerro = new GatoDePeloLargo(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "británico" -> {
                        RazaDeGatoDePeloLargo razadef = RazaDeGatoDePeloLargo.BRITANICO;
                       GatoDePeloLargo nuevoPerro = new GatoDePeloLargo(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "manx" -> {
                        RazaDeGatoDePeloLargo razadef = RazaDeGatoDePeloLargo.MANX;
                       GatoDePeloLargo nuevoPerro = new GatoDePeloLargo(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    case "devon rex" -> {
                        RazaDeGatoDePeloLargo razadef = RazaDeGatoDePeloLargo.DEVONREX;
                       GatoDePeloLargo nuevoPerro = new GatoDePeloLargo(nombre,edad,color,altura,salto,razadef);
                        System.out.println("");
                        nuevoPerro.imprimirDatos();
                    }
                    default -> {
                        System.out.println("");
                        System.out.println("Raza desconocida");
                    }
                }
            }
            default -> {
                System.out.println("");
                System.out.println("Especie inválida");
            }
        }
        
        System.out.println("");
        System.out.println("Otras mascotas:");
        System.out.println("");
        perro1.imprimirDatos();
        System.out.println("");
        gato1.imprimirDatos();
        System.out.println("");
        
    }
}
