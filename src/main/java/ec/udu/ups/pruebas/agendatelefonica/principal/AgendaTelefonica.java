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
        ArrayList<OperadoraTelefonica> operadoras = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Telefono> telefonos = new ArrayList<>();
        Scanner leer = new Scanner(System.in);

        System.out.println("Menu de opciones \n 1. Registrar Contactos \n 2.Registrar Operadoras \n  3. Registrar Telefonos \n 4. Salir");
        System.out.println("Ingresa numero del  menu ");
        int numeroMenu = leer.nextInt();
        leer.nextLine();
        String continuar = "";

        do {
            switch (numeroMenu) {
                case 1:
                    do {
                        System.out.println("Ingresa el numero de cedula");
                        String numeroCedula = leer.next();
                        leer.nextLine();
                        System.out.println("Ingresa el nombre");
                        String nombre = leer.nextLine();

                        System.out.println("Ingresa la fecha de nacimiento : ");
                        int año = leer.nextInt();
                        while (año < 0 || año > (new Date().getYear() + 1900)) {
                            System.out.println("Usted ingreso datos imposibles porfavor ingresa la fecha de nacimiento : ");
                            año = leer.nextInt();
                        };
                        System.out.println("Ingresar su dia de nacimiento");
                        int dia = leer.nextByte();
                        while (dia <= 0 || dia > 31) {
                            System.out.println("Usted ingreso datos imposibles porfavor ingresar su dia de nacimiento");
                            dia = leer.nextByte();
                        };
                        System.out.println("Ingresar su mes de nacimiento");
                        int mes = leer.nextByte();
                        while (mes <= 0 || mes > 12) {
                            System.out.println("Usted ingreso datos imposibles porfavor ingresar su mes de nacimiento");
                            mes = leer.nextByte();

                        };
                        leer.nextLine();
                        personas.add(new Persona(numeroCedula, nombre, new Date(año - 1900, mes - 1, dia)));
                        System.out.println("Desea ingresar otro contacto? ( S/N) ");
                        continuar = leer.nextLine();
                    } while (continuar.equalsIgnoreCase("S"));
                    break;
                case 2:
                    do {
                        System.out.println("Ingresa el codigo");
                        int codigo = leer.nextInt();
                        leer.nextLine();
                        System.out.println("Ingresa el nombre");
                        String nombre = leer.nextLine();

                        operadoras.add(new OperadoraTelefonica(codigo, nombre));
                        System.out.println("Desea ingresar otra operadora? ( S/N) ");
                        continuar = leer.nextLine();
                    } while (continuar.equalsIgnoreCase("S"));
                    break;
                case 3:
                    if (personas.isEmpty() || operadoras.isEmpty()) {
                        System.out.println("No hay operadoras ni personas, intente ingresar primero contactos o operadoras");
                    } else {
                        do {
                            System.out.println("Ingresar el numero");
                            int numeroTelefono = leer.nextInt();
                            System.out.println("Ingresar el tipo");
                            String tipoTelefono = leer.next();

                            Telefono telefono = new Telefono(numeroTelefono, tipoTelefono);
                            // Buscar persona en la lista de personas

                            boolean personaEncontrada = false;
                            do {
                                System.out.println("¿De que contacto busca añadir?(Cedula)");
                                String cedulaBuscada = leer.next();
                                for (Persona persona : personas) {
                                    if (persona.getNumeroCedula().equalsIgnoreCase(cedulaBuscada)) {
                                        telefono.setUnaPersona(persona);
                                        personaEncontrada = true;
                                        break;
                                    }
                                }
                                if (!personaEncontrada) {
                                    System.out.println("Persona no fue encontrada");

                                }

                            } while (!personaEncontrada);
                            boolean operadoraEncontrada = false;
                            do {
                                System.out.println("¿De que operadora busca añadir?(Codigo)");
                                int operadoraBuscada = leer.nextInt();
                                for (OperadoraTelefonica operadora : operadoras) {
                                    if (operadora.getCodigo() == operadoraBuscada) {
                                        telefono.setOperadora(operadora);
                                        operadoraEncontrada = true;
                                        break;
                                    }
                                }
                                if (!operadoraEncontrada) {
                                    System.out.println("Operadora no fue encontrada");

                                }
                            } while (!operadoraEncontrada);
                            telefonos.add(telefono);

                        } while (continuar.equalsIgnoreCase("S"));
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Dato incorrecto, ingresar de nuevo");

            }
            System.out.println("Menu de opciones \n 1. Registrar Contactos \n 2.Registrar Operadoras \n  3. Registrar Telefonos \n 4. Salir");
            System.out.println("Ingresa numero del  menu ");
            numeroMenu = leer.nextInt();
        } while (numeroMenu != 4);
        for (Telefono telefono : telefonos) {
            System.out.println(telefonos);
        }

    }
}
