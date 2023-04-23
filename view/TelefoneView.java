package view;

import interfaces.InterfaceView;
import models.TelefoneModel;

public class TelefoneView implements InterfaceView{

    TelefoneModel telefone;

    public TelefoneView() {
        entrar();
    }

    public TelefoneView(TelefoneModel telefone) {
        this.telefone = telefone;
    }

    public TelefoneModel getTelefone() {
        return telefone;
    }

    @Override
    public void entrar() {
        System.out.printf("Informe o DDD: ");
        telefone.setDdd(14);
        System.out.printf("Informe o telefone: ");
        telefone.setNumero(987687645);
    }

    @Override
    public void imprimir() {
        System.out.printf("Telefone:(%d) %d\n", telefone.getDdd(), telefone.getNumero());
    }
    
}
