package TiendaElectronica;

public class ProgramaTienda {
    public static void main(String[] args) {
        Tienda miTienda = new Tienda();

        Electrodomestico el1 = new Electrodomestico("Lavadora", "Bosch", 450.0);
        Electrodomestico el2 = new Electrodomestico("Frigorífico", "Samsung", 700.0);
        Electrodomestico el3 = new Electrodomestico("Microondas", "LG", 120.0);

        miTienda.agregarProducto(el1);
        miTienda.agregarProducto(el2);
        miTienda.agregarProducto(el3);

        miTienda.mostrarInventario();
        miTienda.calcularValoTotalAlmacen();
    }
}