package company;

import java.util.Scanner;

public class meituan2 {

    public static void ss(int n, int k, int t, int[] a) {
        int[] sum = new int[310000];
        for (int i = 1; i <= n; ++i) {
            sum[i] = (1 - a[i]) + sum[i - 1];
        }

        int p1 = 1, p2 = 0;
        while (p2 + 1 <= n && (sum[p2 + 1] - sum[p1 - 1] <= k)) {
            p2++;
        }
        int ans = p2 - p1 + 1;
        while (p1 <= n && p2 <= n) {
            p1++;
            while (p2 + 1 <= n && sum[p2 + 1] - sum[p1 - 1] <= k)
                p2++;
            ans = Math.max(ans, p2 - p1 + 1);
        }
        System.out.println(ans);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        int[] a = new int[310000];
        for (int i = 1; i <= n; ++i) {
            a[i] = scanner.nextInt();
        }

        ss(n, k, t, a);
    }
}
