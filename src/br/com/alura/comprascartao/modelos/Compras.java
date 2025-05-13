package br.com.alura.comprascartao.modelos;

public class Compras {
    private String itens;
    private double valor;

    public Compras(String itens, double valor) {
        this.itens = itens;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compras: itens = " + itens +
                ", valor = " + valor;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
