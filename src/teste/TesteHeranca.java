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
        
        System.out.println(p.exibirDados());
        Plano plano1 = new Plano();
        plano1.setNome("Basico");
        plano1.setDescricao("Acesso a musculação liberado.");
        plano1.setValor(100);
        
        Convenio c = new Convenio();
        c.setNome("IFSUL");
        c.setDesconto(5);
        
        AlunoConvenio a = new AlunoConvenio(c);
        a.setNome("Vivente");
        a.setMatricula("123");
        DateTimeFormatter formato = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        a.setDataNascimento(LocalDate.parse("10/01/2008", 
                formato));
        
                a.setDataMatricula(LocalDate.parse("10/04/2024", 
                formato));
        
                a.setPlano(plano1);
        
        AvaliacaoFisica av1 = new AvaliacaoFisica(a);
        a.adicionarAvaliacao(av1);
        av1.setProfessor(p);
        
        System.out.println(a.exibirDados());
        
        System.out.println("---- ");
        System.out.println(av1.exibirDados());
        
    }
}
