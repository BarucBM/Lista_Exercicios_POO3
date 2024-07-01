public class Produto {
    String nome;
    float preco;
    int qntdEstoque;

    public Produto(String nome, float preco, int qntdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qntdEstoque = qntdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQntdEstoque() {
        return qntdEstoque;
    }

    public void setQntdEstoque(int qntdEstoque) {
        this.qntdEstoque = qntdEstoque;
    }
}
