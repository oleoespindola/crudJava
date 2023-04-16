package model;

public class ReceberModel extends FianceiroModel{

    // Atributos
    private ClienteModel cliente;
    private String nota_fiscal;


    // Construtor
    public ReceberModel() {}

        // Getters & Setters

    // Cliente
    public void setCliente() {
        ClienteModel coletaCliente = new ClienteModel();
        this.cliente = coletaCliente;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    // Nota Fiscal
    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }    
}
