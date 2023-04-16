package models;

public class ReceberModel extends FinanceiroModel{

    // Atributos
    private int id_cliente;
    private String nota_fiscal;

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
}
