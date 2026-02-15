package EjerciciosBasicosUT04.ApartadoC;


public class ProgramaArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("jabon", 23, 10, 2 );

        articulo1.mostrarProducto();

        articulo1.setPrecio(5);
        articulo1.mostrarProducto();

        articulo1.setPrecio(2);
        articulo1.mostrarProducto();
    }
}
