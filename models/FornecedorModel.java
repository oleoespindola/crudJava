package models;

public class FornecedorModel {

    // Atributos
    private double limite_compra;
    private String data_cadastro;
    private String site;

    //Construtor
    public FornecedorModel() {}

        // Getters & Setters

    // Limite de Compra
    public void setLimite_compra(Double limite_compra) {
        this.limite_compra = limite_compra;
    }

    public double getLimite_compra() {
        return limite_compra;
    }

    // Data do Cadastro
    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    // Site
    public void setSite(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }

}
