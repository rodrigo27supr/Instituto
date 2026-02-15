package EjerciciosBasicosUT04.ApartadoB;

public class ProgramaRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(0,0,5,5);
        Rectangulo rectangulo2 = new Rectangulo(7,9,2,3);

        rectangulo.mostrarCoordenadas();
        rectangulo2.mostrarCoordenadas();

        rectangulo.perimetro();
        rectangulo2.perimetro();

        rectangulo.area();
        rectangulo2.area();

        rectangulo.x1 += 1;
        rectangulo.x2 += 1;
        rectangulo.y1 += 1;
        rectangulo.y2 += 1;

        rectangulo.mostrarCoordenadas();
        rectangulo.perimetro();
        rectangulo.area();
    }
}
