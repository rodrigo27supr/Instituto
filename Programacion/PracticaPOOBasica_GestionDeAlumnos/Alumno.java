package PracticaPOOBasica_GestionDeAlumnos;

public class Alumno {
    private String nombre;
    private int edad;
    private String curso;
    private double notaMedia ;
    private String dni;

    public Alumno(String nombre, int edad, String curso, double notaMedia, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        setNotaMedia(notaMedia);
        this.dni = dni;
    }

    public void esMayorDeEdad() {
        if (edad >=18) {
            System.out.println("El alumno es mayor de edad");
        } else {
            System.out.println("El alumno es menor de edad");
        }
    }

    public void mostrarInfo(){
        System.out.println("El alumno "+ nombre + " tiene " + edad + " años, esta en el curso  " + curso + " y tiene " + notaMedia + " de nota media y su dni es " + dni);
    }

    public boolean estaAprobado () {
        if (notaMedia >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public void subirNota (double puntos){
        setNotaMedia(getNotaMedia()+puntos);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNotaMedia(double notaMedia) {
        if (notaMedia >= 0 && notaMedia <= 10) {
            this.notaMedia = notaMedia;

        } else {
            System.err.println("La nota media esta fuera del rango");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public double getNotaMedia() {
            return notaMedia;
    }

    public String getDni() {
        return dni;
    }
}
