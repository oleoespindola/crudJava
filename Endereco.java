public class Endereco implements interfaceCadastro {

    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public Endereco() {
        entrar();
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setComplement(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemeno() {
        return complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCep() {
        return cep;
    }

    @Override
    public void entrar() {
        System.out.printf("\nInforme o logradouro :");
        setLogradouro(leia.next());

        System.out.printf("\nInfome o numero: ");
        setNumero(leia.nextInt());

        System.out.printf("\nInforme o complemento :");
        setComplement(leia.next());

        System.out.printf("Informe o bairro: ");
        setBairro(leia.next());

        System.out.printf("Infome a cidade");
        setCidade(leia.next());

        System.out.printf("Informe o estado");
        setEstado(leia.next());

        System.out.printf("Informe o CEP");
        setCep(leia.nextInt());

    }

    @Override
    public void imprimir() {
        System.out.printf("Logradou: ", getLogradouro(), "\nNumero: ", getNumero(), "\nComplemento: ", getComplemeno(), "\nBairro: ", getBairro(), "Cidade: ", getCidade(), "Estado: ", getEstado(), "CEP: ", getCep());
    }

}
