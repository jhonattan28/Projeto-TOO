package modelo;

public abstract class Funcionario extends Pessoa{
    protected double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract double calculaSalarioMes();
}
