import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.print("Enter the value of M: ");
        int M = scanner.nextInt();

        char[][] grid = new char[N][N];
        System.out.println("Enter the elements of the grid:");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.next().charAt(0);
            }
        }

        int[] s = new int[]{0, 0};

        String[] t = new String[M];
        System.out.println("Enter the strings:");

        for (int i = 0; i < M; i++) {
            t[i] = scanner.next();
        }

        String luckyString = generateLuckyString(N, M, grid, s, t);
        System.out.println("Lucky String: " + luckyString);
    }

    public static String generateLuckyString(int N, int M, char[][] grid, int[] s, String[] t) {
        StringBuilder sb = new StringBuilder();
        int[][] visited = new int[N][N];
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        for (String str : t) {
            boolean found = false;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (grid[i][j] == str.charAt(0)) {
                        int cost = Math.abs(i - s[0]) + Math.abs(j - s[1]) + 1;
                        if (cost <= 5000) {
                            sb.append(grid[i][j]);
                            s[0] = i;
                            s[1] = j;
                            visited[i][j] = 1;
                            found = true;
                            break;
                        }
                    }
                }
                if (found) {
                    break;
                }
            }
        }

        return sb.toString();
    }
}
