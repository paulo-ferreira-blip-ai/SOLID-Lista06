public class FuncionarioAdmin extends Funcionario{
    public FuncionarioAdmin(String nome, String cpf, int nrRegistro, String orgaoLotacao, float salario) {
        super();
    }

    //ATRIBUTOS/////////////////////////////////////////////////////////////////
    private String funcaoAdm;
    private String senioridade;

    //MÉTODOS ESPECIAIS/////////////////////////////////////////////////////////

    public FuncionarioAdmin(String funcaoAdm, String senioridade, String nome, String cpf, int nrRegistro, String orgaoLotacao, float salario) {
        super();
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    @Override
    public void reembolsoDespesas() {

    }

    @Override
    public void aumentoSalario() {
        this.setSalario(this.getSalario() * 0.1);

    }


    @Override
    public String toString() {
        return ("Funcionário Administrativo: "+" Dados { "+ " Nome: "+getNome()+ " CPF: "+getCpf()+" Número de Registro: "+ getNrRegistro()+ " Orgão Lotação: "+getOrgaoLotacao()+"Função Administrativa: "+funcaoAdm+"Senioridade: "+senioridade+" Salário: "+getSalario()+" Gastos: "+getGastos());
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }


}
