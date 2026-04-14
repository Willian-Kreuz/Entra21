package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Projeto Análise de Notas de Alunos!");

        System.out.print("Quantos alunos serão digitados?");
        int qtdAlunos = sc.nextInt();
        System.out.println("Quantas avaliações serão digitadas? ");
        int qtdProvas = sc.nextInt();

        int[][] matriz = new int[qtdAlunos][qtdProvas];

        for(int i = 0; i< matriz.length;i++){
            System.out.println("Digite o nome do " + (i+1) + "º aluno: ");
            
            for(int j = 0; j < matriz.length; j++){

            }
        }
    }
}
