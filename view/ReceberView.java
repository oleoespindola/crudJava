package view;

import models.ReceberModel;

public class ReceberView extends FinanceiroView {

    ReceberModel receber = new ReceberModel();
    ClienteView cliente = new ClienteView();

    public ReceberView() {}

    public ReceberView(ReceberModel receber) {
        this.receber = receber;
    }

    public ReceberModel getReceber() {
        return receber;
    }

    @Override
    public void entrar() {
        System.out.printf("\nREGISTRAR RECEITA");
        super.entrar();
        while(true){
            try {
                System.out.printf("\nInforme o ID do cliente: ");
                receber.setCliente(faker.gerarId());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme o número da NF: ");
                receber.setNota_fiscal(faker.gerarNf());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("\n\n=== DADOS DO CLIENTE ===");
        this.cliente.imprimir();
        System.out.printf("\n\nO numero da nota e: %s", receber.getNota_fiscal());
    }
}
