package TiendaElectronica;

public class Electrodomestico {
    public static final double IVA = 0.21;
    private String nombre;
    private String marca;
    private double precioBase;

    public Electrodomestico(String nombre, String marca, double precioBase) {
        this.nombre = nombre;
        this.marca = marca;
        this.precioBase = precioBase;
    }

    public double getPrecioFinal() {
        return precioBase + (precioBase * IVA);
    }

    @Override
    public String toString() {
        return getNombre() + " - Base: " + precioBase + " - PVP: " + getPrecioFinal();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
