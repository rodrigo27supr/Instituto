package POO1.EquipoFutbol2;

public class Equipo {
   private String nombreClub;
   private Entrenador mister;
   private Jugador [] plantilla = new Jugador[5];
   private int contJugadores = 0;

    public Equipo(String nombreClub, Entrenador mister) {
        this.nombreClub = nombreClub;
        this.mister = mister;
        this.plantilla = new Jugador[5];
        this.contJugadores = 0;
    }

    public void ficharJugador (Jugador jugadorNuevo) {
            if (contJugadores < plantilla.length) {
                plantilla[contJugadores] = jugadorNuevo;
                contJugadores ++;
                System.out.println("Jugador añadido");
            } else {
                System.out.println("No puedes añadir mas jugadores");
            }

    }

    public void JugadorPorDorsal (int numero) {

        for (int cont = 0; cont < contJugadores; cont++) {
            if ( numero == plantilla[cont].getDorsal()){
                System.out.println(plantilla[cont].getNombre() + " y su entrenador es " + getMister().getNombre());
            }
        }
    }

    public double promedioExp(){

        double expEntrenador = 0;
        expEntrenador = mister.getAnioExperiencia() / contJugadores;
        System.out.println("Promedio exp " + expEntrenador);
        return expEntrenador;
    }

    public boolean esEquipoVeterano() {
        if (mister == null) {
            return false;
        } else {
            if (mister.getAnioExperiencia() > 20) {
                return true;
            }
            return false;
        }
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public Entrenador getMister() {
        return mister;
    }

    public void setMister(Entrenador mister) {
        this.mister = mister;
    }

    public Jugador[] getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(Jugador[] plantilla) {
        this.plantilla = plantilla;
    }

    public int getContJugadores() {
        return contJugadores;
    }

    public void setContJugadores(int contJugadores) {
        this.contJugadores = contJugadores;
    }
}
