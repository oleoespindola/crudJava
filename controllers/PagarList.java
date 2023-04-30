package controllers;

import java.util.*;

import models.PagarModel;

public class PagarList {

    Map<Integer, PagarModel> pagamentos = new  HashMap<Integer, PagarModel>();

    public ArrayList<PagarModel> getPagamentos() {
        ArrayList<PagarModel> pagamentosList = new ArrayList<>();
        for (PagarModel pagamento : this.pagamentos.values()) {
            pagamentosList.add(pagamento);
        }
        return pagamentosList;
    }

    public void incluir(PagarModel pagar) {
        this.pagamentos.put(pagar.getId(), pagar);
    }

    public void alterarPeloNumero(int numero, PagarModel pagar) {
        for(PagarModel pagamento : this.pagamentos.values()) {
            if(numero == pagamento.getNumero()) {
                this.pagamentos.put(pagamento.getId(), pagamento);
            }
        }
    }

    public PagarModel consultarPeloFornecedor(int idFornecedor) {
        for (PagarModel pagamento : this.pagamentos.values()) {
            if( idFornecedor == pagamento.getFornecedor()) {
                return pagamento;
            }
        }
        return null;
    }

    public PagarModel consultarPeloNumero(int numero) {
        for(PagarModel pagamento : this.pagamentos.values()) {
            if(pagamento.getNumero() == numero) {
                return pagamento;
            }
        }
        return null;
    }

    public PagarModel ConsultarPeloValor(double valor) {
        for(PagarModel pagamento : this.pagamentos.values()) {
            if(pagamento.getValor() == valor) {
                return pagamento;
            }
        }
        return null;
    }

    public PagarModel consultarPeloBoleto(String boleto) {
        for(PagarModel pagamento: this.pagamentos.values()) {
            if(boleto.equals(pagamento.getBoleto())) {
                return pagamento;
            }
        }
        return null;
    }


    public void excluirPeloId(int id) {
        this.pagamentos.remove(id);
    }


}
