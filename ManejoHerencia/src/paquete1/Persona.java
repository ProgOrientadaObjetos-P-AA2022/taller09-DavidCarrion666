/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class Persona {

    protected String nombresPersona;
    protected String apellidosPersona;
    protected String userName;

    public Persona(String n, String a, String u) {

        nombresPersona = n;
        apellidosPersona = a;
        userName = u;

    }

    public void establecerNombrePersona(String nom) {
        nombresPersona = nom;
    }

    public void establecerApellidoPersona(String ape) {
        apellidosPersona = ape;
    }

    public void establecerUserName(String user) {
        userName = user;
    }

    public String obtenerNombrePersona() {
        return nombresPersona;
    }

    public String obtenerApellidoPersona() {
        return apellidosPersona;
    }

    public String obtenerUsername() {
        return userName;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n",
                nombresPersona,
                apellidosPersona,
                userName);

        return cadena;
    }

}
