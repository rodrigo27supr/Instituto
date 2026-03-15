package poo2.simulacro;

public abstract class EmpleadoOperativo extends Empleado implements Tareas {

    public EmpleadoOperativo(int idEmpleado, String nombreCompleto, int precioHora) {
        super(idEmpleado, nombreCompleto, precioHora);
    }

    public abstract void actualizarDatosInternos();

    public abstract boolean comprarExito(int dificultad);

    @Override
    public boolean ejecutorDeTareas(String descripcion, int dificultad) {
        System.out.println("El empleado " + getNombreCompleto());
        actualizarDatosInternos();
        boolean exito = comprarExito(dificultad);
        if (exito == false) {
            System.out.println("La tarea ha fracaso");
        } else {
            System.out.println("La tarea ha sido completada con exito");
        }
        return  exito;
    }
}
