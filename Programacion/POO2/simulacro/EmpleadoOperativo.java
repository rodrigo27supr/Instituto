package POO2.simulacro;

public abstract class EmpleadoOperativo extends Empleado implements Asignable {


    public EmpleadoOperativo(int id, String nombreCompleto, int precioHora) {
        super(id, nombreCompleto, precioHora);
    }

    public abstract void actualizarDatosInternos ();

    public abstract boolean tareaCompletadaConExito(int nivelDificultad);

    @Override
    public boolean procesoTarea(String descripcion, int nivelDificultad) {
        System.out.println("La tarea ha comenzado");
        actualizarDatosInternos();
        boolean exito = tareaCompletadaConExito( nivelDificultad);
        if (exito == false) {
            System.out.println("La tarea ha fracasado");
        } else {
            System.out.println("La tarea ha sido un exito");
        }
        return exito;
    }
}
