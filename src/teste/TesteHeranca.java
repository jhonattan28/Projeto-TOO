package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Aluno;
import modelo.AlunoConvenio;
import modelo.AvaliacaoFisica;
import modelo.Convenio;
import modelo.Plano;
import modelo.Professor;

public class TesteHeranca {

    public static void main(String[] args) {
        Professor p = new Professor();
        p.setNome("Juka");
        p.setCpf("123.123.123-67");
        p.setEspecializacao("Musculação");
        //System.out.println(p.exibirDados());

        Plano plano1 = new Plano();
        plano1.setNome("Basico");
        plano1.setDescricao("Acesso a musculação liberado.");
        plano1.setValor(100);

        Plano plano2 = new Plano();
        plano2.setNome("Premium");
        plano2.setDescricao("Acesso a total da academia liberado.");
        plano2.setValor(180);

        Convenio c = new Convenio();
        c.setNome("IFSUL");
        c.setDesconto(5);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Aluno alunoN1 = new Aluno();
        alunoN1.setNome("Joao");
        alunoN1.setMatricula("456");
        alunoN1.setDataNascimento(LocalDate.parse("15/02/2002", formato));
        alunoN1.setDataMatricula(LocalDate.parse("12/01/2025", formato));
        alunoN1.setPlano(plano1);

        Aluno alunoN2 = new Aluno();
        alunoN2.setNome("Marcelo");
        alunoN2.setMatricula("789");
        alunoN2.setDataNascimento(LocalDate.parse("05/04/1999", formato));
        alunoN2.setDataMatricula(LocalDate.parse("19/04/2025", formato));
        alunoN2.setPlano(plano2);

        AlunoConvenio alunoC = new AlunoConvenio(c);
        alunoC.setNome("Cesar");
        alunoC.setMatricula("123");
        alunoC.setDataNascimento(LocalDate.parse("12/07/2008", formato));
        alunoC.setDataMatricula(LocalDate.parse("13/09/2024", formato));
        alunoC.setPlano(plano1);

        AvaliacaoFisica av1 = new AvaliacaoFisica(alunoC);
        alunoC.adicionarAvaliacao(av1);
        av1.setProfessor(p);

        System.out.println(av1.exibirDados());
        System.out.println("----");
        
        System.out.println(alunoN1.exibirDados());
        System.out.println(alunoC.exibirDados());
        System.out.println(alunoN2.exibirDados());
    }
}
