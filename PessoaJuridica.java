public abstract class PessoaJuridica extends Pessoa {

    String cnpj;
    String inscricao_estadual;
    String contato;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getContato() {
        return contato;
    }

    @Override
    public void entrar() {
        super.entrar();
        System.out.printf("anInforme o CNPJ: ");
        setCnpj(leia.next());

        System.out.print("\nInforme a incricao estadual: ");
        setInscricao_estadual(leia.next());

        System.out.printf("Informe o contato: ");
        setContato(leia.next());
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("Seu CNPJ e: ", getCnpj());
        System.out.printf("Sua incricao estadual e: ", getInscricao_estadual());
        System.out.printf("Seu contato e: ", getContato());
    }
}