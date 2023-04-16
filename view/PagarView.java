package view;

import models.PagarModel;

public class PagarView extends FinanceiroView {

    PagarModel pagar;

    @Override
    public void entrar() {
        System.out.printf("REGISTRO DE PAGAMENTOS");

        super.entrar();

        System.out.printf("Informe o ID do fornecedor: ");
        pagar.setFornecedor(leia.nextInt());
        System.out.printf("Informe o código de barras");
        pagar.setBoleto(leia.next());

    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub

    }
}
