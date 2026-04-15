import java.util.Scanner;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] produtos = new String[3];
        int[][]vendas = new int[3][5];

        System.out.println("Tabela de vendas!");
        System.out.println("--------------------");

        for(int i = 0; i< produtos.length;i++){
            System.out.printf("Digite o nome do %dº produto: ", (i+1));
            produtos[i] = sc.nextLine();

            for(int j = 0; j< 5;j++){
                System.out.printf("Digite às vendas do %dº dia: ", (j+1));
                vendas[i][j] = sc.nextInt();
                sc.nextLine();
            }
            System.out.println("---------------------");
        }

        System.out.println();

        for(int i = 0; i < 3; i++){
            System.out.println("Produto: " + produtos[i]);
            for(int j = 0; j<5; j++ ){
                switch (j){
                    case 0:
                        System.out.println("Segunda-feira: " + vendas[i][j]);
                        break;
                    case 1:
                        System.out.println("Terça-feira: " + vendas[i][j]);
                        break;
                        case 2:
                        System.out.println("Quarta-feira: " + vendas[i][j]);
                        break;
                        case 3:
                        System.out.println("Quinta-feira: " + vendas[i][j]);
                        break;
                        case 4:
                        System.out.println("Sexta-feira: " + vendas[i][j]);
                        break;
                    default:
                        System.out.println("Dia inválido");
                        break;
                }
            }
        }

        System.out.println("--------");

        System.out.println("Total de vendas por produto:");
        for(int i = 0; i < produtos.length; i++){
            int total = 0;
            for(int j = 0; j < 5; j++){
                total += vendas[i][j];
            }
            System.out.println(produtos[i] + ": " + total);
        }

        System.out.println("--------");

        System.out.println("Total de vendas por dia:");
        for(int j = 0; j < 5; j++){
            int total = 0;
            for(int i = 0; i < produtos.length; i++){
                total += vendas[i][j];
            }
            String dia;
            switch(j){
                case 0:
                    dia = "Segunda-feira";
                    break;
                case 1:
                    dia = "Terça-feira";
                    break;
                case 2:
                    dia = "Quarta-feira";
                    break;
                case 3:
                    dia = "Quinta-feira";
                    break;
                case 4:
                    dia = "Sexta-feira";
                    break;
                default:
                    dia = "Dia inválido";
                    break;
            }
            System.out.println(dia + ": " + total);
        }

        System.out.println("--------");

        int totalSemana = 0;
        for(int i = 0; i < produtos.length; i++){
            for(int j = 0; j < 5; j++){
                totalSemana += vendas[i][j];
            }
        }
        System.out.println("Total geral da semana: " + totalSemana);
    }
}
