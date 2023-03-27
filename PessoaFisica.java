public abstract class PessoaFisica extends Pessoa {

    String cpf;
    String rg;
    String emissor;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getEmissor() {
        return emissor;
    }

    @Override
    public void entrar() {

        super.entrar();

        System.out.printf("Informe o CPF: ");
        setCpf(leia.next());

        System.out.print("Informe o rg: ");
        setRg(leia.next());

        System.out.printf("Informe o orgao expeditor: ");
        setEmissor(leia.next());
    }

    @Override
    public void imprimir() {

        super.imprimir();

        System.out.printf("\nO CPF e: ", getCpf());
        System.out.printf("\nO RG e: ", getRg());
        System.out.printf("\nO orgao expeditor e: ", getEmissor());
    }

}
