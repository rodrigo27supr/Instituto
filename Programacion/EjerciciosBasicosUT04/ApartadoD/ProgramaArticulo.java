package EjerciciosBasicosUT04.ApartadoD;

public class ProgramaArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("jabon", 23, 10, 2);

        articulo1.imprimir();

        System.out.println("pvp con descuento del 20%: " + articulo1.getPVPDescuento(20));

        if (articulo1.vender(1)) {
            System.out.println("venta realizada");
        } else {
            System.out.println("no se pudo vender");
        }

        articulo1.imprimir();

        if (articulo1.almacenar(10)) {
            System.out.println("stock aumentado");
        }

        articulo1.imprimir();
    }
}