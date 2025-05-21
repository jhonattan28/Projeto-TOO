package modelo;

public class Professor extends Funcionario {

    private String especializacao;

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String exibirDados() {
        String aux = super.exibirDados();
        aux += "\nEspecialização: "+especializacao;
        return aux;
    }

    @Override
    public double calculaSalarioMes() {
        return salario * 1.25;
    }
}
