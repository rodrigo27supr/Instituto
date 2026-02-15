package EjerciciosBasicosUT04.ApartadoC;

public class Rectangulo {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al instanciar Rectangulo: Coordenadas no válidas.");
        }
    }

    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }

    public void setX1(int x1) {
        if (x1 < this.x2) {
            this.x1 = x1;
        } else {
            System.err.println("ERROR: x1 debe ser menor que x2 (" + x2 + ")");
        }
    }

    public void setX2(int x2) {
        if (x2 > this.x1) {
            this.x2 = x2;
        } else {
            System.err.println("ERROR: x2 debe ser mayor que x1 (" + x1 + ")");
        }
    }

    public void setY1(int y1) {
        if (y1 < this.y2) {
            this.y1 = y1;
        } else {
            System.err.println("ERROR: y1 debe ser menor que y2 (" + y2 + ")");
        }
    }

    public void setY2(int y2) {
        if (y2 > this.y1) {
            this.y2 = y2;
        } else {
            System.err.println("ERROR: y2 debe ser mayor que y1 (" + y1 + ")");
        }
    }

    public void mostrarCoordenadas() {
        System.out.println("(" + x1 + "," + y1 + ") , (" + x2 + "," + y2 + ")");
    }

    public int perimetro() {
        int lado1 = Math.abs(x1 - x2);
        int lado2 = Math.abs(y1 - y2);
        return 2 * (lado1 + lado2);
    }

    public int area() {
        return Math.abs(x1 - x2) * Math.abs(y1 - y2);
    }
}