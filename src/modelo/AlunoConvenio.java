package modelo;

import java.time.LocalDate;
import java.time.Period;

public class AlunoConvenio extends Aluno {

    private Convenio convenio;

    public AlunoConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    @Override
    public void setPlano(Plano plano) {
        super.plano = plano;
        verificaDesconto();
    }

    @Override
    public void verificaDesconto() {
        int anos = Period.between(dataMatricula, LocalDate.now()).getYears();
        int meses = Period.between(dataMatricula, LocalDate.now()).getMonths();
        meses += anos * 12;
        if (plano != null) {
            valorMensalidade = plano.getValor();

            if (meses >= 3) {
                valorMensalidade -= (valorMensalidade * 0.1);
            } else {
                System.out.println("Aluno não possui o tempo necessário para obter desconto !");
            }
            if (convenio != null) {
                valorMensalidade -= (convenio.getDesconto() / 100) * plano.getValor();
            }
        } else {
            System.out.println("Aluno não possui plano selecionado. Informe o plano do aluno:");
        }

    }

    @Override
    public String exibirDados() {
        String dadosBase = super.exibirDados();

        if (convenio != null) {
            dadosBase += String.format("Convênio: %s - %.0f%%\n", convenio.getNome(), convenio.getDesconto());
        } else {
            dadosBase += "Convênio: Não informado\n";
        }

        return dadosBase;
    }

}
