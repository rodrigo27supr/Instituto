package POO2.simulacro;

public class Vendedor extends EmpleadoOperativo {

    private static final int precioHora = 20;
    private int ventasRealizdas = 0;

    public Vendedor(int id, String nombreCompleto) {
        super(id, nombreCompleto, precioHora);
    }

    @Override
    public void actualizarDatosInternos() {
        ventasRealizdas += 1;
    }

    @Override
    public boolean tareaCompletadaConExito(int nivelDificultad) {
        if (nivelDificultad <= 3) {
            return true;
        }else {
            return false;
        }
    }
}
