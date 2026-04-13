void main() {
    System.out.println("Algoritmo de ordenação!");

    int[] notas = new int[]{8, 5, 9, 4, 8, 5, 6, 7, 10, 3, 2, 6, 8, 9, 7};

    for (int i = 0; i < notas.length - 1; i++) {
        for (int j = 0; j < notas.length - i - 1; j++) {
            if (notas[j] > notas[j + 1]) {
                int notaAux = notas[j];
                notas[j] = notas[j + 1];
                ;
                notas[j + 1] = notaAux;

            }
        }
    }

    System.out.println("Notas ordenadas: ");
    for (int nota : notas) {
        System.out.println(nota + " ");
    }
}