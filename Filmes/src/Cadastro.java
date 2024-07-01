import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        ArrayList<Filme> Filmes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do filme:");
        String nome = scanner.nextLine();
        System.out.println("Diretor do filme:");
        String diretor = scanner.nextLine();
        System.out.println("Ano de lançamento:");
        int ano = scanner.nextInt();
        System.out.println("Duração do filme:");
        double duracao = scanner.nextDouble();
        Filmes.add(new Filme(nome, diretor, ano, duracao));

    }
}