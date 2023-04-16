package view;

import interfaces.InterfaceView;
import models.FinanceiroModel;

public abstract class FinanceiroView implements InterfaceView {

    FinanceiroModel financeiro;

    @Override
    public void entrar() {
        System.out.printf("Informe o ID da transação: ");
        System.out.printf("Informe o número da transação: ");
        System.out.printf("Data da emissão: ");
        System.out.printf("Data de vencimento: ");
        System.out.printf("Data do pagamento: ");
        System.out.printf("Valor: ");
        System.out.printf("Juros: ");
        System.out.printf("Multa");
        System.out.printf("Desconto: ");

        financeiro.setTotal();
        System.out.printf("TOTAL = %2.f", financeiro.getTotal());

    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub

    }

}
