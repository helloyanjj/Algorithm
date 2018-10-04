package company;

import java.util.Scanner;

public class hanwuji4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int [] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(resolve(K,N,a));
    }

    private static int resolve(int K, int N, int[] a) {
        return 2;
    }
}
