package view;

import interfaces.InterfaceView;
import models.TelefoneModel;
public class TelefoneView implements InterfaceView{

    TelefoneModel telefone = new TelefoneModel();

    public TelefoneView() {}

    public TelefoneView(TelefoneModel telefone) {
        this.telefone = telefone;
    }

    public TelefoneModel getTelefone() {
        return telefone;
    }


    public void entrar() {
        
        
        while(true){
            try {
                System.out.printf("\nInforme o DDD: ");
                this.telefone.setDdd(faker.gerarDDD());
                break;
            } catch (Exception e) {
                System.out.printf("\nERRO! Tente novamente: ");
                leia.next();
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme o telefone: ");
                this.telefone.setNumero(faker.gerarTelefone());
                break;
            } catch (Exception e) {
                System.out.printf("\nERRO! Tente novamente: ");
                leia.next();
            }
        }   
    }

    public void imprimir() {
        System.out.printf("\nTelefone:(%d) %d", telefone.getDdd(), telefone.getNumero());
    }
    
}
