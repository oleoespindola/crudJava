package controllers;

import java.util.ArrayList;

import models.ReceberModel;

public class ReceberList {

    ArrayList<ReceberModel> receitas = new ArrayList<ReceberModel>();

    public ArrayList<ReceberModel> getReceitas() {
        return receitas;
    }

    public void incluir(ReceberModel receber) {
        this.receitas.add(receber.getId(), receber);
    }

    public void alterarPeloNumero(int numero) {
        for(ReceberModel receita : this.receitas) {
            if(numero == receita.getNumero()) {
                this.receitas.set(receita.getId(), receita);
            }
        }
    }

    public ReceberModel consultarPeloCliente(int id) {
        for(ReceberModel receita: this.receitas) {
            if(id == receita.getCliente()) {
                return receita;
            }
        }
        return null;
    }
    
     public ReceberModel consultarPeloNumero(int numero) {
        for(ReceberModel receita : this.receitas){
            if(numero == receita.getNumero()) {
                return receita;
            }
        }
        return null;
    }

    public ReceberModel ConsultarPeloValor(double valor) {
        for(ReceberModel receita : this.receitas) {
            if(valor == receita.getValor()) {
                return receita;
            }
        }
        return null;
    }

    public ReceberModel consultarPelaNF(String nota_fiscal) {
        for(ReceberModel receita : this.receitas) {
            if(nota_fiscal == receita.getNota_fiscal()) {
                return receita;
            }
        }
        return null;
    }

    public void excluirPeloId(int id) {
        this.receitas.remove(id);
    }

}
