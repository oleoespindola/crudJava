public abstract class Pessoa implements interfaceCadastro {

    int id;
    String nome;
    Endereco endereco;
    Telefone telefone;
    String email;

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

    public void setEndereco() {
        endereco.entrar();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setTelefone() {
        telefone.entrar();
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
        System.out.printf("\nInforme o ID:");
        setId(leia.nextInt());

        System.out.printf("\nInforme o nome:");
        setNome(leia.next());

        System.out.printf("\nInforme o endereço:");
        setEndereco();

        System.out.printf("\nInforme o telefone:");
        setTelefone();

        System.out.printf("\nInforme o email:");
        setEmail(leia.next());

    }

    @Override
    public void imprimir() {
        System.out.printf("\nO ID da pessoa e: ", getId());
        System.out.printf("\nO nome da pessoa e: ", getNome());
        System.out.printf("\nO telefone da pessoa e: ", getTelefone());
        System.out.printf("\nO endereço da pessoa e: ", getEndereco());
        System.out.printf("\nO email da pessoa e: ", getEmail());
    }
}
