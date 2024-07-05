package OCP;

public class DescontoIdoso implements Desconto {
    @Override
    public double aplicarDesconto(double valorTotal) {
        return valorTotal * 0.75;
    }
}
