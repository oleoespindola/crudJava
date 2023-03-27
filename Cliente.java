public class Cliente extends PessoaJuridica{

    private double limite_credito;
    private Endereco endereco_cobranca;

    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    public double getLimite_credito() {
        return limite_credito;
    }

    public void setEndereco_cobranca(Endereco endereco_cobranca) {
        this.endereco_cobranca = endereco_cobranca;
    }

    public Endereco getEndereco_cobranca() {
        return endereco_cobranca;
    }

    @Override
    public void entrar() {
        super.entrar();

        System.out.printf("\nInforme o limite de credito: ");
        setLimite_credito(leia.nextDouble());

        System.out.printf("z]\nInforme o endereco de cobranca: ");
        setEndereco_cobranca(endereco_cobranca);
    }
    
}
