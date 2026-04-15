import java.util.Scanner;

public class SubtracaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.printf("Digite o elemento %d do vetor A: ", i + 1);
            vetorA[i] = scanner.nextInt();
        }

        for(int i = 0; i< tamanho; i++){
            System.out.printf("Digite o elemento %d do vetor B: ", i + 1);
            vetorB[i] = scanner.nextInt();
        }
        System.out.println("--------------------");
        for(int i = 0; i< tamanho; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        System.out.println("--------------------");
        for(int i = 0; i< tamanho; i++){
            System.out.printf("Elemento %d do vetor C: %d%n", i + 1, vetorC[i]);

        }
    }
}
