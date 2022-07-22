import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario{
    public Professor(String nome, String cpf, int nrRegistro, String orgaoLotacao, float salario) {
        super();
    }
    //ATRIBUTOS/////////////////////////////////////////////////////////////////
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;
    private double salario;
    private int qtdEstagiario;
    private ArrayList<String> turmas = new ArrayList<String>();
    private List<String> estagiario = new ArrayList<String>();

    public Professor(String nome, String cpf, int nrRegistro, double gastos, String orgaoLotacao, double salario, String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas, double salario1, int qtdEstagiario, ArrayList<String> turmas, List<String> estagiario) {
        super();
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
        this.salario = salario1;
        this.qtdEstagiario = qtdEstagiario;
        this.turmas = turmas;
        this.estagiario = estagiario;
    }

    //Métodos:
    public void adicionaTurma(String turma){
        this.turmas.add(turma);
        this.setQtdTurmas(this.getQtdTurmas() + 1);
    }

    @Override
    public void reembolsoDespesas() {
        if (getGastos() > getSalario()){
            System.out.println("Reembolso aprovado!");
        } else {
            System.out.println("Reembolso reprovado.");
        }
    }

    @Override
    public void aumentoSalario() {
        this.setSalario(this.getSalario() * 0.1);
    }


    public void adicionarEstagiario(String estagiário){

        this.estagiario.add(estagiário);
        this.setQtdEstagiario(this.getQtdEstagiario()+1);
    }

    @Override
    public String toString() {
        return ("Professor: "+" Dados { "+ " Nome: "+getNome()+ " CPF: "+getCpf()+" Número de Registro: "+ getNrRegistro()+ "\nOrgão Lotação: "+getOrgaoLotacao()+" Salário: "+getSalario()+" Gastos: "+getGastos()+"\nEstagiários supervisionados: "+estagiario+"\nTurmas: "+turmas);
    }

    //MÉTODOS ESPECIAIS/////////////////////////////////////////////////////////
    public Professor() {        super();
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getQtdEstagiario() {
        return qtdEstagiario;
    }

    public void setQtdEstagiario(int qtdEstagiario) {
        this.qtdEstagiario = qtdEstagiario;
    }

    public ArrayList<String> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<String> turmas) {
        this.turmas = turmas;
    }

    public List<String> getEstagiario() {
        return estagiario;
    }

    public void setEstagiario(List<String> estagiario) {
        this.estagiario = estagiario;
    }

}
