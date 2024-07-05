package ISP;

public class Impressora implements Impressao, Scanner {
    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Documento impresso: " + documento);
    }

    @Override
    public void escanearDocumento(String documento) {
        System.out.println("Escaneando documento... Resultado: " + documento);
    }
}
