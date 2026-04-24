package ec.udu.ups.pruebas.agendatelefonica.principal;

import ec.udu.ups.pruebas.agendatelefonica.clases.OperadoraTelefonica;
import ec.udu.ups.pruebas.agendatelefonica.clases.Persona;
import ec.udu.ups.pruebas.agendatelefonica.clases.Telefono;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author stephancedillo
 */
public class AgendaTelefonica {

    public static void main(String[] args) {
        Persona personaUno = new Persona("021312321", "Carlos", new Date(2008 - 1900, 0, 15));

        OperadoraTelefonica operadoraUno = new OperadoraTelefonica(1, "Claro");

        Telefono telefonoUno = new Telefono(1312332, "Movil", operadoraUno, personaUno);
       // System.out.println(telefonoUno.toString());

       
        // Manejo listas en Java
        ArrayList<OperadoraTelefonica> operadoras = new ArrayList();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el arreglo de 5 operadoras");
        String continuar="";
        do{
            System.out.println("Ingresa el codigo");
            int codigo= leer.nextInt();
            leer.nextLine();
            System.out.println("Ingresa el nombre");
            String nombre= leer.nextLine();
            
            operadoras.add(new OperadoraTelefonica(codigo,nombre));
            System.out.println("Desea ingresar otra operadora? ( S/N) ");
            continuar= leer.nextLine();
        }while (continuar.equalsIgnoreCase("S"));
        for( OperadoraTelefonica operadora: operadoras){
            System.out.println(operadora);
        }
              
    }
}
