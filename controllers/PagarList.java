package controllers;

import java.util.ArrayList;

import models.PagarModel;

public class PagarList {

    ArrayList<PagarModel> pagamentos = new  ArrayList<PagarModel>();

    public ArrayList<PagarModel> getPagamentos() {
        return pagamentos;
    }

    public void incluir(PagarModel pagar) {
        this.pagamentos.add(pagar);
    }

    public void alterarPeloNumero(int numero, PagarModel pagar) {
        for(PagarModel pagamento : this.pagamentos) {
            if(numero == pagamento.getNumero()) {
                this.pagamentos.set(pagamento.getId(), pagar);
            }
        }
    }

    public PagarModel consultarPeloFornecedor(int idFornecedor) {
        return this.pagamentos.get(idFornecedor);
    }

    public PagarModel consultarPeloNumero(int numero) {
        for(PagarModel pagamento : this.pagamentos) {
            if(pagamento.getNumero() == numero) {
                return pagamento;
            }
        }
        return null;
    }

    public PagarModel ConsultarPeloValor(double valor) {
        for(PagarModel pagamento : this.pagamentos) {
            if(pagamento.getValor() == valor) {
                return pagamento;
            }
        }
        return null;
    }

    public PagarModel consultarPeloBoleto(String boleto) {
        for(PagarModel pagamento: this.pagamentos) {
            if(boleto == pagamento.getBoleto()) {
                return pagamento;
            }
        }
        return null;
    }


    public void excluirPeloId(int id) {
        this.pagamentos.remove(id);
    }


}
