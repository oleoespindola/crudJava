package view;

import interfaces.InterfaceView;
import models.FinanceiroModel;

public class FluxoCaixaView implements InterfaceView {

    FinanceiroModel financeiro;

    public void entrar() {
        setVencimentoCredito(vencimentoCredito);
        setDebito(debito);
        setCredito(credito);
        setDebito(debito);
        saldo = credito - debito;
        setSaldo (saldo);
    }

    @Override
    public void imprimir() {

        System.out.println("=== Fluxo de Caixa ===\n");
        System.out.println("Vencimento | Credito | Debito | Saldo");
        System.out.println( financeiro.getVencimentoCredito()+ financeiro.getCredito() + financeiro.getCredito());
        System.out.println( getVencimentoDebito()+ getDebito()+ getDebito());
        System.out.println( getCredito() + getDebito()+ getSaldo());
    }
    
}
