/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutoMovil;
    private String marcaAutoMovil;
    private Persona garante1;
    private double valorAutoMovil;
    private double valorMensual;

    public PrestamoAutomovil(Persona b,Persona gar, int t, String ciud, String tipo,
            String marca, double valor) {
        super(b, t, ciud);
        garante1 = gar;
        tipoAutoMovil = tipo;
        marcaAutoMovil = marca;
        valorAutoMovil = valor;

    }

    public void establecerCiudad(String ciu) {
        ciudadPrestamo = ciu.toLowerCase();
    }

    public void establecerTipoAutomovil(String tipo) {
        tipoAutoMovil = tipo;
    }

    public void establecerMarcaAutomovil(String marca) {
        marcaAutoMovil = marca;
    }

    public void establecerGarante(Persona garan) {
        garante1 = garan;
    }

    public void establecerValorAutomovil(double valor) {
        valorAutoMovil = valor;
    }

    public void calcularCostoMensual() {
        valorMensual = valorAutoMovil / tiempoPrestamo;
    }

    public String obtenerTipoAutomovil() {
        return tipoAutoMovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutoMovil;
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public Persona obtenerPersona() {
        return garante1;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerValorAutomovil() {
        return valorAutoMovil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {

        String cadenaFinal = String.format(
                "Nombre: %s\n"
                + "Apellido: %s\n"
                + "UserName: %s\n"
                + "Tiempo Prestamos: %d\n"
                + "Ciudad Del Prestamo: %s\n"
                + "Tipo De Automovil: %s\n"
                + "Marca De Automovil: %s\n"
                + "Valor Automovil: %.2f\n"
                + "Valor Mensual: %.2f\n",
                garante1.obtenerNombrePersona(),
                garante1.obtenerApellidoPersona(),
                garante1.obtenerUsername(),
                tiempoPrestamo,
                ciudadPrestamo,
                tipoAutoMovil,
                marcaAutoMovil,
                valorAutoMovil,
                valorMensual);

        return cadenaFinal;
    }
}
