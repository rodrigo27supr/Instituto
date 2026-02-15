package EjerciciosBasicosUT04.ApartadoD;

public class Punto {

    private int coordenadaX;
    private int coordenadaY;

    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public void imprime() {
        System.out.println("( " + coordenadaX + " , " + coordenadaY + " )");
    }

    public void setXY (int coordenadaX, int coordenadaY) {
        this.setCoordenadaX(coordenadaX);
        this.setCoordenadaY(coordenadaY);

    }

    public void desplaza (int dx,int dy) {
        setCoordenadaX(getCoordenadaX() + dx);
        setCoordenadaY(getCoordenadaY() + dy);
    }

    public int distancia(Punto p) {
        int difX = p.getCoordenadaX() - this.coordenadaX;
        int difY = p.getCoordenadaY() - this.coordenadaY;
        double dist = Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
        return (int) dist;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}


