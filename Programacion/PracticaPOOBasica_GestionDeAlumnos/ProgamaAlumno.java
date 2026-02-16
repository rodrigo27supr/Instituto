package PracticaPOOBasica_GestionDeAlumnos;

public class ProgamaAlumno {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Rodrigo", 22, "DAW" , 7, "54736732j");
        Alumno alumno2 = new Alumno("Javier", 30, "DAW" , 8, "44733232f" );
        Alumno alumno3 = new Alumno("Jose", 24, "DAM" , 3, "66733432r" );

        System.out.println("INFORMACION DE ALUMNOS");
        alumno1.mostrarInfo();
        alumno2.mostrarInfo();
        alumno3.mostrarInfo();
        System.out.println("ESTAN APROBADOS O NO");


        if (alumno1.estaAprobado()) {
            System.out.println("EL ALUMNO " + alumno1.getNombre() + " HA APROBADO");
        } else {
            System.out.println("EL ALUMNO " + alumno1.getNombre() + " HA SUSPENDIDO");
        }

        if (alumno2.estaAprobado()) {
            System.out.println("EL ALUMNO " + alumno2.getNombre() + " HA APROBADO");
        } else {
            System.out.println("EL ALUMNO " + alumno2.getNombre() + " HA SUSPENDIDO");
        }

        if (alumno3.estaAprobado()) {
            System.out.println("EL ALUMNO " + alumno3.getNombre() + " HA APROBADO");
        } else {
            System.out.println("EL ALUMNO " + alumno3.getNombre() + " HA SUSPENDIDO");
        }


        //MODIFICACIONESW
        alumno1.setNotaMedia(8);
        alumno1.setCurso("DAM");
        alumno1.mostrarInfo();

        //COMPARACIONES
        System.out.println("COMPARACION DE NOTA MEDIA");
        if (alumno1.getNotaMedia() > alumno2.getNotaMedia()){
            System.out.println("El alumno " + alumno1.getNombre() + " tiene la mejor nota media");
        } else {
            System.out.println("El alumno " + alumno2.getNombre() + " tiene la mejor nota media");
        }

        //ADICIONALES
        System.out.println("PROBAMOS SUBIR NOTA A JAVI");
        alumno2.subirNota(2);
        System.out.println(alumno2.getNotaMedia());

        alumno2.subirNota(2);
        System.out.println(alumno2.getNotaMedia());

        System.out.println("LOS ALUMNOS SON MAYORES DE EDAD");
        //para comprobar
        alumno3.setEdad(12);

        alumno1.esMayorDeEdad();
        alumno2.esMayorDeEdad();
        alumno3.esMayorDeEdad();


    }
}
