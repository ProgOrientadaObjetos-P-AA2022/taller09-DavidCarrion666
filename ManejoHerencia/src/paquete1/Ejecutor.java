/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int opcion;
        boolean bandera = true;

        do {
            opcion = interfaz();

            if (opcion == 1 || opcion == 2) {
                System.out.println("Ingrese El Nombre De La Persona");
                String nombre = entry.nextLine();
                System.out.println("Ingrese Los Apellidos De La Persona");
                String apellido = entry.nextLine();
                System.out.println("Ingrese El Nombre De Usuario De La Persona");
                String userName = entry.nextLine();
                Persona p = new Persona(nombre, apellido, userName);

                switch (opcion) {
                    case 1:
                        nuevoPrestamoAutomovil(p);
                        break;
                    case 2:
                        nuevoPrestamosEducativo(p);
                        break;
                }
            } else {
                System.out.println("Prgorama finalizado Con Exito");
                bandera = false;
                break;
            }
        } while (bandera);
    }

    private static int interfaz() {
        Scanner entry = new Scanner(System.in);
        int opcion;
        System.out.println("        **Interfaz**");
        System.out.println("Crear un Prestamo de tipo Automovil:         [1]");
        System.out.println("Crear un Prestamo de tipo Educativo:         [2]");
        System.out.println("Salir Del programa:                          [3]");
        opcion = entry.nextInt();
        if (opcion < 1 || opcion > 3) {
            do {
                System.out.println("El valor esta fuera de los parametros, "
                        + "ingrese otro valor");
                opcion = entry.nextInt();
            } while (opcion < 1 || opcion > 3);
        }
        return opcion;

    }

    public static void nuevoPrestamoAutomovil(Persona p) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Ingrese El Nombre DeL Garante");
        String nombre = entry.nextLine();
        System.out.println("Ingrese Los Apellidos Del Garante");
        String apellido = entry.nextLine();
        System.out.println("Ingrese El Nombre De Usuario DeL Garante");
        String userName = entry.nextLine();
        Persona garante = new Persona(nombre, apellido, userName);

        System.out.println("------------------------------------------------");
        System.out.println("Ingrese El Numero De Meses Del Prestamo");
        int numMeses = entry.nextInt();
        entry.nextLine();
        System.out.println("Ingrese La Ciudad Del Prestamos");
        String ciudad = entry.nextLine();
        
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese El Tipo De Automovil");
        String tipo = entry.nextLine();
        System.out.println("Ingrese La Marca Del Automovil");
        String marca = entry.nextLine();
        System.out.println("Ingrese El Valor Del Automovil");
        double valor = entry.nextInt();

        PrestamoAutomovil preAuto = new PrestamoAutomovil(p, garante, numMeses,
                ciudad, tipo, marca, valor);
        
        System.out.println(preAuto);

    }

    public static void nuevoPrestamosEducativo(Persona p) {
        Scanner entry = new Scanner(System.in);

        System.out.println("------------------------------------------------");

        System.out.println("Ingrese El Nombre De La Institucion");
        String nombre2 = entry.nextLine();
        System.out.println("Ingrese Las Siglas De La Institucion");
        String siglas = entry.nextLine();

        InstitucionEducativa i = new InstitucionEducativa(nombre2, siglas);
        System.out.println("------------------------------------------------");

        System.out.println("Ingrese El Numero De Meses Del Prestamo");
        int numMeses = entry.nextInt();
        System.out.println("Ingrese La Ciudad Del Prestamos");
        String ciudad = entry.nextLine();

        Prestamo pre = new Prestamo(p, numMeses, ciudad);
        System.out.println("------------------------------------------------");

        System.out.println("Ingrese El Nivel De Estudio");
        String nivel = entry.nextLine();
        System.out.println("Ingrese El Valor De La Carrera");
        double valor = entry.nextDouble();

        PrestamoEducativo preEdu = new PrestamoEducativo(p, numMeses, ciudad, nivel, valor);
    }
}
