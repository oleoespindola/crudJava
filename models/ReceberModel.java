package models;

public class ReceberModel {

    // Atributos
    private int id_cliente;
    private String nota_fiscal;
    private FinanceiroModel financeiro;

    // Construtor
    public ReceberModel() {}

        // Getters & Setters

    // Cliente
    public void setCliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getCliente() {
        return id_cliente;
    }

    // Nota Fiscal
    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }    

    public void setFinanceiro(FinanceiroModel financeiro) {
        this.financeiro = financeiro;
    }

    public FinanceiroModel getFinanceiro() {
        return financeiro;
    }
}
