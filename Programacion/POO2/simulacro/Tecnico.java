package POO2.simulacro;

public class Tecnico  extends EmpleadoOperativo{

    private static final int precioHora = 30;
    private int contadorTrabajosCompletados = 0;


    public Tecnico(int id, String nombreCompleto) {
        super(id, nombreCompleto, precioHora);
    }

    @Override
    public void actualizarDatosInternos() {
        contadorTrabajosCompletados = contadorTrabajosCompletados + 1;
    }

    @Override
    public boolean tareaCompletadaConExito(int nivelDificultad) {
        if (nivelDificultad <=  3){
            return true;
        } else {
            return false;
        }
    }
}
