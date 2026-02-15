package EjerciciosBasicosUT04.ApartadoA;

import java.util.Scanner;

public class ProgramaPersona {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        System.out.println("Dime el dni de la persona 1");
        String dni = teclado.nextLine();
        persona1.setDni(dni);

        System.out.println("Dime el nombre de la persona 1");
        String nombre = teclado.nextLine();
        persona1.setNombre(nombre);

        System.out.println("Dime el apellido de la persona 1");
        String apellido = teclado.nextLine();
        persona1.setApellidos(apellido);

        System.out.println("Dime la edad de la persona 1");
        int edad = teclado.nextInt();
        persona1.setEdad(edad);

        System.out.println("================================");

        teclado.nextLine();

        System.out.println("Dime el dni de la persona 2");
        String dni2 = teclado.nextLine();
        persona2.setDni(dni2);

        System.out.println("Dime el nombre de la persona 2");
        String nombre2 = teclado.nextLine();
        persona2.setNombre(nombre2);

        System.out.println("Dime el apellido de la persona 2");
        String apellido2 = teclado.nextLine();
        persona2.setApellidos(apellido2);

        System.out.println("Dime la edad de la persona 2");
        int edad2 = teclado.nextInt();
        persona2.setEdad(edad2);

        System.out.println("datos de la persona 1");
        persona1.mostrarPersona();
        System.out.println("datos de la persona 2");
        persona2.mostrarPersona();






    }
}
