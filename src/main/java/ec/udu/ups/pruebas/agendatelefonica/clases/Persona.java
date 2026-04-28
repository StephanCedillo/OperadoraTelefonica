package ec.udu.ups.pruebas.agendatelefonica.clases;

import java.util.Date;

/**
 *
 * @author stephancedillo
 */
public class Persona {

    private String numeroCedula;
    private String nombre;
    private Date fechaNac;

    public Persona(String numeroCedula, String nombre, Date fechaNacimiento) {
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
        this.fechaNac = fechaNacimiento;

    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public int calcularEdad(Date fechaNac) {
        int edad = new Date().getYear() - fechaNac.getYear();
        return edad;
    }

    @Override
    public String toString() {
        String resultado = "-----Datos de la persona  " + "\n ";
        resultado += "Numero de  cedula: " + numeroCedula + "\n";
        resultado += "Nombre:  " + nombre + "\n";
        resultado += "Fecha nacimiento  :  " + fechaNac + "\n";
        return resultado;
    }
}
