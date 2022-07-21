public class Estagiário {
    private String nome;
    private String CPF;
    private int numRegistro;
    private String orgãoDeLotacao;
    private double bolsa;
    private double gastos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrgãoDeLotacao() {
        return orgãoDeLotacao;
    }

    public void setOrgãoDeLotacao(String orgãoDeLotacao) {
        this.orgãoDeLotacao = orgãoDeLotacao;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    public double getGastos(){
        return gastos;

    }

    public void setGastos(double gastos){
        this.gastos = gastos;
    }

    public void reembolsoDespesas(){
         if (getGastos() > getBolsa()){
            System.out.println("Reembolso aprovado!");
        } else {
            System.out.println("Reembolso reprovado.");

        }
    }

    @Override
    public String toString() {
        return ("Estagiário: "+" Dados { "+ " Nome: "+nome+ " CPF: "+CPF+" Número de Registro: "+ numRegistro+ " Orgão Lotação: "+orgãoDeLotacao+" Bolsa: "+bolsa+" Gastos: "+gastos);
        }
}
