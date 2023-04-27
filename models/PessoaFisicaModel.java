package models;

public class PessoaFisicaModel {

    // Atrinutos
    private String cpf;
    private String rg;
    private String emissor;
    private PessoaModel pessoa_Model;

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

    public void setPessoa_Model(PessoaModel pessoa_Model) {
        this.pessoa_Model = pessoa_Model;
    }

    public PessoaModel getPessoa_Model() {
        return pessoa_Model;
    }
}
