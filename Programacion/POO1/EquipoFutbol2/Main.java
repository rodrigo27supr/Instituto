package POO1.EquipoFutbol2;

public class Main {

    public static void main(String[] args) {



        Entrenador entrenador1 = new Entrenador("Carlos Ancelotti", 25);

        Equipo equipo1 = new Equipo("Real Madrid", entrenador1);

        Jugador jugador1 = new Jugador("Vinicius Jr", 7);
        Jugador jugador2 = new Jugador("Jude Bellingham", 5);

        equipo1.ficharJugador(jugador1);
        equipo1.ficharJugador(jugador2);

        System.out.println("Total de jugadores creados en la Liga: " + Jugador.totalJugadoresLiga);



    }
}
