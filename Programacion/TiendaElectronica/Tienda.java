package TiendaElectronica;

public class Tienda {

    public static final int MAX_PRODUCTOS = 5;
    private Electrodomestico[] inventario;


    public Tienda() {
        this.inventario = new Electrodomestico[MAX_PRODUCTOS];
    }
    public void agregarProducto(Electrodomestico e) {
        for (int contador = 0; contador < inventario.length; contador++) {

            if (inventario[contador] == null) {
                inventario[contador] = e;
                return;
            }

        }
        System.out.println("ESTA LLENO");

    }

    public void mostrarInventario () {
            for (int contador = 0; contador < inventario.length; contador++) {

                if (inventario[contador] != null) {
                    System.out.println(inventario[contador]);

                }
            }
    }

    public void calcularValoTotalAlmacen () {
        double total = 0;

        for (int contador = 0; contador < inventario.length; contador++) {

            if (inventario[contador] != null) {
                total = total + inventario[contador].getPrecioFinal();
            }
        }
        System.out.println("El valor total del almacén es: " + total);
    }

}
