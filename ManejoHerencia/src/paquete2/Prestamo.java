/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudadPrestamo;

    public Prestamo(Persona p, int t, String c) {

        beneficiario = p;
        tiempoPrestamo = t;
        ciudadPrestamo = c;

    }

  

    public void establecerBeneficiario(Persona n) {
        beneficiario = n;
    }

    public void establecerTiempoPrestamos(int t) {
        tiempoPrestamo = t;
    }

    public void establecerCiudadPrestamo(String ciud) {
        ciudadPrestamo = ciud;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiario: %s\n"
                + "Tiempo Prestamos: %d\n"
                + "Ciudad Prestamos: %s\n",
                beneficiario,
                tiempoPrestamo,
                ciudadPrestamo);

        return cadena;
    }
}
