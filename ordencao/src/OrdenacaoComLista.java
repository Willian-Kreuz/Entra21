import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenacaoComLista {
    static void main() {
        List<Integer> notas = new ArrayList<>(Arrays.asList(8, 5, 9, 4, 8, 5, 6, 7, 10, 3, 2, 6, 9, 8, 7));

        Collections.sort(notas);
        for (int nota : notas) {
            System.out.println(nota + " ");

        }
        
        System.out.println();
    }
}
