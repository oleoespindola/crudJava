package view;

import models.FornecedorModel;

public class FornecedorView extends PessoaJuridicaView {

    FornecedorModel fornecedor;

    public FornecedorView() {}

    public FornecedorView(FornecedorModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void entrar() {
        System.out.printf("CADASTRO DE FORNECEDORES");
        super.entrar();
        System.out.printf("Limite de compra: ");
        fornecedor.setLimite_compra(faker.gerarValor());;
        System.out.printf("Data do cadastro: ");
        fornecedor.setData_cadastro(faker.gerarData());;
        System.out.printf("Site: ");
        fornecedor.setSite(faker.gerarSite());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Limite de Compra: "+ fornecedor.getLimite_compra());
        System.out.println("Data de Cadastro: "+ fornecedor.getData_cadastro());
        System.out.println("Site: "+ fornecedor.getSite());
    }
}
