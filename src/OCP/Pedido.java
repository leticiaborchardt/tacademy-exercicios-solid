package OCP;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    public Pedido(Cliente cliente, ArrayList<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public double calcularValor() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }

        return this.obterValorComDesconto(total);
    }

    private double obterValorComDesconto(double valor) {
        Desconto desconto = cliente.getDesconto();

        if (desconto != null) {
            return desconto.aplicarDesconto(valor);
        }

        return valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
