public abstract class Funcionario {
    //ATRIBUTOS/////////////////////////////////////////////////////////////////
    private String nome;
    private String cpf;
    private int nrRegistro;
    private double gastos;
    private String orgaoLotacao;
    private double salario;

    public Funcionario() {
        this.nome = nome;
        this.cpf = cpf;
        this.nrRegistro = nrRegistro;
        this.gastos = gastos;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    //MÉTODOS///////////////////////////////////////////////////////////////////

    public void reembolsoDespesas() {
        if (getGastos() > getSalario()) {
            System.out.println("Reembolso aprovado!");


        }else {
            System.out.println("Reembolso reprovado.");
        }
    }



    //MÉTODOS ESPECIAIS/////////////////////////////////////////////////////////


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNrRegistro() {
        return nrRegistro;
    }

    public void setNrRegistro(int nrRegistro) {
        this.nrRegistro = nrRegistro;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
