public class FluxoCaixa implements InterfaceCadastro {

    // Atritbutos
    String vencimentoDebito;
    String vencimentoCredito;
    double credito;
    double debito;

    // Construtor
    public FluxoCaixa (String dataDebString, String dataCreString, double credito, double debito) {
        setVencimentoCredito(dataCreString);
        setVencimentoDebito(dataCreString);
        setCredito(credito);
        setDebito(debito);
        imprimir();
    }

    // Encapsulamento
    public void setVencimentoCredito(String vencimentoCredito) {
        this.vencimentoCredito = vencimentoCredito;
    }

    public String getVencimentoCredito() {
        return vencimentoCredito;
    }

    public void setVencimentoDebito(String vencimentoDebito) {
        this.vencimentoDebito = vencimentoDebito;
    }
    public String getVencimentoDebito() {
        return vencimentoDebito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getDebito() {
        return debito;
    }


    @Override
    public void entrar() {
        setVencimentoCredito(vencimentoCredito);
        setDebito(debito);
        setCredito(credito);
        setDebito(debito);
    }

    @Override
    public void imprimir() {

        System.out.printf("=== Fluxo de Caixa ===\n");
        System.out.printf("Vencimento | Credito | Debito | Saldo");
        System.out.printf("%s | %2.f | 0 | %2.f", getVencimentoCredito(), getCredito(), getCredito());
        System.out.printf("%s | 0 | %2.f | %2.f", getVencimentoDebito(), getDebito(), getDebito());
        System.out.printf("Totais | %2.f | %2.f | %2.f", getCredito(), getDebito(), (getCredito() - getDebito()));

    }
    
}
