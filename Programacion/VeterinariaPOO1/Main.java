package VeterinariaPOO1;

public class Main {
    public static void main(String[] args) {

        Clinica clinica = new Clinica("Veterinaria Central");

        Duenyo d1 = new Duenyo("Carlos", "600000001");
        Duenyo d2 = new Duenyo("Ana", "600000002");

        Mascota m1 = new Mascota("Boby", "Perro", 4, true, d1);
        Mascota m2 = new Mascota("Luna", "Gato", 2, false, d2);
        Mascota m3 = new Mascota("Misi", "Gato", 5, false, d1);

        clinica.admitirMascota(m1);
        clinica.admitirMascota(m2);
        clinica.admitirMascota(m3);

        System.out.println("Gatos en total: " + clinica.contarGatos());
        clinica.mostrarVacunados();
    }
}