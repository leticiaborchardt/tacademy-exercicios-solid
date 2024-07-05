package LSP;

public abstract class Conta {
    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depósito feito com sucesso!");
    };

    public void sacar(double valor) throws Exception {
        if (this.getSaldo() < valor) {
            throw new Exception("Não há saldo o suficiente para sacar.");
        }

        this.setSaldo(this.getSaldo() - valor);

        System.out.println("Saque realizado com sucesso!");
    };

    public void transferir(double valor, Conta contaDestino) {
        try {
            this.sacar(valor);
            contaDestino.depositar(valor);

            System.out.println("Transferência feita com sucesso!");
        } catch (Exception e) {
            System.out.println("Não foi possível fazer a transferência: " + e.getMessage());
        }
    };

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
