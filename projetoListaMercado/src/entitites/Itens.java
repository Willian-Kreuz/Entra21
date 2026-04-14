package entitites;

public class Itens {

    private String nome;
    private int quantidade;
    private double preco;

    public Itens(){
    }
    public Itens(int quantidade, String nome, double preco) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double total(){
        return preco * quantidade;
    }
}
