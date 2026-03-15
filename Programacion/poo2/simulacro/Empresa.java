package poo2.simulacro;

public class Empresa {
    private String nombre;
    private int facturacionAcumulada = 0;
    Coordinador coordinadorActual;
    Empleado [] empleadosEnLaEmpresa;
    private int contadorTrabajadores;

    public Empresa(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.facturacionAcumulada = 0; // Empezamos de cero
        this.empleadosEnLaEmpresa = new Empleado[capacidadMaxima]; // Preparamos las sillas
        this.contadorTrabajadores = 0; // Necesitarás un contador igual que en el coordinador
    }


    public void setCoordinadorActual(Coordinador coordinadorActual) {
        this.coordinadorActual = coordinadorActual;
    }

    public void añadirEmpleado(Empleado empleadoNuevo) {
        if (contadorTrabajadores >= empleadosEnLaEmpresa.length) {
            System.out.println("No se pueden añadir más empleados: Oficina llena.");
            return;
        }

        for (int contador = 0; contador < contadorTrabajadores; contador++) {
            if (empleadosEnLaEmpresa[contador].getIdEmpleado() == empleadoNuevo.getIdEmpleado()) {
                System.out.println("El empleado con ID " + empleadoNuevo.getIdEmpleado() + " ya existe.");
                return;
            }
        }

        empleadosEnLaEmpresa[contadorTrabajadores] = empleadoNuevo;
        contadorTrabajadores++;
        System.out.println("Empleado " + empleadoNuevo.getNombreCompleto() + " añadido con éxito.");
    }

    public void recibirTrabajo (String descripcion, int coste, int dificultad){
        boolean exito = coordinadorActual.reparticionTareas(descripcion,dificultad);
        if (exito == true) {
            facturacionAcumulada = facturacionAcumulada + coste;
        }
    }

    public void mostrarTodosLosEmpleados(){
        for (int contador = 0; contador < contadorTrabajadores; contador++) {
            empleadosEnLaEmpresa[contador].mostrarInformacion();
        }
    }

    public void mostrarFacturacion (){
        System.out.println("facturacion Acumulada = " + facturacionAcumulada);;
    }

    public void mostrarGastosNominas(){

        int gastosNominasTotal = 0;

        for (int contador = 0; contador < contadorTrabajadores; contador++) {
            gastosNominasTotal += empleadosEnLaEmpresa[contador].calcularNomina();
        }
        System.out.println("gastos Nominas Total = " + gastosNominasTotal);
    }
}
