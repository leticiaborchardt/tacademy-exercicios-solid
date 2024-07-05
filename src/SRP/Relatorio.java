package SRP;

import java.util.ArrayList;

public class Relatorio {
    public String gerar(ArrayList<Produto> produtosVendidos) {
        StringBuilder relatorio = new StringBuilder("Relatório de Vendas\n----------------------");

        for (Produto produto : produtosVendidos) {
            relatorio
                    .append("\n\nProduto: ").append(produto.getNome())
                    .append("\nValor unitário: R$ ").append(produto.getPreco())
                    .append("\nValor total vendido: R$ ").append(produto.getQtdVendida() * produto.getPreco());
        }

        return relatorio.toString();
    }
}
