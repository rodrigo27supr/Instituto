package POO2.simulacro;

public class Coordinador extends Empleado{
    private static final int precioHora = 40;
    EmpleadoOperativo [] listaEmpleados;
    private int contadorEmpleados = 0;

    public Coordinador(int id, String nombreCompleto, int capacidadMaxima) {
        super(id, nombreCompleto, precioHora);
        listaEmpleados = new EmpleadoOperativo [capacidadMaxima];
    }

    public void guardarEmpleado (EmpleadoOperativo empleadoNuevo) {

        if (contadorEmpleados >= listaEmpleados.length) {
            System.out.println("El equipo esta completo, no podemos añadir mas empleados");
            return;
        }

        for (int contador = 0; contador < contadorEmpleados; contador++) {
            if (listaEmpleados[contador].getIdEmpleado() == empleadoNuevo.getIdEmpleado()){
                System.out.println("El empleado esta repetido, no se puede introducir en la lista");
                return;
        }
        }

        listaEmpleados[contadorEmpleados] = empleadoNuevo;
        contadorEmpleados ++;

    }

    @Override
    public boolean mandarTarea(String descripcion, int nivelDificultad) {

        for (int contador = 0; contador < contadorEmpleados; contador++) {
            EmpleadoOperativo empleadoActual = listaEmpleados[contador];

            if (descripcion.contains("venta") && empleadoActual instanceof Vendedor) {
                return empleadoActual.procesoTarea(descripcion, nivelDificultad);
            }

            if (descripcion.contains("arreglar") && empleadoActual instanceof Tecnico) {
                return empleadoActual.procesoTarea(descripcion, nivelDificultad);
            }
        }

        System.out.println("No hay ningún empleado adecuado para esta tarea.");
        return false;
    }
}
