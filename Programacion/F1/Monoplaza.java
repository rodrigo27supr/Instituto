package F1;

public class Monoplaza {
  private String nombrePiloto;
  private Motor motor;
  private double precioFabricacion;
  private boolean estaListo = false;
    public static final double iva = 0.21;
    private static int totalMonoplazas = 0;

    public Monoplaza(String nombrePiloto, Motor motor, double precioFabricacion, boolean estaListo) {
        this.nombrePiloto = nombrePiloto;
        this.motor = motor;
        this.precioFabricacion = precioFabricacion;
        this.estaListo = estaListo;
        totalMonoplazas ++;
    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public double getPrecioFabricacion() {
        return precioFabricacion;
    }

    public void setPrecioFabricacion(double precioFabricacion) {
        this.precioFabricacion = precioFabricacion;
    }

    public boolean isEstaListo() {
        return estaListo;
    }

    public void setEstaListo(boolean estaListo) {
        this.estaListo = estaListo;
    }

    public static int getTotalMonoplazas() {
        return totalMonoplazas;
    }

    public static void setTotalMonoplazas(int totalMonoplazas) {
        Monoplaza.totalMonoplazas = totalMonoplazas;
    }
}
