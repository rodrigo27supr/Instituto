package POO1.EquipoFutbol2;

public class Entrenador {
    private String nombre;
    private int anioExperiencia;
    public static final int MAX_EXPERIENCIA = 30;

    public Entrenador(String nombre, int anioExperiencia) {
        this.nombre = nombre;
        this.anioExperiencia = anioExperiencia;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioExperiencia() {
        return anioExperiencia;
    }

    public void setAnioExperiencia(int anioExperiencia) {
        this.anioExperiencia = anioExperiencia;
    }
}
