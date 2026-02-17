package EquipoFutbol;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Real Java");

        Jugador jugador1 = new Jugador("Modric", 10);
        Jugador jugador2 = new Jugador("Messi", 10);
        Jugador jugador3 = new Jugador("Vinicius", 7);

        equipo.ficharJugador(jugador1);
        equipo.ficharJugador(jugador2);
        equipo.ficharJugador(jugador3);

        jugador3.setEstaLesionado(true);

        System.out.println("--- CONVOCATORIA ---");
        equipo.mostrarConvocatoria();
    }
}