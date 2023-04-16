package view;

import interfaces.InterfaceCadastro;
import models.TelefoneModel;

public class TelefoneView implements InterfaceCadastro{

    TelefoneModel telefone;

    public TelefoneView() {
        entrar();
    }

    public TelefoneModel getTelefone() {
        return telefone;
    }

    @Override
    public void entrar() {
        System.out.printf("Informe o DDD: ");
        telefone.setDdd(leia.nextInt());
        System.out.printf("Infoem o telefone: ");
        telefone.setNumero(leia.nextInt());
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        
    }
    
}
