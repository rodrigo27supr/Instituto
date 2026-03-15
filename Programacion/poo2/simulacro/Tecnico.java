package poo2.simulacro;

public class Tecnico extends EmpleadoOperativo{

    int trabajosCompletados;

    public Tecnico(int idEmpleado, String nombreCompleto) {
        super(idEmpleado, nombreCompleto, 30);
    }

    @Override
    public void actualizarDatosInternos() {
        trabajosCompletados ++;
    }

    @Override
    public boolean comprarExito(int dificultad) {
        if (dificultad <= 3) {
            return true;
        } else {
            return false;
        }
    }
}
