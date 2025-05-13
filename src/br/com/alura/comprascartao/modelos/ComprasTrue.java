package br.com.alura.comprascartao.modelos;

public class ComprasTrue implements Comparable<ComprasTrue>{
    private String item;
    private double valor;

    public ComprasTrue(String item, double valor) {
        this.item = item;
        this.valor = valor;
    }

    public String getItem() {
        return item;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra : item = " + item +
                "valor = " + valor;
    }

    @Override
    public int compareTo(ComprasTrue outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
