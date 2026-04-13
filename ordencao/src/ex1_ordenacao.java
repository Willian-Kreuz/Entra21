import java.util.Scanner;

public class ex1_ordenacao {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = sc.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notas[i] = sc.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    double aux = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = aux;
                }
            }
        }

        System.out.println("Notas em ordem: crescente: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

    }
}
