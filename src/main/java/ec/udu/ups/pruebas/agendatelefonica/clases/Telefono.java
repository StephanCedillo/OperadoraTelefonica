package ec.udu.ups.pruebas.agendatelefonica.clases;

import java.util.Scanner;

/**
 *
 * @author stephancedillo
 */
public class Telefono {

    private int numero;
    private String tipo;
    private OperadoraTelefonica operadora;
    private Persona unaPersona;

    public Telefono(int numero, String tipo, OperadoraTelefonica operadora, Persona unaPersona) {
        this.numero = numero;
        this.tipo = tipo;
        this.operadora = operadora;
        this.unaPersona = unaPersona;

    }

    public OperadoraTelefonica getOperadora() {
        return operadora;
    }

    public void setOperadora(OperadoraTelefonica operadora) {
        this.operadora = operadora;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String resultado = "Datos del telefono " + "\n ";
        resultado += "Numero de Telefono " + numero + "\n";
        resultado += "Tipo:  " + tipo + "\n";
        resultado += unaPersona;
        resultado += operadora;
        return resultado;
    }
}
