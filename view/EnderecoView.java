package view;

import interfaces.InterfaceView;
import models.EnderecoModel;

public class EnderecoView implements InterfaceView{

    EnderecoModel endereco = new EnderecoModel();

    public EnderecoView () {}

    public EnderecoView (EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    @Override
    public void entrar() {
        System.out.printf("\nInforme o logradouro: ");
        endereco.setLogradouro(faker.gerarLogradouro());
        System.out.printf("\nInforme o numero");
        endereco.setNumero(faker.gerarNumero());
        System.out.printf("\nInforme o complemento (se houver): ");
        endereco.setComplemento(faker.gerarComplemento());
        System.out.printf("\nInforme o bairro: ");
        endereco.setBairro(faker.gerarBairro());
        System.out.printf("\nInforme a cidade: ");
        endereco.setCidade(faker.gerarCidade());
        System.out.printf("\nInforme o estado: ");
        endereco.setEstado(faker.gerarEstado());
        System.out.printf("\nInfoeme o CEP: ");
        endereco.setCep(faker.gerarCep());
    }

    @Override
    public void imprimir() {
        System.out.println("\nLogradouro: "+ endereco.getLogradouro()+ "\nNúmero: "+ endereco.getNumero()+ "\nComplemento: "+ endereco.getComplemento()+ 
        "\nBairro: "+ endereco.getBairro()+ "\nCidade: "+ endereco.getCidade()+ "\nEstado: "+ endereco.getEstado()+ "\nCEP: "+ endereco.getCep());
    }
    
}
