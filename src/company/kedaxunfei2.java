package company;

import java.util.Scanner;

/**
 * Created by yanjunjie on 18-9-7
 */
public class kedaxunfei2 {

    public static int ss(int n, int[] a) {
        if (a.length == 1) {
            return 1;
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] < a[i + 1]) {
                    break;
                } else {
                    return 1;
                }
            }
        }

        int rr = 1;
        for (int i = 0; i < n - 1; i++) {
            int[] b = new int[n];
            int count = 0;
            if (a[i] > a[i + 1]) {
                b[count++] = a[i];
            }
            rr = ss(n, b) + 1;
        }
        return rr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            a[i] = scanner.nextInt();
        }
        System.out.println(ss(n, a));
    }
}
