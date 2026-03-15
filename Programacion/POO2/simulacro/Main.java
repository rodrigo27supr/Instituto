package POO2.simulacro;

public class Main  {
    public static void main(String[] args) {

        Tecnico tecnico1 = new Tecnico(1, "Javier Hornero");
        Tecnico tecnico2 = new Tecnico(2, "Yassin Lya");
        Vendedor vendedor1 = new Vendedor(3, "Ivan Martinez");
        Vendedor vendedor2 = new Vendedor(4, "Pablo Guisasola");

        Coordinador coordinador1 = new Coordinador(5, "Rodrigo Cúellar", 5);

        Empresa empresa1 = new Empresa("NDD DATA", 10);

        empresa1.añadirEmpleado(tecnico1);
        empresa1.añadirEmpleado(tecnico2);
        empresa1.añadirEmpleado(vendedor1);
        empresa1.añadirEmpleado(vendedor2);

        coordinador1.añadirEmpleado(tecnico1);
        coordinador1.añadirEmpleado(tecnico2);
        coordinador1.añadirEmpleado(vendedor1);
        coordinador1.añadirEmpleado(vendedor2);

        empresa1.setCoordinadorActual(coordinador1);

        empresa1.recibirTrabajo("arreglar servidor", 500, 2);
        empresa1.recibirTrabajo("venta de licencias", 300, 5);

        empresa1.mostrarFacturacion();

        empresa1.mostrarGastosNominas();

        empresa1.mostrarTodosLosEmpleados();

    }
}
