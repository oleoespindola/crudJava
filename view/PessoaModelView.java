package model;

public abstract class PessoaModel implements InterfaceCadastro {

    private int id;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String email;

    public PessoaModel() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    };

}
