package view;

import interfaces.InterfaceView;
import models.TelefoneModel;
import test.Faker;

public class TelefoneView implements InterfaceView{

    TelefoneModel telefone = new TelefoneModel();
    Faker faker = new Faker();

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
        this.telefone.setDdd(this.faker.gerarDDD());
        System.out.printf("\nInforme o telefone: ");
        this.telefone.setNumero(this.faker.gerarTelefone());
        System.out.printf("%d", this.telefone.getNumero());
    }

    @Override
    public void imprimir() {
        System.out.printf("\nTelefone:(%d) %d", telefone.getDdd(), telefone.getNumero());
    }
    
}
