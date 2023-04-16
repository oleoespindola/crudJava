package view;

import interfaces.InterfaceView;
import models.EnderecoModel;

public class EnderecoView implements InterfaceView{

    EnderecoModel endereco;

    public EnderecoView () {
        entrar();
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    @Override
    public void entrar() {
        System.out.printf("Informe o logradouro: ");
        endereco.setLogradouro(leia.next());
        System.out.printf("Informe o numero");
        endereco.setNumero(leia.nextInt());
        System.out.printf("Informe o complemento (se houver): ");
        endereco.setComplemento(leia.next());
        System.out.printf("Informe o bairro: ");
        endereco.setBairro(leia.next());
        System.out.printf("Informe a cidade: ");
        endereco.setCidade(leia.next());
        System.out.printf("Informe o estado: ");
        endereco.setEstado(leia.next());
        System.out.printf("Infoeme o CEP: ");
        endereco.setCep(leia.nextInt());
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        
    }
    
}
