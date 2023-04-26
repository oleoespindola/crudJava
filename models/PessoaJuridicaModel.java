package models;
public class PessoaJuridicaModel  {

    //Atributos
    private String cnpj;
    private String inscricao_estadual;
    private String contato;

    // Cosntructor
    public PessoaJuridicaModel() {}

        // Getters & Stters

    // CNPJ
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    // Inscrição Estadual
    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    // Contato
    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getContato() {
        return contato;
    }

}