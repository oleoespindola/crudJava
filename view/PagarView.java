package view;

import models.PagarModel;

public class PagarView extends FinanceiroView {

    PagarModel pagar = new PagarModel();
    FornecedorView fornecedor = new FornecedorView();

    public PagarView() {}

    public PagarView(PagarModel pagar) {
        this.pagar = pagar;
    }

    public PagarModel getPagar() {
        return pagar;
    }

    @Override
    public void entrar() {
        System.out.printf("REGISTRO DE PAGAMENTOS");
        super.entrar();
        System.out.printf("Informe o ID do fornecedor: ");
        pagar.setFornecedor(faker.gerarId());
        System.out.printf("Informe o código de barras");
        pagar.setBoleto(faker.gerarBoleto());
    }

    @Override
    public void imprimir() {
        super.imprimir();        
        System.out.printf("\n=== Dados do fornecedor ===");
        this.fornecedor.imprimir();
        System.out.println("Número do Boleto: " + pagar.getBoleto());
    }
}
