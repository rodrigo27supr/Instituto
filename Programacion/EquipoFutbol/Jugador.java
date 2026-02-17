package EquipoFutbol;

public class Jugador {
    private String nombre;
    private int dorsal;
    private boolean estaLesionado = false;

    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        String estado = "";
        if (this.estaLesionado) {
            estado = "(LESIONADO)";
        } else {
            estado = "(DISPONIBLE)";
        }
        return nombre + " - " + dorsal + " " + estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public boolean isEstaLesionado() {
        return estaLesionado;
    }

    public void setEstaLesionado(boolean estaLesionado) {
        this.estaLesionado = estaLesionado;
    }
}
