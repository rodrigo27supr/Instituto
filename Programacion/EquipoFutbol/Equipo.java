package EquipoFutbol;

public class Equipo {

    public static int capacidadMax = 25;
    private String nombreClub;
    private Jugador [] plantilla = new Jugador[capacidadMax];

    public Equipo(String nombreClub) {
        this.nombreClub = nombreClub;
        this.plantilla = new Jugador[capacidadMax];
    }

    public boolean existeDorsal (int numero){
        for (int contador = 0; contador < plantilla.length; contador++) {
            if (plantilla[contador] != null) { // 1. ¿Hay alguien en este asiento?
                if (plantilla[contador].getDorsal() == numero) { // 2. ¿Su dorsal es el que busco?
                    return true;
                }
            }
        }
        return false;
    }

    public void ficharJugador(Jugador nuevo) {
        if (existeDorsal(nuevo.getDorsal())) {
            System.out.println("Error: Dorsal repetido (" + nuevo.getDorsal() + ")");
        } else {
            for (int contador = 0; contador < plantilla.length; contador++) {
                if (plantilla[contador] == null) {
                    plantilla[contador] = nuevo;
                    return;
                }
            }
            System.out.println("Plantilla llena");
        }
    }

    public void mostrarConvocatoria() {
        for (int contador = 0; contador < plantilla.length; contador++) {
            if (plantilla[contador] != null && !plantilla[contador].isEstaLesionado()) {
                System.out.println(plantilla[contador].toString());
            }
        }
    }

    public static int getCapacidadMax() {
        return capacidadMax;
    }

    public static void setCapacidadMax(int capacidadMax) {
        Equipo.capacidadMax = capacidadMax;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public Jugador[] getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(Jugador[] plantilla) {
        this.plantilla = plantilla;
    }
}
