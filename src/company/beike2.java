package company;

import java.util.Scanner;

/**
 * created by yanjunjie
 */

public class beike2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][6];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        resolve(a, n);
    }

    private static void resolve(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            int q = a[i][5], p = a[i][2];
            while (a[i][0] > 0 && a[i][3] > 0) {

                while (q == a[i][5]) {
                    a[i][0] = a[i][0] - a[i][4];
                    q = 0;
                }

                while (p == a[i][2]) {
                    a[i][3] = a[i][3] - a[i][1];
                    p = 0;
                }
                q++;
                p++;
            }
            if (a[i][0] <= 0 && a[i][3] > 0) {
                System.out.println("XIAOCHUN");
            } else if (a[i][0] > 0 && a[i][3] <= 0) {
                System.out.println("XIAOZHI");
            } else if (a[i][0] <= 0 && a[i][3] <= 0) {
                System.out.println("TIE");
            }
        }


    }
}

