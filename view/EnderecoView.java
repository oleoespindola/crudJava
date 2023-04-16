package view;

import interfaces.InterfaceCadastro;
import models.EnderecoModel;

public class EnderecoView implements InterfaceCadastro{

    EnderecoModel endereco = new EnderecoModel();

    @Override
    public void faker() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void entrar() {
        System.out.printf("Informe o logradouro: ");
        endereco.setLogradouro(null);
        System.out.printf("Informe o numero");
        endereco.setNumero(0);
        System.out.printf("Informe o complemento (se houver): ");
        endereco.setComplemento(null);
        System.out.printf("Informe o bairro: ");
        endereco.setBairro(null);
        System.out.printf("Informe a cidade: ");
        endereco.setCidade(null);
        System.out.printf("Informe o estado: ");
        endereco.setEstado(null);
        System.out.printf("Infoeme o CEP: ");
        endereco.setCep(0);
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        
    }
    
}
