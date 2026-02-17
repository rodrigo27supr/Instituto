package F1;

public class Main {
    public static void main(String[] args) {

        Escuderia Rodrigo = new Escuderia("Rodrigo");

        Motor f1 = new Motor("Gasolina", 300);
        Motor f2 = new Motor("Diesel", 280);

        Monoplaza coche1 = new Monoplaza("Javier", f1, 478, true);
        Monoplaza coche2 = new Monoplaza("Yassin", f2, 478, true);
        Monoplaza coche3 = new Monoplaza("Pablo", f2, 600, true);
        Monoplaza coche4 = new Monoplaza("Ivan", f1, 234, true);

        Rodrigo.ficharCoche(coche1);
        Rodrigo.ficharCoche(coche2);
        Rodrigo.ficharCoche(coche3);
        Rodrigo.ficharCoche(coche4);


        System.out.println(Rodrigo.calcularCosteConIva());

        Rodrigo.mostrarCochesPotentes(290);

        System.out.println(Rodrigo.hayCocheListo());

    }
}
