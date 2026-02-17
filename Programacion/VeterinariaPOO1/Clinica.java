package VeterinariaPOO1;

public class Clinica {
   private String nombreClinica;
   private int contador = 0;
   private Mascota [] listaPacientes = new Mascota[15];

    public Clinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
        this.contador = contador;
        this.listaPacientes = new Mascota[15];
    }

    public void admitirMascota (Mascota mascota) {
        if (this.contador < listaPacientes.length) {
            listaPacientes[this.contador] = mascota;
            this.contador ++;
            System.out.println("Mascota admitida");
        } else {
            System.out.println("Mascota no admitida");
        }

    }

    public int contarGatos () {
        int totalGatos = 0;
        for (int cont = 0; cont < this.contador; cont++) {
            if (listaPacientes[cont].getEspecie().equalsIgnoreCase("Gato")) {
                totalGatos = totalGatos + 1;
            }
        }
        return totalGatos;
    }

    public void mostrarVacunados(){

        for (int cont = 0; cont < this.contador; cont++) {
            if (listaPacientes[cont].isEstaVacunado() == false){
                System.out.println("La mascota " + listaPacientes[cont].getNombre() + " y su dueño es " + listaPacientes[cont].getPropietario().getNombre() + " y su telefono " + listaPacientes[cont].getPropietario().getTelefono());

            }

        }
    }
}
