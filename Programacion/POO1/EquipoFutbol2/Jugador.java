package POO1.EquipoFutbol2;

public class Jugador {

   private String nombre;
   private int dorsal;
    public static int totalJugadoresLiga = 0;


    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        totalJugadoresLiga ++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public static int getTotalJugadoresLiga() {
        return totalJugadoresLiga;
    }
}
