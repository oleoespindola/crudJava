package financeiro;

import financeiro.cadastro.pessoa.pessoas.*;

public class Fornecedor extends PessoaFisica {

    // Atributos
    private String limite_compra;
    private String data_cadastro;
    private String site;

    //Construtor
    public Fornecedor() {
        entrar();
    }

    // Encapsulamento
    public void setLimite_compra(String limite_compra) {
        this.limite_compra = limite_compra;
    }

    public String getLimite_compra() {
        return limite_compra;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }

    // Sobrecarga de métdos
    @Override
    public void entrar() {
        super.entrar();

        System.out.printf("\nInforme o(a) limite de compra: ");
        setLimite_compra(leia.next());
        System.out.printf("\nInforme o(a) data do cadastro: ");
        setData_cadastro(leia.next());
        System.out.printf("\nInforme o(a) URL do site: ");
        setSite(leia.next());

    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("\nO limite de compra e de: %s", getLimite_compra());
        System.out.printf("\nA data do cadastro e: %s", getData_cadastro());
        System.out.printf("\nO site do fornecedor e: %s", getSite());
    }

}
