package view;

import models.FornecedorModel;

public class FornecedorView extends PessoaJuridicaView {

    FornecedorModel fornecedor = new FornecedorModel();

    public FornecedorView() {}

    public FornecedorView(FornecedorModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    public FornecedorModel getFornecedor() {
        return this.fornecedor;
    }

    @Override
    public void entrar() {
        System.out.printf("\nCADASTRO DE FORNECEDORES");
        super.entrar();
        System.out.printf("\nLimite de compra: ");
        fornecedor.setLimite_compra(faker.gerarValor());;
        System.out.printf("\nData do cadastro: ");
        fornecedor.setData_cadastro(faker.gerarData());;
        System.out.printf("\nSite: ");
        fornecedor.setSite(faker.gerarSite());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("\nLimite de Compra: "+ fornecedor.getLimite_compra());
        System.out.println("\nData de Cadastro: "+ fornecedor.getData_cadastro());
        System.out.println("\nSite: "+ fornecedor.getSite());
    }
}
