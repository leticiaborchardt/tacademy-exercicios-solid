import DIP.CartaoCredito;
import DIP.Pagamento;
import DIP.PayPal;
import ISP.Impressora;
import LSP.Conta;
import LSP.ContaCorrente;
import LSP.ContaPoupanca;
import OCP.Cliente;
import OCP.Pedido;
import SRP.Produto;
import SRP.Relatorio;
import SRP.RelatorioImpressao;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    /**
     * SRP (Single Responsibility Principle <p>
     * Classe de Relatório: Crie uma classe Relatorio que gera relatórios de vendas e também
     * os imprime.
     * Refatore a classe para seguir o SRP, separando a lógica de geração e impressão do
     * relatório.
     * <p>
     * OCP (Open/Closed Principle)<p>
     * Sistema de Descontos: Implemente uma classe Pedido que aplica um desconto
     * baseado na categoria do cliente (por exemplo, estudante, idoso).
     * Use herança e polimorfismo para permitir que novos tipos de descontos sejam
     * adicionados sem modificar a classe Pedido.
     * <p>
     * LSP (Liskov Substitution Principle)<p>
     * Implemente uma classe base Conta e subclasses ContaCorrente e ContaPoupanca.
     * Assegure-se de que as subclasses podem substituir a classe base sem alterar o
     * comportamento esperado.
     * <p>
     * ISP (Interface Segregation Principle)<p>
     * Classe de Impressora: Dada uma interface Impressora com métodos
     * imprimirDocumento, escaneiarDocumento, faxearDocumento,
     * crie interfaces mais específicas para cada funcionalidade.
     * <p>
     * DIP (Dependency Inversion Principle)<p>
     * Sistema de Pagamento: Implemente um sistema de pagamento que depende de
     * diferentes métodos de pagamento (cartão de crédito, PayPal).
     * Use o princípio DIP para garantir que o sistema dependa de abstrações (interfaces) e
     * não de implementações concretas.
     */
    public static void main(String[] args) {
//        // SRP
//        Relatorio relatorio = new Relatorio();
//
//        ArrayList<Produto> produtosVendidos = new ArrayList<>();
//        produtosVendidos.add(new Produto("Celular", 1500, 5));
//        produtosVendidos.add(new Produto("TV", 2000, 2));
//        produtosVendidos.add(new Produto("Computador", 4700, 6));
//
//        RelatorioImpressao.imprimir(relatorio.gerar(produtosVendidos));

//        // OCP
//        Cliente clienteJovem = new Cliente("Maria", LocalDate.parse("2004-02-28"), true);
//        Cliente clienteIdoso = new Cliente("João", LocalDate.parse("1940-07-05"), false);
//
//        ArrayList<OCP.Produto> produtos = new ArrayList<>();
//        produtos.add(new OCP.Produto("Camisa", 75));
//        produtos.add(new OCP.Produto("Calça", 150));
//
//        Pedido pedido1 = new Pedido(clienteJovem, produtos);
//        Pedido pedido2 = new Pedido(clienteIdoso, produtos);
//
//        System.out.println("Pedido 1 - valor total: " + pedido1.calcularValor());
//        System.out.println("Pedido 2 - valor total: " + pedido2.calcularValor());

//        // LSP
//        try {
//            Conta cp = new ContaPoupanca("João", 1000);
//            cp.depositar(200.0);
//            cp.sacar(100.0);
//
//            Conta cc = new ContaCorrente("Maria", 1000);
//            cc.depositar(200.0);
//            cc.sacar(100.0);
//
//            cp.transferir(100, cc);
//            cc.transferir(250, cp);
//
//            System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
//            System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        // ISP
//        Impressora impressora = new Impressora();
//        impressora.escanearDocumento("documento 1");
//        impressora.imprimirDocumento("documento 1");

//        // DIP
//        CartaoCredito cartaoCredito = new CartaoCredito("Maria", 12345, 500);
//        Pagamento.processarPagamento(cartaoCredito, 500);
//
//        PayPal payPal = new PayPal("João", 500);
//        Pagamento.processarPagamento(payPal, 800);
    }
}