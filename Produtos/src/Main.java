import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String nomeProd = "";
        ArrayList<Produto> Estoque = new ArrayList<>();
        for(Produto produto : Estoque){
            if(produto.getNome().equalsIgnoreCase(nomeProd) && produto.getQntdEstoque()>0){
                System.out.println("Produto comprado com sucesso");
                break;
            }
        }
    }
}