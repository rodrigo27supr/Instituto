package EjerciciosBasicosUT04.ApartadoA;

public class Rectangulo {

    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void mostrarCoordenadas () {
        System.out.println(x1 + "," + y1 + "," + x2 + "," + y2);
    }

    public int perimetro (){
        int lado1;
        int lado2;

        lado1  = Math.abs(x1 - x2);
        lado2  = Math.abs(y1 - y2) ;

        int perimetro = 2 * (lado1 + lado2);

        System.out.println("El perimetro es: " + perimetro);
        return perimetro;

    }

    public int area () {
        int lado1;
        int lado2;

        lado1  = Math.abs(x1 - x2);
        lado2  = Math.abs(y1 - y2) ;


        int area = lado1 * lado2;
        System.out.println("El area es: " + area);

        return area;

    }
}

