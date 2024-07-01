public class Casa {
    String endereço;
    int nroQuartos;
    double area;
    double valor;

    public Casa(String endereço, int nroQuartos, double area, double valor) {
        this.endereço = endereço;
        this.nroQuartos = nroQuartos;
        this.area = area;
        this.valor = valor;
    }

    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public int getNroQuartos() {
        return nroQuartos;
    }
    public void setNroQuartos(int nroQuartos) {
        this.nroQuartos = nroQuartos;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void mostrarInfo(){
        System.out.println(
                "Endereço:" + this.getEndereço() + "\n" +
                        "Quantidade de quartos: " + this.getNroQuartos() + "\n" +
                        "Area: " + this.getArea() + "\n" +
                        "Valor: " + this.getValor() + "\n"
        );
    }

    public double calcImposto(){
        return (this.valor/this.nroQuartos)*this.area;
    }
}
