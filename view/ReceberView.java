package view;

import models.ClienteModel;
import models.ReceberModel;

public class ReceberView extends FinanceiroView {

    ReceberModel receber;
    ClienteView cliente;

    public ReceberView() {}

    public ReceberView(ClienteModel cliente) {
        this.cliente = new ClienteView(cliente);
    }

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
        super.imprimir();
        System.out.printf("\n=== DADOS DO CLIENTE ===");
        this.cliente.imprimir();
        System.out.printf("\nO numero da nota e: %s", receber.getNota_fiscal());
    }
}
