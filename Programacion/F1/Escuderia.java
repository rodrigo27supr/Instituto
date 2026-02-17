package F1;

public class Escuderia {
   private String nombre;
   private Monoplaza [] garaje;
   private int contadorCoches = 1;

    public Escuderia(String nombre) {
        this.nombre = nombre;
        this.garaje = new Monoplaza[4];
        this.contadorCoches = 0;
    }

    public void ficharCoche (Monoplaza mono) {
        if (contadorCoches < garaje.length){
            garaje[contadorCoches] = mono;
            contadorCoches ++;
            System.out.println("Coche añadido");

        } else {
            System.out.println("Esta lleno");
        }
    }

    public double calcularCosteConIva(){
        double totalPrecio = 0;
        for (int cont = 0; cont < garaje.length; cont++) {

            totalPrecio = totalPrecio + garaje[cont].getPrecioFabricacion();

        }
        return totalPrecio + (totalPrecio * Monoplaza.iva);
    }

    public void mostrarCochesPotentes (int caballosUsuarios){
        int caballosCoche = 0;


        for (int cont = 0; cont < contadorCoches; cont++) {

            caballosCoche = garaje[cont].getMotor().getCaballos();

            if (caballosCoche > caballosUsuarios) {
                System.out.println("El conductor : " + garaje[cont].getNombrePiloto() +  " su coche tiene " + garaje[cont].getMotor().getCaballos());

            }
        }

    }

    public boolean hayCocheListo(){
        for (int cont = 0; cont < garaje.length; cont++) {

            boolean cocheListo;
            cocheListo = garaje[cont].isEstaListo();


            if (cocheListo = true) {
                return true;
            } else {
                return false;
            }
        }
        return hayCocheListo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monoplaza[] getGaraje() {
        return garaje;
    }

    public void setGaraje(Monoplaza[] garaje) {
        this.garaje = garaje;
    }

    public int getContadorCoches() {
        return contadorCoches;
    }

    public void setContadorCoches(int contadorCoches) {
        this.contadorCoches = contadorCoches;
    }
}
