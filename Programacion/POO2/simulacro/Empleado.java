package POO2.simulacro;

public abstract class Empleado {
    private int idEmpleado;
    private String nombreCompleto;
    private int precioHora;

    public Empleado(int id, String nombreCompleto, int precioHora) {
        this.idEmpleado = id;
        this.nombreCompleto = nombreCompleto;
        this.precioHora = precioHora;
    }

    public void mostrarInformacion () {
        System.out.println("El empleado " + nombreCompleto + " con ID " + idEmpleado + " cobra " + precioHora + " euros por hora");
    }

    public int calcularNominaMensual () {

        int horasTrabajadas = 40;
        int semanasTrabajadas = 4;

        return (horasTrabajadas * semanasTrabajadas) * precioHora;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    // --- EL ASALTO FINAL: MANDAR TAREAS ---
    public abstract boolean mandarTarea(String descripcion, int nivelDificultad);
}
