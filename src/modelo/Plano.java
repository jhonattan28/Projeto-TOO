package modelo;

import java.text.DecimalFormat;

public class Plano implements Exibivel{

    private String nome;
    private String descricao;
    private double valor;
    DecimalFormat formatoMoeda = new DecimalFormat("0.00");

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String exibirDados() {
        String aux = "Dados do Plano:";
        aux += "\nNome: "+nome;
        aux += "\nDescrição: "+descricao;
        aux += "\nValor: R$ "+formatoMoeda.format(valor);
        
        return aux;
    }

}
