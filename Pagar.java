public class Pagar extends Financeiro {

    // Atributos
    private Fornecedor fornecedor;
    private String boleto;

    // Constructor
    public Pagar() {
        entrar();
    }

    // Encapsulamento
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public String getBoleto() {
        return boleto;
    }

    // Sobrecarga de métodos
    @Override
    public void entrar() {
        super.entrar();

        System.out.printf("\nInforme os dados do Forcenedor: ");
        Fornecedor capturarForcenedor = new Fornecedor();
        setFornecedor(capturarForcenedor);
        System.out.printf("\nInforme o numero do boleto: ");
        setBoleto(leia.next());
    }
    
}
