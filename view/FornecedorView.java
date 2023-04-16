package view;

import models.FornecedorModel;

public class FornecedorView extends PessoaJuridicaView {

    FornecedorModel fornecedor;

    @Override
    public void entrar() {

        System.out.printf("CADASTRO DE FORNECEDORES");
        
        super.entrar();
   
        System.out.printf("Limite de compra: ");
        fornecedor.setLimite_compra(leia.next());;
        System.out.printf("Data do cadastro: ");
        fornecedor.setData_cadastro(leia.next());;
        System.out.printf("Site: ");
        fornecedor.setSite(leia.next());
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        
    }
}
