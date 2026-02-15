package EjerciciosBasicosUT04.ApartadoD;

import java.util.Scanner;

public class ProgramaPersona {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.println("Dime el dni de la persona 1");
        String dni = teclado.nextLine();

        System.out.println("Dime el nombre de la persona 1");
        String nombre = teclado.nextLine();

        System.out.println("Dime el apellido de la persona 1");
        String apellido = teclado.nextLine();

        System.out.println("Dime la edad de la persona 1");
        int edad = teclado.nextInt();

        System.out.println("================================");

        teclado.nextLine();

        System.out.println("Dime el dni de la persona 2");
        String dni2 = teclado.nextLine();

        System.out.println("Dime el nombre de la persona 2");
        String nombre2 = teclado.nextLine();

        System.out.println("Dime el apellido de la persona 2");
        String apellido2 = teclado.nextLine();

        System.out.println("Dime la edad de la persona 2");
        int edad2 = teclado.nextInt();

        Persona persona1 = new Persona(dni, nombre, apellido, edad);
        Persona persona2 = new Persona(dni2, nombre2, apellido2, edad2);

        System.out.println("datos de la persona 1");
        persona1.imprime();
        System.out.println("datos de la persona 2");
        persona2.imprime();

        System.out.println("DESPUES DE LOS CAMBIOS");
        persona1.setNombre("Alfredo");
        persona1.imprime();

        System.out.println("CONSULTA DE APELLIDO DE PERSONA 1 Y 2");
        System.out.println(persona1.getApellidos());
        System.out.println(persona2.getApellidos());

        System.out.println(persona1.esMayorEdad());
        System.out.println(persona1.esJubilado());

        System.out.println("La diferencia de edad es: " + persona1.diferenciaEdad(persona2));



    }
}
