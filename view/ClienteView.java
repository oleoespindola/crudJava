package view;

import models.ClienteModel;
import controllers.ClienteController;

public class ClienteView extends PessoaFisicaView {

    ClienteModel cliente;
    ClienteController controller;

    @Override
    public void entrar() {
        System.out.printf("CADASTRO DE CLIENTES");

        super.entrar();

        System.out.printf("Informe o limite de crédito do cliente: ");
        cliente.setLimite_credito(faker.gerarValor());
        System.out.printf("CADASTRO DO ENDEREÇO DE COBRANÇA: ");
        cliente.setEndereco_cobranca(new EnderecoView().getEndereco());
        
        controller.incluir(this.cliente);
    }
    
    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        super.imprimir();

        System.out.println("Limite de Credito: "+ cliente.getLimite_credito());
        System.out.println("Endereco de Cobranca: " + cliente.getEndereco_cobranca());
    }
}
