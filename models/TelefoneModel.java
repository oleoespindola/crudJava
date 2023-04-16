package models;

public class TelefoneModel {
    
    // Atributos 
    private int ddd;
    private long numero;

    // Constructor 
    public TelefoneModel() {}

        // Getters & Setters 

    // DDD
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getDdd() {
        return ddd;
    }

    // Númmero
    public void setNumero(long numero) {
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }
    
}
