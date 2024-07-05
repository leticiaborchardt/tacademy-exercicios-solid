package DIP;

public class CartaoCredito implements MetodoPagamento {
    private String nomeTitular;
    private int numeroCartao;
    private double saldo;

    public CartaoCredito(String nomeTitular, int numeroCartao, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
        this.saldo = saldo;
    }

    @Override
    public void pagar(double valor) throws Exception {
        if (valor > this.getSaldo()) {
            throw new Exception("Saldo insuficiente!");
        }

        this.setSaldo(this.getSaldo() - valor);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}