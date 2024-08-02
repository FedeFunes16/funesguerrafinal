package Modelados;

public class Computadora extends Producto{
    private String procesador;
    private String memoriaRam;
    private String tamañoDisco;

    public Computadora(String nombre, String marca, double precio, int stock, String procesador, String memoriaRam, String tamañoDisco) {
        super(nombre, marca, precio, stock);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.tamañoDisco = tamañoDisco;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getTamañoDisco() {
        return tamañoDisco;
    }

    public void setTamañoDisco(String tamañoDisco) {
        this.tamañoDisco = tamañoDisco;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
                ", tamañoDisco='" + tamañoDisco + '\'' +
                '}';
    }
}
