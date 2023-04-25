package view;

import interfaces.InterfaceView;
import models.TelefoneModel;

public class TelefoneView implements InterfaceView{

    TelefoneModel telefone = new TelefoneModel();

    public TelefoneView() {}

    public TelefoneView(TelefoneModel telefone) {
        this.telefone = telefone;
    }

    public TelefoneModel getTelefone() {
        return telefone;
    }

    @Override
    public void entrar() {
        System.out.printf("\nInforme o DDD: ");
        telefone.setDdd(14);
        System.out.printf("\nInforme o telefone: ");
        telefone.setNumero(987687645);
    }

    @Override
    public void imprimir() {
        System.out.printf("\nTelefone:(%d) %d\n", telefone.getDdd(), telefone.getNumero());
    }
    
}
