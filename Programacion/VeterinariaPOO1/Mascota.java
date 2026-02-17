package VeterinariaPOO1;

public class Mascota {
   private String nombre;
   private String especie;
   private int edad;
   private boolean estaVacunado = false;
   private Duenyo propietario;

    public Mascota(String nombre, String especie, int edad, boolean estaVacunado, Duenyo propietario) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.estaVacunado = estaVacunado;
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstaVacunado() {
        return estaVacunado;
    }

    public void setEstaVacunado(boolean estaVacunado) {
        this.estaVacunado = estaVacunado;
    }

    public Duenyo getPropietario() {
        return propietario;
    }

    public void setPropietario(Duenyo propietario) {
        this.propietario = propietario;
    }
}
