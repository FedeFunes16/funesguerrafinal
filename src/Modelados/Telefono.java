package Modelados;

public class Telefono extends Producto{
    private String sistemaOperativo;
    private String capacidadAlmacenamiento;
    private String tamañoPantalla;

    public Telefono(String nombre, String marca, double precio, int stock, String sistemaOperativo, String capacidadAlmacenamiento, String tamañoPantalla) {
        super(nombre, marca, precio, stock);
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", capacidadAlmacenamiento='" + capacidadAlmacenamiento + '\'' +
                ", tamañoPantalla='" + tamañoPantalla + '\'' +
                '}';
    }
}
