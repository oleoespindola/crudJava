public class Fornecedor extends Pessoa {

    private String limite_compra;
    private String data_cadastro;
    private String site;

    public void setLimite_compra(String limite_compra) {
        this.limite_compra = limite_compra;
    }

    public String getLimite_compra() {
        return limite_compra;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }

    @Override
    public void entrar() {
        super.entrar();

        System.out.printf("Informe o(a): ");
        setLimite_compra(leia.next());

        System.out.printf("Informe o(a): ");
        setData_cadastro(leia.next());

        System.out.printf("Informe o(a): ");
        setSite(leia.next());

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("O limite de compra e de: ", getLimite_compra());
        System.out.printf("A data do cadastro e: ", getData_cadastro());
        System.out.printf("O site do fornecedor e: ", getSite());
    }

}
