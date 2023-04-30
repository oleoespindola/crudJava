package controllers;

import java.util.*;

import models.ReceberModel;

public class ReceberList {

    Map<Integer, ReceberModel> receitas = new HashMap<Integer, ReceberModel>();

    public ArrayList<ReceberModel> getReceitas() {
        ArrayList<ReceberModel> receitasList = new ArrayList<>();
        for (ReceberModel receita : this.receitas.values()) {
            receitasList.add(receita);
        }
        return receitasList;
    }

    public void incluir(ReceberModel receber) {
        this.receitas.put(receber.getId(), receber);
    }

    public void alterarPeloNumero(int numero) {
        for(ReceberModel receita : this.receitas.values()) {
            if(numero == receita.getNumero()) {
                this.receitas.put(receita.getId(), receita);
            }
        }
    }

    public ReceberModel consultarPeloCliente(int id) {
        return this.receitas.get(id);
    }
    
     public ReceberModel consultarPeloNumero(int numero) {
        for(ReceberModel receita : this.receitas.values()){
            if(numero == receita.getNumero()) {
                return receita;
            }
        }
        return null;
    }

    public ReceberModel ConsultarPeloValor(double valor) {
        for(ReceberModel receita : this.receitas.values()) {
            if(valor == receita.getValor()) {
                return receita;
            }
        }
        return null;
    }

    public ReceberModel consultarPelaNF(String nota_fiscal) {
        for(ReceberModel receita : this.receitas.values()) {
            if(nota_fiscal.equals(receita.getNota_fiscal())) {
                return receita;
            }
        }
        return null;
    }

    public void excluirPeloId(int id) {
        this.receitas.remove(id);
    }

}
