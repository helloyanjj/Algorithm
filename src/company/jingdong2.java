package company;

import java.util.Scanner;

public class jingdong2 {

    public static int resolve(int n, long[][] a) {
        int count = 0;
        boolean flag;
        for (int i = 0; i < n - 1; i++) {
            flag = false;
            for (int j = i + 1; j < n; j++) {
                if ((a[j][0] > a[i][0]) && (a[j][1] > a[i][1]) && (a[j][2] > a[i][2])) {
                    count++;
                    flag = true;
                }
                if (flag) {
                    break;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] a = new long[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
            a[i][2] = scanner.nextInt();
        }
        System.out.println(resolve(n, a));

    }
}
