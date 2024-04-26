import java.util.Scanner;

public class Dishes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] quantities = new int[N];
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            quantities[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        int maxServings = calculateMaxServings(N, quantities, A, B);

        System.out.println(maxServings);

        scanner.close();
    }

    private static int calculateMaxServings(int N, int[] quantities, int[] A, int[] B) {
        int maxServings = 0;

        for (int i = 0; i < N; i++) {
            int servingsA = quantities[i] / A[i];
            int servingsB = quantities[i] / B[i];

            maxServings += Math.min(servingsA, servingsB);
        }

        return maxServings;
    }
}
