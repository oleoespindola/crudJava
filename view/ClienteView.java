package view;

import models.ClienteModel;

public class ClienteView extends PessoaFisicaView {

    ClienteModel cliente;

    @Override
    public void entrar() {
        System.out.printf("CADASTRO DE CLIENTES");

        super.entrar();

        System.out.printf("Informe o limite de crédito do cliente: ");
        cliente.setLimite_credito(leia.nextInt());
        System.out.printf("CADASTRO DO ENDEREÇO DE COBRANÇA: ");
        cliente.setEndereco_cobranca(new EnderecoView().getEndereco());
        
    }
    
    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        
    }
}
