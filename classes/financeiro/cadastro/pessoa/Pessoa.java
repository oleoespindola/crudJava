package financeiro.cadastro.pessoa;

import financeiro.cadastro.InterfaceCadastro;

public abstract class Pessoa implements InterfaceCadastro {

    private int id;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String email;

    public Pessoa() {}

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

    // Sobrecarga
    @Override
    public void entrar() {

        System.out.printf("\nInforme o ID: ");
        setId(leia.nextInt());

        System.out.printf("\nInforme o nome: ");
        setNome(leia.next());

        System.out.printf("\n=== Cadastro de nedereço ===");
        Endereco capturarEndereco = new Endereco();
        setEndereco(capturarEndereco);

        System.out.printf("\n=== Cadastro de Telefone ===");
        Telefone capturarTelefone = new Telefone();
        setTelefone(capturarTelefone);

        System.out.printf("\nInforme o email:");
        setEmail(leia.next());

    }

    @Override
    public void imprimir() {
        System.out.printf("\nO ID da pessoa e: %d", getId());
        System.out.printf("\nO nome da pessoa e: %s", getNome());
        telefone.imprimir();
        endereco.imprimir();
        System.out.printf("\nO email da pessoa e: %s", getEmail());
    }
}
