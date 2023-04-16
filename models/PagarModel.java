package models;

public class PagarModel extends FinanceiroModel {

    // Atributos
    private int id_fornecedor;
    private String boleto;

    // Constructor
    public PagarModel() {}

        // Getters & Setters

    // Fornecedor
    public void setFornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public int getFornecedor() {
        return id_fornecedor;
    }

    // Boleto
    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public String getBoleto() {
        return boleto;
    }

}
