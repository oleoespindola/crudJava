package view;

import models.ReceberModel;

public class ReceberView extends FinanceiroView {

    ReceberModel receber;

    @Override
    public void entrar() {
    System.out.printf("REGISTRAR RECEITA");

    super.entrar();

    System.out.printf("Informe o ID do cliente: ");
    receber.setCliente(faker.gerarId());
    System.out.printf("Informe o número da NF: ");
    receber.setNota_fiscal(faker.gerarNf());
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub

    }

}
