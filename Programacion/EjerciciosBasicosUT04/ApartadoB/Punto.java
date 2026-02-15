package EjerciciosBasicosUT04.ApartadoB;

public class Punto {

    int coordenadaX;
    int coordenadaY;

    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public void mostrarPunto () {
        System.out.println(coordenadaX + " , " + coordenadaY);
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}


