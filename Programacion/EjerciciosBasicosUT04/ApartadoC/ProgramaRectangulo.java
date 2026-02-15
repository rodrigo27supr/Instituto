package EjerciciosBasicosUT04.ApartadoC;

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

        rectangulo.setX1(rectangulo.getX1() +2);
        rectangulo.setX2(rectangulo2.getX2() *3);
        rectangulo.setY1(rectangulo2.getY1()+1);
        rectangulo.setY2(rectangulo2.getY2() -3);

        rectangulo.mostrarCoordenadas();
        rectangulo.perimetro();
        rectangulo.area();
    }
}
