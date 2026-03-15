package POO2.simulacro;

public abstract  class Empleado {
    private int idEmpleado;
    private String nombreCompleto;
    private int precioHora;

    public Empleado(int idEmpleado, String nombreCompleto, int precioHora) {
        this.idEmpleado = idEmpleado;
        this.nombreCompleto = nombreCompleto;
        this.precioHora = precioHora;
    }

    public void mostrarInformacion () {

        System.out.println("ID del empleado = " + idEmpleado);
        System.out.println("Nombre completo = " + nombreCompleto);
        System.out.println("Precio/Hora = " + precioHora);

    }

    public int calcularNomina() {
        return 40 * 4 * precioHora;
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
}
