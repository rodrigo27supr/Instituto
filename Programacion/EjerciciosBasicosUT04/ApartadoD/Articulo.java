package EjerciciosBasicosUT04.ApartadoD;

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

    public void imprimir() {
        System.out.println("articulo: " + nombre + " precio: " + precio + " iva: " + iva + " stock: " + cuantosQuedan + " pvp: " + getPVP());
    }

    public double getPVP() {
        return precio + (precio * iva);
    }

    public double getPVPDescuento(double descuento) {
        return getPVP() * (1 - (descuento / 100.0));
    }

    public boolean vender(int x) {
        if (x > 0 && x <= cuantosQuedan) {
            cuantosQuedan = cuantosQuedan - x;
            return true;
        } else {
            return false;
        }
    }

    public boolean almacenar(int x) {
        if (x > 0) {
            cuantosQuedan = cuantosQuedan + x;
            return true;
        } else {
            return false;
        }
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
        if (nombre == null) {
            System.err.println("el campo del nombre no puede ser nulo");
        } else {
            this.nombre = nombre;
        }
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
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