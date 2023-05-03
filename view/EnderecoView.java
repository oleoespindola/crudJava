package view;

import interfaces.InterfaceView;

import models.EnderecoModel;

public class EnderecoView implements InterfaceView{

    // Atributo 
    EnderecoModel endereco = new EnderecoModel();

    // Contrutor 
    public EnderecoView () {}

    public EnderecoView (EnderecoModel endereco) {
        this.endereco = endereco;
    }

    // Método 
    public EnderecoModel getEndereco() {
        return endereco;
    }

    // Sobrecarga 
    @Override
    public void entrar() {
        while(true){
            try {
                System.out.printf("\nInforme o logradouro: ");
                endereco.setLogradouro(faker.gerarLogradouro());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme o numero");
                endereco.setNumero(faker.gerarNumero());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme o complemento (se houver): ");
                endereco.setComplemento(faker.gerarComplemento());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme o bairro: ");
                endereco.setBairro(faker.gerarBairro());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme a cidade: ");
                endereco.setCidade(faker.gerarCidade());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme o estado: ");
                endereco.setEstado(faker.gerarEstado());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInfoeme o CEP: ");
                endereco.setCep(faker.gerarCep());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }  
    }
    
    @Override
    public void imprimir() {
        System.out.println("\nLogradouro: "+ endereco.getLogradouro()+ "\nNúmero: "+ endereco.getNumero()+ "\nComplemento: "+ endereco.getComplemento()+ 
        "\nBairro: "+ endereco.getBairro()+ "\nCidade: "+ endereco.getCidade()+ "\nEstado: "+ endereco.getEstado()+ "\nCEP: "+ endereco.getCep());
    }
}
