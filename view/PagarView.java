package view;

import models.PagarModel;

public class PagarView extends FinanceiroView {

    PagarModel pagar;

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
        // TODO Auto-generated method stub
        super.imprimir();

        
        System.out.printf("\n=== Dados do fornecedor ===");
        FornecedorView.getFornecedor().imprimir();
        System.out.println("Número do Boleto: " + pagar.getBoleto());
    }
}
