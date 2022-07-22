import java.util.ArrayList;

public class Coordenador extends Funcionario{
    public Coordenador() {

        super();
    }

    ///ATRIBUTOS/////////////////////////////////////////////////////////////////
    private ArrayList<String> professoresSupervisionados = new ArrayList<String>();

    //MÉTODOS///////////////////////////////////////////////////////////////////

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

        this.setSalario(this.getSalario() * 0.05);
        System.out.printf("O aumento de salário foi de: R$ %.2f \n", getSalario());
    }


    @Override
    public String toString() {
        return ("Coordenador: "+" Dados { "+ " Nome: "+getNome()+ " CPF: "+getCpf()+" Número de Registro: "+ getNrRegistro()+ "\nOrgão Lotação: "+getOrgaoLotacao()+" Salário: R$ "+getSalario()+" Gastos: "+getGastos()+"\nProfessores supervisionados: "+professoresSupervisionados);
    }

    //Método para adiconar Professor:
    public void adicionarProfessor(String professor){

        this.professoresSupervisionados.add(professor);
    }

    //métodos especiais

    public void getProfessoresSupervisionados() {

        System.out.println(professoresSupervisionados);
    }

    public void setProfessoresSupervisionados(ArrayList<String> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
