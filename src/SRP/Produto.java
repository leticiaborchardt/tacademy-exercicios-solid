package SRP;

public class Produto {
    private String nome;
    private double preco;
    private int qtdVendida;

    public Produto(String nome, double preco, int qtdVendida) {
        this.nome = nome;
        this.preco = preco;
        this.qtdVendida = qtdVendida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }
}
