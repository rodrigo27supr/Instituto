package EjerciciosBasicosUT04.ApartadoA;

public class Articulo {
    String nombre;
    double precio;
    double iva;
    int cuantosQuedan;

    public Articulo(String nombre, double precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = 0.21;
        this.cuantosQuedan = cuantosQuedan;
    }


    public void mostrarProducto () {

        iva = precio * 0.21;
        double pvp =  (precio + iva);
        System.out.println("el producto " + nombre + " tiene el precio de " + precio + " euros, su iva es " + iva + " y quedan " + cuantosQuedan + " unidades, su pvp es " +  pvp);
    }
}
