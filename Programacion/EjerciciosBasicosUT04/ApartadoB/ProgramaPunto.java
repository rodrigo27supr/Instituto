package EjerciciosBasicosUT04.ApartadoB;

public class ProgramaPunto {

    public static void main(String[] args) {
        Punto instancia1 = new Punto(5,0);
        Punto instancia2 = new Punto(10,10);
        Punto instancia3 = new Punto(-3,7);

        instancia1.mostrarPunto();
        instancia2.mostrarPunto();
        instancia3.mostrarPunto();

        instancia1.coordenadaX += 2;
        instancia1.coordenadaY *= 2;

        instancia2.coordenadaX -= 3;

        instancia1.mostrarPunto();
        instancia2.mostrarPunto();

    }
}
