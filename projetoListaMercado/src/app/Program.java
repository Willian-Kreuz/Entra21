package app;

import entitites.Itens;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Itens> itens = new ArrayList<>();

        System.out.print("Digite a quantidade de itens: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º item: ");
            String nome = sc.nextLine();
            System.out.print("Digite a quantidade desse item: ");
            int qtd = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o preço desse item: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            itens.add(new Itens(qtd, nome, preco));

            System.out.println();
        }

        double totalGeral = 0.0;
        for(Itens item : itens){
           totalGeral += item.total();
        }


        System.out.printf("Valor total da compra: R$ %.2f", totalGeral);
    }
}
