package view;

import java.util.ArrayList;

import models.*;

public class FluxoCaixaView {

    public FluxoCaixaView(ArrayList<ReceberModel> receitas, ArrayList<PagarModel> pagamentos) {
        fluxoDeCaixa(receitas, pagamentos);
    }

    public void fluxoDeCaixa(ArrayList<ReceberModel> receitas, ArrayList<PagarModel> pagamentos) {

        double saldo = 0;

        System.out.printf("FLUXO DE CAIXA");
        System.out.printf("Data | Credito | Débito | Saldo");
        for(ReceberModel receita : receitas) {
            saldo = saldo + receita.getTotal();
            System.out.printf("%s | %2.f | 0 | %2.f", receita.getPagamento(), receita.getTotal(), saldo);            
        }
        for(PagarModel pagamento : pagamentos) {
            saldo = saldo - pagamento.getTotal();
            System.out.printf("%s | 0 | %2.f | %2.f", pagamento.getPagamento(), pagamento.getTotal(), saldo);            
        }
    }
    
}
