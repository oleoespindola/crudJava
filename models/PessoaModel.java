package models;

public abstract class PessoaModel {

    // Atributos
    private int id;
    private String nome;
    private EnderecoModel endereco;
    private TelefoneModel telefone;
    private String email;

    // Constructor 
    public PessoaModel() {}


        // Getters & Setters 

    // ID 
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Endereço
    public void setEnderecoModel(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public EnderecoModel getEnderecoModel() {
        return endereco;
    }

    // Telefone
    public void setTelefoneModel(TelefoneModel telefone) {
        this.telefone = telefone;
    }

    public TelefoneModel getTelefoneModel() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    };

}
