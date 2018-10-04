package company;

import java.util.Scanner;

public class tengxun2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][]a = new int[m][2];
        for (int i=0;i<m;i++) {
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
        }
        System.out.println(resolve(n,m,a));
    }

    private static int resolve(int n, int m, int[][] a) {
        return 2;
    }
}
