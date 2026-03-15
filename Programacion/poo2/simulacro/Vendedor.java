package poo2.simulacro;

public class Vendedor extends EmpleadoOperativo{
    private int ventasRealizadas;

    public Vendedor(int idEmpleado, String nombreCompleto) {
        super(idEmpleado, nombreCompleto, 20);
    }

    @Override
    public void actualizarDatosInternos() {
        ventasRealizadas ++;
    }

    @Override
    public boolean comprarExito(int dificultad) {
        if (dificultad <=3) {
            return true;
        } else {
            return false;
        }
    }
}
