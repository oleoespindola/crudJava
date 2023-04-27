package models;

public class PagarModel {

    // Atributos
    private int id_fornecedor;
    private String boleto;
    private FinanceiroModel financeiro;

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

    public void setFinanceiro(FinanceiroModel financeiro) {
        this.financeiro = financeiro;
    }

    public FinanceiroModel getFinanceiro() {
        return financeiro;
    }
}
