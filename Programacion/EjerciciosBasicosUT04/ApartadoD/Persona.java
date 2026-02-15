package EjerciciosBasicosUT04.ApartadoD;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void imprime() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        if (esMayorEdad()) {
            System.out.println("Estado: Es mayor de edad");
        } else {
            System.out.println("Estado: NO es mayor de edad");
        }
    }
    public boolean esMayorEdad(){
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

  public boolean esJubilado(){
        if (edad >= 65) {
            return true;
        } else {
            return false;
        }
    }

   public int diferenciaEdad(Persona p){
        return Math.abs(this.edad - p.getEdad() );
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
