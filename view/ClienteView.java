package view;

import models.ClienteModel;
import controllers.ClienteController;

public class ClienteView extends PessoaFisicaView {

    // Atributos 
    ClienteModel cliente = new ClienteModel();
    ClienteController controller = new ClienteController();

    // Construtores 
    public ClienteView() {}

    public ClienteView(ClienteModel cliente) {
        this.cliente = cliente;
    }

    // Método 
    public ClienteModel getCliente() {
        return cliente;
    }

    // Sobrecarga 
    @Override
    public void entrar() {
        System.out.printf("CADASTRO DE CLIENTES");
        super.entrar();
        while(true){
            try {
                System.out.printf("Informe o limite de crédito do cliente: ");
                cliente.setLimite_credito(faker.gerarValor());
                break;
            } catch (Exception e) {
                System.out.printf("\nERRO! Tente novamente: ");
            }
        while(true){
            try {
                System.out.printf("CADASTRO DO ENDEREÇO DE COBRANÇA: ");
                cliente.setEndereco_cobranca(new EnderecoView().getEndereco());
                break;
            } catch (Exception e) {
                System.out.printf("\nERRO! Tente novamente: ");
            }
        controller.incluir(this.cliente);
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Limite de Credito: " + cliente.getLimite_credito());
        System.out.println("Endereco de Cobranca: " + cliente.getEndereco_cobranca());
    }
}