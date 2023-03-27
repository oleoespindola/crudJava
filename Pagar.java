public class Pagar extends Financeiro {

    private Fornecedor fornecedor;
    private String boleto;

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

    @Override
    public void entrar() {
        super.entrar();

        System.out.printf("\nInforme os dados do Forcenedor");
        setFornecedor(fornecedor);

        System.out.print("Informe o numero do boleto: ");
        setBoleto(leia.next());
    }
    
}
