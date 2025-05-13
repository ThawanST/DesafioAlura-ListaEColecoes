package br.com.alura.comprascartao.modelos;
import java.util.ArrayList;
import java.util.List;
public class CartaoTrue {
    private double limite;
    private double saldo;
    private List<ComprasTrue> compras;

    public CartaoTrue(double limite) {

        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<ComprasTrue> getCompras() {
        return compras;
    }

    public boolean lancaCompra(ComprasTrue compra){
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

}
