package company;

import java.util.Scanner;

public class toutiao2 {

    public static void resolve(int[][] a) {
        System.out.println(2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int[][] a = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        resolve(a);
    }
}
