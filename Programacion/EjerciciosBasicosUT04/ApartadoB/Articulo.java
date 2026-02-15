package EjerciciosBasicosUT04.ApartadoB;

    public class Articulo {
        String nombre;
        double precio;
        double iva;
        int cuantosQuedan;

        public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {

            if (nombre != null && precio >= 0 && cuantosQuedan >= 0) {
                this.nombre = nombre;
                this.precio = precio;
                this.iva = iva / 100.0 ;
                this.cuantosQuedan = cuantosQuedan;

            } else {
                System.err.println("ALGUNO DE LOS CAMPOS ESTA MAL");
            }
        }


        public void mostrarProducto () {
            if (nombre != null && precio >= 0 && cuantosQuedan >= 0) {

                double importeIva;
                importeIva = precio * iva;
                double pvp =  precio + importeIva;
                System.out.println("el producto " + nombre + " tiene el precio de " + precio + " euros, su iva es " + iva + " y quedan " + cuantosQuedan + " unidades, su pvp es " +  pvp);
            } else {
                System.err.println("ALGUNO DE LOS CAMPOS ESTA MAL");
            }
        }
}
