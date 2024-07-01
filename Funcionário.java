import java.util.ArrayList;

public class Funcionário {
    String nome;
    String cargo;
    double salario;
    String departamento;

    public Funcionário(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrarInfo(){
        System.out.println(
                "Nome:" + this.getNome() + "\n" +
                "Cargo: " + this.getCargo() + "\n" +
                "Salario: " + this.getSalario() + "\n" +
                "Departamento: " + this.getDepartamento() + "\n"
        );
    }

    public void promover(){
        ArrayList<String> Cargos = new ArrayList<>();
        Cargos.add("Estagiario");
        Cargos.add("Junior");
        Cargos.add("Pleno");
        Cargos.add("Senior");
        Cargos.add("Gerente");

        this.setCargo(Cargos.get(Cargos.indexOf(this.getCargo()) + 1));
    }
}
