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
        String listaAutos = "";
        String listaEducativa = "";

        do {
            opcion = interfaz();

            if (opcion == 1) {
                mostrarListas(listaAutos, listaEducativa);
            } else {
                if (opcion == 2 || opcion == 3) {
                    System.out.println("Ingrese El Nombre De La Persona");
                    String nombre = entry.nextLine();
                    System.out.println("Ingrese Los Apellidos De La Persona");
                    String apellido = entry.nextLine();
                    System.out.println("Ingrese El Nombre De Usuario De La Persona");
                    String userName = entry.nextLine();
                    Persona p = new Persona(nombre, apellido, userName);
                    switch (opcion) {
                        case 2:
                            listaAutos = String.format("%s\n%s\n%s\n",
                                    listaAutos,
                                    p,
                                    nuevoPrestamoAutomovil(p));
                            break;
                        case 3:
                            listaEducativa = String.format("%s\n%s\n%s\n",
                                    listaEducativa,
                                    p,
                                    nuevoPrestamosEducativo(p));
                            break;

                    }
                } else {
                    System.out.println("Programa finalizado Con Exito");
                    bandera = false;
                    break;
                }
            }
        } while (bandera);
    }

    public static int interfaz() {
        Scanner entry = new Scanner(System.in);
        int opcion;
        System.out.println("        **Interfaz**");
        System.out.println("Mostrar Listas:                              [1]");
        System.out.println("Crear un Prestamo de tipo Automovil:         [2]");
        System.out.println("Crear un Prestamo de tipo Educativo:         [3]");
        System.out.println("Finalizar Programa:                          [4]");
        opcion = entry.nextInt();
        if (opcion < 1 || opcion > 4) {
            do {
                System.out.println("El valor esta fuera de los parametros, "
                        + "ingrese otro valor");
                opcion = entry.nextInt();
            } while (opcion < 1 || opcion > 4);
        }
        return opcion;

    }

    public static String nuevoPrestamoAutomovil(Persona p) {
        Scanner entry = new Scanner(System.in);
        String cadena = "";
        System.out.println("------------------------------------------------");
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
        preAuto.calcularCostoMensual();
        System.out.println("------------------------------------------------");
        cadena = String.format("%s\n%s\n", cadena, preAuto);
        return cadena;

    }

    public static String nuevoPrestamosEducativo(Persona p) {
        Scanner entry = new Scanner(System.in);
        String cadena = "";
        System.out.println("------------------------------------------------");

        System.out.println("Ingrese El Nombre De La Institucion");
        String nombre2 = entry.nextLine();
        System.out.println("Ingrese Las Siglas De La Institucion");
        String siglas = entry.nextLine();

        InstitucionEducativa i = new InstitucionEducativa(nombre2, siglas);
        System.out.println("------------------------------------------------");

        System.out.println("Ingrese El Numero De Meses Del Prestamo");
        int numMeses = entry.nextInt();
        entry.nextLine();
        System.out.println("Ingrese La Ciudad Del Prestamos");
        String ciudad = entry.nextLine();

        System.out.println("------------------------------------------------");

        System.out.println("Ingrese El Nivel De Estudio");
        String nivel = entry.nextLine();
        System.out.println("Ingrese El Valor De La Carrera");
        double valor = entry.nextDouble();

        PrestamoEducativo preEdu = new PrestamoEducativo(p, numMeses, ciudad,
                i, nivel, valor);
        preEdu.calcularValorMensual();
        System.out.println("------------------------------------------------");
        cadena = String.format("%s\n%s\n", cadena, preEdu);
        return cadena;
    }

    public static void mostrarListas(String listaAutos, String listaEducativa) {
        Scanner entry = new Scanner(System.in);

        System.out.println("            **Listas**");
        System.out.println("Mostrar Lista De Prestamos De Automoviles:     [1]");
        System.out.println("Mostrar Lista De Prestamos Educativos    :     [2]");
        int opcion = entry.nextInt();
        if (opcion < 1 || opcion > 2) {
            do {
                System.out.println("El valor esta fuera de los parametros, "
                        + "ingrese otro valor");
                opcion = entry.nextInt();
            } while (opcion < 1 || opcion > 2);
        }

        if (opcion == 1) {
            System.out.println(listaAutos);

        } else {
            if (opcion == 2) {
                System.out.println(listaEducativa);
            }

        }
    }
}
