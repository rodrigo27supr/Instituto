package EjerciciosBasicosUT04.ApartadoD;

public class ProgramaPunto {

    public static void main(String[] args) {
        Punto instancia1 = new Punto(5,0);
        Punto instancia2 = new Punto(10,10);
        Punto instancia3 = new Punto(-3,7);

        instancia1.imprime();
        instancia2.imprime();
        instancia3.imprime();

        instancia1.setCoordenadaX(instancia1.getCoordenadaX() + 2) ;
        instancia1.setCoordenadaY(instancia1.getCoordenadaY() +3);

        instancia2.setCoordenadaX(instancia2.getCoordenadaX() * 2);


        instancia1.imprime();
        instancia2.imprime();

        instancia1.setXY(2,3);
        instancia1.imprime();

        instancia1.desplaza(2,2);
        instancia1.imprime();

        instancia1.distancia(new Punto(2,2));
        instancia1.imprime();


    }
}
