package model;
public class FuncionarioModel extends PessoaFisicaModel {

    // Atributos
    private String data_admissao;
    private String data_demissao;
    private String ctps;
    private double salario;

    // Constructor
    public FuncionarioModel() {}

        // Getters & Setters

    // Data de Admissõa
    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public String getData_admissao() {
        return data_admissao;
    }

    // Data de Demissão (Se houver)
    public void setData_demissao(String data_demissao) {
        this.data_demissao = data_demissao;
    }

    public String getData_demissao() {
        return data_demissao;
    }

    // Carteira de Trabalho
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    // Salário
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
