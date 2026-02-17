package F1;

public class Motor {
   private String modelo;
   private int caballos;

    public Motor(String modelo, int caballos) {
        this.modelo = modelo;
        this.caballos = caballos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
}
