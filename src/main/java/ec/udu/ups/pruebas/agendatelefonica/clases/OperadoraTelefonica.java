package ec.udu.ups.pruebas.agendatelefonica.clases;

/**
 *
 * @author stephancedillo
 */
public class OperadoraTelefonica {

    private int codigo;
    private String nombre;

    public OperadoraTelefonica(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String resultado = "Datos de la operadora  " + "\n ";
        resultado += "Codigo " + codigo + "\n";
        resultado += "Nombre:  " + nombre + "\n";
        return resultado;
    }
}
