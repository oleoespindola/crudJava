package models;

public class PagarModel extends FianceiroModel {

    // Atributos
    private FornecedorModel fornecedor;
    private String boleto;

    // Constructor
    public PagarModel() {}

        // Getters & Setters

    // Fornecedor
    public void setFornecedor(FornecedorModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    public FornecedorModel getFornecedor() {
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
