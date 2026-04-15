public class Tabuada {

    static void main() {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Tabuada do %d%n", i);
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("------------------------------");
        }
    }
}
