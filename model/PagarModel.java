package model;

public class PagarModel extends FianceiroModel {

    // Atributos
    private Fornecedor fornecedor;
    private String boleto;

    // Constructor
    public PagarModel() {
        entrar();
    }

        // Getters & Setters

    // Fornecedor
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    // Boleto
    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public String getBoleto() {
        return boleto;
    }

}
