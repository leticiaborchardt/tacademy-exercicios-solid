package OCP;

public class DescontoEstudante implements Desconto {
    @Override
    public double aplicarDesconto(double valorTotal) {
        return valorTotal * 0.80;
    }
}
