public class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void envelhecer(){
        this.setIdade(this.getIdade() + 1);
    }

    public void engordar(){
        this.setPeso(this.getPeso() + 1);
    }

    public void emagrecer(){
        this.setPeso(this.getPeso() - 1);
    }

    public void mostrarInfo(){
        System.out.println(
                "Nome:" + this.getNome() + "\n" +
                "Idade: " + this.getIdade() + "\n" +
                "Altura: " + this.getAltura() + "\n" +
                "Peso: " + this.getPeso() + "\n"
        );
    }

}
