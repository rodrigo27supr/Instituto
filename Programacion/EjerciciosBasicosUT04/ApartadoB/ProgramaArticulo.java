package EjerciciosBasicosUT04.ApartadoB;


public class ProgramaArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("jabon", 23, 10, 2 );

        articulo1.mostrarProducto();

        articulo1.precio = 5;
        articulo1.mostrarProducto();

        articulo1.precio = -2;
        articulo1.mostrarProducto();
    }
}
