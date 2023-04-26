package models;

public class ClienteModel {

    // Atribuitos
    private double limite_credito;
    private EnderecoModel endereco_cobranca;
    private PessoaFisicaModel pessoa_fisica;

    // Constructor
    public ClienteModel() {}

        // Getters & Setters

    // Limite de Crédito
    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    public double getLimite_credito() {
        return limite_credito;
    }

    public void setpessoa_fisica(PessoaFisicaModel pessoa_fisica) {
        this.pessoa_fisica = pessoa_fisica;
    }

    public PessoaFisicaModel getpessoa_fisica() {
        return pessoa_fisica;
    }

    // Cobrança
    public void setEndereco_cobranca(EnderecoModel endereco_cobranca) {
        this.endereco_cobranca = endereco_cobranca;
    }

    public EnderecoModel getEndereco_cobranca() {
        return endereco_cobranca;
    }
    
}
