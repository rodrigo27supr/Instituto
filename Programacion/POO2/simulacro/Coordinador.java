package POO2.simulacro;

public class Coordinador extends Empleado implements RepartirTareas{

    EmpleadoOperativo [] listaEmpleados;
    int contadorEmpleados;

    public Coordinador(int idEmpleado, String nombreCompleto, int capacidadMaxima) {
        super(idEmpleado, nombreCompleto, 40);
        listaEmpleados = new EmpleadoOperativo[capacidadMaxima];
    }

    public void añadirEmpleado(Empleado empleadoNuevo) {
        if (contadorEmpleados >= listaEmpleados.length) {
            System.out.println("No se pueden añadir más empleados: Oficina llena.");
            return;
        }
        for (int contador = 0; contador < contadorEmpleados; contador++) {
            if (listaEmpleados[contador].getIdEmpleado() == empleadoNuevo.getIdEmpleado()) {
                System.out.println("El empleado con ID " + empleadoNuevo.getIdEmpleado() + " ya existe.");
                return;
            }
        }
        this.listaEmpleados[contadorEmpleados] = (EmpleadoOperativo) empleadoNuevo;
        this.contadorEmpleados++;
        System.out.println("Empleado " + empleadoNuevo.getNombreCompleto() + " añadido con éxito.");
    }


    @Override
    public boolean reparticionTareas(String descripcion, int dificultad) {

        for (int contador = 0; contador < contadorEmpleados; contador++) {

            EmpleadoOperativo empleadoActual = listaEmpleados[contador];

            if (descripcion.contains("venta") && empleadoActual instanceof Vendedor){
                return empleadoActual.ejecutorDeTareas(descripcion,dificultad);
            }
            if (descripcion.contains("arreglar") && empleadoActual instanceof Tecnico) {
                return empleadoActual.ejecutorDeTareas(descripcion,dificultad);
            }
        }
        System.out.println("No hay ningun trabajador disponible para esta tarea");
        return false;
    }
}
