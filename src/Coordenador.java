import java.util.ArrayList;

public class Coordenador extends Funcionario{
    public Coordenador() {
        super();
    }

    ///ATRIBUTOS/////////////////////////////////////////////////////////////////
    private ArrayList<Professor> professoresSupervisionados = new ArrayList<Professor>();

    //MÉTODOS///////////////////////////////////////////////////////////////////

    public void aumentoSalario(){
        this.setSalario(this.getSalario() * 0.05);
    }

    @Override
    public String toString() {
        return ("Coordenador: "+" Dados { "+ " Nome: "+getNome()+ " CPF: "+getCpf()+" Número de Registro: "+ getNrRegistro()+ " Orgão Lotação: "+getOrgaoLotacao()+" Salário: "+getSalario()+" Gastos: "+getGastos()+"Professores adicionados: "+professoresSupervisionados);
    }

    //Método para adiconar Professor:
    public void adicionarProfessor(Professor professor){
        this.professoresSupervisionados.add(professor);
    }


    public void getProfessoresSupervisionados() {
        System.out.println(professoresSupervisionados);
    }

    public void setProfessoresSupervisionados(ArrayList<Professor> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
