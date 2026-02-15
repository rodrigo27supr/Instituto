package EjerciciosBasicosUT04.ApartadoD;

public class ProgramaRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(0, 0, 5, 5);
        Rectangulo rectangulo2 = new Rectangulo(7, 9, 2, 3);

        System.out.println("ESTADO INICIAL");
        rectangulo.imprimir();
        System.out.println("area: " + rectangulo.getArea());
        System.out.println("perímetro: " + rectangulo.getPerimetro());

        System.out.println("PRUEBA");
        rectangulo.setAll(1, 1, 10, 10);
        rectangulo.imprimir();
        System.out.println("nueva area: " + rectangulo.getArea());

        System.out.println("PRUEBA ERRORES");
        rectangulo.setX1Y1(20, 20);
        rectangulo.imprimir();
    }
}