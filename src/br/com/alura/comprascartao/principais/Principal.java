package br.com.alura.comprascartao.principais;

import br.com.alura.comprascartao.modelos.Cartao;
import br.com.alura.comprascartao.modelos.Compras;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // recebe o limite de saldo.
        System.out.println("Digite o limite do cartão:");
        double limite = scanner.nextDouble();

        Cartao cartao = new Cartao(limite);
        List<Compras> historicoCompras = new ArrayList<>();

        // Cria a variavel para o loop.
        int i = 1;



        do {
            // recebe o nome do item.
            System.out.println("Digite a descrição da compra:");
            String item = scanner.nextLine();
            scanner.nextLine();

            // recebe o valor do item.
            System.out.println("Digite o valor da compra:");
            double valor = scanner.nextDouble();

            // verifica o saldo -> atualiza -> retorna resposta.
            cartao.setSaldo(cartao.verificaSaldo(valor));

            // Adiciona histórico de compras.
            historicoCompras.add(new Compras(item ,valor));
            historicoCompras.sort(Comparator.comparing(Compras :: getValor));

            // Cria condicao para sair do loop.
            System.out.println("Digite 0 para sair ou 1 para continuar:");
            i = scanner.nextInt();

        }while (i != 0);

        // Exibe histórico de compras e saldo atualizado.
        System.out.println("****************************************"+"\nCOMPRAS REALIZADAS:");

        for (Compras compra : historicoCompras) {
            System.out.println("\n"+compra.getItens() + " - R$" + String.format("%.2f", compra.getValor()));
        }

        System.out.println("\n"+"****************************************");
        System.out.println("Saldo do cartão: " + cartao.getSaldo());

        scanner.close();
    }
}
