package model;

import financeiro.cadastro.pessoa.*;

public abstract class PessoaFisica extends PessoaModel {

    //Atribútos
    private String cpf;
    private String rg;
    private String emissor;

    //Construtor
    public PessoaFisica() {}

    //Encapsulamento
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getEmissor() {
        return emissor;
    }


    //Sobrecarga de métodos
    @Override
    public void entrar() {

        super.entrar();

        System.out.printf("\nInforme o CPF: ");
        setCpf(leia.next());
        System.out.printf("\nInforme o rg: ");
        setRg(leia.next());
        System.out.printf("\nInforme o orgao expeditor: ");
        setEmissor(leia.next());

    }

    @Override
    public void imprimir() {

        super.imprimir();

        System.out.printf("\nO CPF e: %s", getCpf());
        System.out.printf("\nO RG e: %s", getRg());
        System.out.printf("\nO orgao expeditor e: %s", getEmissor());

    }

}
