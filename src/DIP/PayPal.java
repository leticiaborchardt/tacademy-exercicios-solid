package DIP;

public class PayPal implements MetodoPagamento {
    private String nomeTitular;
    private double saldo;

    public PayPal(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
