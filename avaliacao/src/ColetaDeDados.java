import java.util.List;
import java.util.Scanner;

//Criado a classe Pessoa, para que possamos salvar dentro de um ArrayList às 3 informações
class Pessoa{
    int idade;
    int sexo;
    double altura;

    //Criado o construtor, para que possamos adicionar às informações dentro do ArrayList
    public Pessoa(int sexo, int idade, double altura) {
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

}


 class ColetaDeDados {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //Quantidade fixa de habitantes fornecida pelo enunciado
        int habitantes = 1000;

        List<Pessoa> pessoas = new java.util.ArrayList<>();

        for(int i = 0; i< habitantes;i++){
            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (1 para masculino, 2 para feminino): ");
            int sexo = sc.nextInt();
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = sc.nextInt();
            System.out.println("Digite a altura da pessoa " + (i + 1) + ": ");
            double altura = sc.nextDouble();

            pessoas.add(new Pessoa(sexo, idade, altura));
        }

        //Criado a variável para guardar a soma das idades
        int somaIdades = 0;

        for (Pessoa p : pessoas) {
            somaIdades += p.idade;
        }

        //Variável para calcular a média da idade do grupo
        double mediaIdadeGrupo = (double) somaIdades / pessoas.size();

        System.out.println("Média da idade do grupo: " + mediaIdadeGrupo);




    }
}
