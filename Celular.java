import java.util.ArrayList;

public class Celular {
    String marca;
    String modelo;
    double armazenamento;
    ArrayList<String> apps;

    public Celular(String marca, String modelo, double armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.apps = new ArrayList<>();

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void instApp(String nome, double tamanho){
        this.apps.add(nome);
        this.setArmazenamento(this.getArmazenamento() - tamanho);
    }
}
