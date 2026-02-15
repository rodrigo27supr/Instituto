package EjerciciosBasicosUT04.ApartadoC;

    public class Articulo {
        private String nombre;
        private double precio;
        private double iva;
        private int cuantosQuedan;

        public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {

            setNombre(nombre);
            setPrecio(precio);
            setIva(iva);
            setCuantosQuedan(cuantosQuedan);

        }


        public void mostrarProducto () {
                double importeIva;
                importeIva = precio * iva;
                double pvp =  precio + importeIva;
                System.out.println("el producto " + nombre + " tiene el precio de " + precio + " euros, su iva es " + iva + " y quedan " + cuantosQuedan + " unidades, su pvp es " +  pvp);

        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public double getIva() {
            return iva;
        }

        public int getCuantosQuedan() {
            return cuantosQuedan;
        }

        public void setNombre(String nombre) {
            if (nombre == null){
                System.err.println("el campo del nombre no puede ser nulo");
            } else {
                this.nombre = nombre;
            }
        }

        public void setPrecio(double precio) {
            if (precio < 0 ) {
                System.err.println("el campo del precio esta mal");
            } else {
                this.precio = precio;
            }
        }

        public void setIva(double iva) {
            if (iva < 0) {
                System.err.println("el campo del iva esta mal");
            } else {
                this.iva = iva / 100.0;
            }
        }

        public void setCuantosQuedan(int cuantosQuedan) {
            if (cuantosQuedan < 0) {
                System.err.println("el stock esta mal");
            } else {
                this.cuantosQuedan = cuantosQuedan;
            }

        }
    }
