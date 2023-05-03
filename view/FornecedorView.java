package view;

import models.FornecedorModel;

public class FornecedorView extends PessoaJuridicaView {

    // Atributos
    FornecedorModel fornecedor = new FornecedorModel();

    // Construtores
    public FornecedorView() {}

    public FornecedorView(FornecedorModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    // Método 
    public FornecedorModel getFornecedor() {
        return this.fornecedor;
    }
    
    // Sobrecarga
    @Override
    public void entrar() {
        System.out.printf("\nCADASTRO DE FORNECEDORES");
        super.entrar();
        while(true){
            try {
                System.out.printf("\nLimite de compra: ");
                fornecedor.setLimite_compra(faker.gerarValor());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nData do cadastro: ");
                fornecedor.setData_cadastro(faker.gerarData());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nSite: ");
                fornecedor.setSite(faker.gerarSite());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }   
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("\nLimite de Compra: "+ fornecedor.getLimite_compra());
        System.out.println("\nData de Cadastro: "+ fornecedor.getData_cadastro());
        System.out.println("\nSite: "+ fornecedor.getSite());
    }
}