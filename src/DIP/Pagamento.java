package DIP;

public abstract class Pagamento {
    public static void processarPagamento(MetodoPagamento metodoPagamento, double valor) {
        try {
            metodoPagamento.pagar(valor);

            System.out.println("Pagamento efetuado com sucesso!");
        } catch (Exception e) {
            System.out.println("Não foi possível concluir o pagamento: " + e.getMessage());
        }
    }
}
