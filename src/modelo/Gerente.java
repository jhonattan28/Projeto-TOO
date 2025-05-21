package modelo;

public class Gerente extends Funcionario {

    @Override
    public double calculaSalarioMes() {
        return salario * 1.5;
    }
    
}
