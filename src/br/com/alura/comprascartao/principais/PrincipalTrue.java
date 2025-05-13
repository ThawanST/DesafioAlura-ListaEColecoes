package br.com.alura.comprascartao.principais;

import br.com.alura.comprascartao.modelos.CartaoTrue;
import br.com.alura.comprascartao.modelos.ComprasTrue;

import java.util.Collections;
import java.util.Scanner;

public class PrincipalTrue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();
        CartaoTrue cartao = new CartaoTrue(limite);

        int sair = 1;

        do{
            System.out.println("Digite o nome do item: ");
            String item = scanner.nextLine();
            scanner.nextLine();

            System.out.println("Digite o valor compra: ");
            double valor = scanner.nextDouble();

            ComprasTrue  compras = new ComprasTrue(item, valor);
            boolean historicoCompras = cartao.lancaCompra(compras);

            if(historicoCompras){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                sair = scanner.nextInt();
            }else{
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }

        }while (sair != 0);

        System.out.println("*****************************"+"\nCOMPRA REALIZADAS:\n");
        Collections.sort(cartao.getCompras());

        for (ComprasTrue c: cartao.getCompras()){
            System.out.println(c.getItem() + " - " + c.getValor());
        }

        System.out.println("\n*****************************");

        System.out.println("\nSaldo do cartão: "+ cartao.getSaldo());
        scanner.close();
    }


}
