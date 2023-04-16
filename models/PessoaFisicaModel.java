package models;

public abstract class PessoaFisicaModel extends PessoaModel {

    // Atrinutos
    private String cpf;
    private String rg;
    private String emissor;

    // Constructor
    public PessoaFisicaModel() {}

        // Getters & Setters
        
    // CPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    // RG
    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    // Emissor 
    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getEmissor() {
        return emissor;
    }

}
