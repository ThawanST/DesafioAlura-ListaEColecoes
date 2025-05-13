package br.com.alura.comprascartao.modelos;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limite;
    private List<Compras> historicoCompras;
    private double saldo;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.historicoCompras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public List<Compras> getHistoricoCompras() {
        return historicoCompras;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double verificaSaldo(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Compra realizada!");
        }else{
            System.out.println("Compra negada!"+"\nSaldo insuficiente!");
        }
        return saldo;
    }

}
