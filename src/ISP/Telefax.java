package ISP;

public class Telefax implements Fax {
    @Override
    public void faxearDocumento(String documento) {
        System.out.println("Fax realizado com sucesso.");
    }
}
