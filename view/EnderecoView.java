package view;

import interfaces.InterfaceView;
import models.EnderecoModel;

public class EnderecoView implements InterfaceView{

    EnderecoModel endereco;

    public EnderecoView () {
        entrar();
    }

    public EnderecoView (EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    @Override
    public void entrar() {
        System.out.printf("Informe o logradouro: ");
        endereco.setLogradouro(faker.gerarLogradouro());
        System.out.printf("Informe o numero");
        endereco.setNumero(faker.gerarNumero());
        System.out.printf("Informe o complemento (se houver): ");
        endereco.setComplemento(faker.gerarComplemento());
        System.out.printf("Informe o bairro: ");
        endereco.setBairro(faker.gerarBairro());
        System.out.printf("Informe a cidade: ");
        endereco.setCidade(faker.gerarCidade());
        System.out.printf("Informe o estado: ");
        endereco.setEstado(faker.gerarEstado());
        System.out.printf("Infoeme o CEP: ");
        endereco.setCep(faker.gerarCep());
    }

    @Override
    public void imprimir() {
        System.out.println("Logradouro: "+ endereco.getLogradouro()+ "\nNúmero: "+ endereco.getNumero()+ "\nComplemento: "+ endereco.getComplemento()+ 
        "\nBairro: "+ endereco.getBairro()+ "\nCidade: "+ endereco.getCidade()+ "\nEstado: "+ endereco.getEstado()+ "\nCEP: "+ endereco.getCep());
    }
    
}
