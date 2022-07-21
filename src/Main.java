public class Main {
    public static void main(String[] args) {
        //Estagiários:
        Estagiário e1 = new Estagiário();
        e1.setNome("Carlos Braga");
        e1.setCPF("454.543.421-32");
        e1.setNumRegistro(3450);
        e1.setOrgãoDeLotacao("SEDUC");
        e1.setBolsa(400);
        e1.setGastos(300);
        System.out.println(e1.toString());
        e1.reembolsoDespesas();

        Estagiário e2 = new Estagiário();
        e2.setNome("Toreto Mendes");
        e2.setCPF("321.567.433-78");
        e2.setNumRegistro(3450);
        e2.setOrgãoDeLotacao("SEDUC");
        e2.setBolsa(400);
        e2.setGastos(600);
        System.out.println(e2.toString());
        e2.reembolsoDespesas();
        //e2.reembolsoDespesas();
        //Professores:
        Professor p1 = new Professor();
        p1.setNome("Ricardo Pereira");
        p1.setCpf("020.945.432-54");
        p1.setNrRegistro(1020);
        p1.setNivelGraduacao("Superior");
        p1.setOrgaoLotacao("SEDUC");
        p1.setSalario(2500);
        p1.setGastos(3500);
        p1.adicionarEstagiario(e1);
        System.out.println(p1.toString());
        p1.reembolsoDespesas();

        Professor p2 = new Professor();
        p2.setNome("Bruno Mendes");
        p2.setCpf("432.556.876-33");
        p2.setNrRegistro(1020);
        p2.setNivelGraduacao("Superior");
        p2.setOrgaoLotacao("SEDUC");
        p2.setSalario(2500);
        p2.adicionarEstagiario(e1);
        System.out.println(p2.toString());
        p2.reembolsoDespesas();

        //Coordenadores:
        Coordenador c1 = new Coordenador();
        c1.setNome("Roberta Sousa");
        c1.setCpf("432.785.098-43");
        c1.setNrRegistro(5065);
        c1.setOrgaoLotacao("SEDUC");
        c1.setSalario(3500);
        c1.setGastos(340);
        c1.aumentoSalario();
        c1.adicionarProfessor(p1);
        System.out.println(c1.toString());
        c1.reembolsoDespesas();

        Coordenador c2 = new Coordenador();
        c2.setNome("Caio Fábio");
        c2.setCpf("543.765.432-21");
        c2.setNrRegistro(1230);
        c2.setOrgaoLotacao("SEDUC");
        c2.setSalario(3500);
        c2.setGastos(5677);
        c2.aumentoSalario();
        c2.adicionarProfessor(p2);
        System.out.println(c2.toString());
        //c2.reembolsoDespesas();

    }
}
