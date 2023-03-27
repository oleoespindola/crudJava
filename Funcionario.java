public class Funcionario extends Pessoa {

    private String data_admissao;
    private String data_demissao;
    private String ctps;
    private double salario;

    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public String getData_admissao() {
        return data_admissao;
    }

    public void setData_demissao(String data_demissao) {
        this.data_demissao = data_demissao;
    }

    public String getData_demissao() {
        return data_demissao;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void entrar() {
        super.entrar();

        System.out.printf("\nInforme o(a) data de admissao: ");
        setData_admissao(leia.next());

        System.out.printf("\nInforme o(a) data de demissao (se houver) ");
        setData_demissao(leia.next());

        System.out.printf("\nInforme o(a) registro da carteira de trabalho");
        setCtps(leia.next());

        System.out.print("\nInforme o salario");
        setSalario(leia.nextDouble());
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("O(a) data de admissao e: ", getData_admissao());
        System.out.printf("O(a) data de demissao e: ", getData_demissao());
        System.out.printf("O(a) registro da carteira de trabalho e: ", getCtps());
        System.out.printf("O(a) salario e: ", getSalario());
    }

}
