package estudoalgoritmo;

/**
 *
 * @author Lucas Matos
 */
public class Fibonacci {

    static long calcula(int n) {
        if (n < 2) {
            return n;
        } else {
            return calcula(n - 1) + calcula(n - 2);
        }
    }

    public static void main(String[] args) {

        // teste do programa. Imprime os 30 primeiros termos       
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + Fibonacci.calcula(i) + "\n");
        }

    }

}
