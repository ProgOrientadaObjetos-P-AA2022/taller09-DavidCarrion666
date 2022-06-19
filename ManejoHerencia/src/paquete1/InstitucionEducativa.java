/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class InstitucionEducativa {

    protected String nombreInstitucion;
    protected String siglasInstitucion;

    public InstitucionEducativa(String n, String s) {

        nombreInstitucion = n;
        siglasInstitucion = s;

    }

    public void establecerNombreInstitucion(String nom) {
        nombreInstitucion = nom;
    }

    public void establecerSiglasInstitucion(String sig) {
        siglasInstitucion = sig;
    }

    public String obtenerNombreInstitucion() {
        return nombreInstitucion;
    }

    public String obtenerSiglasInstitucion() {
        return siglasInstitucion;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Siglas: %s\n",
                nombreInstitucion,
                siglasInstitucion);

        return cadena;
    }
}
