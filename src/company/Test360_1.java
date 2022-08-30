package company;

import java.util.Scanner;

public class Test360_1 {

    public static void ss(int N, int[] a, int[] b) {
        int amin = a[0], amax = a[0], bmin = b[0], bmax = b[0];
        for (int i = 0; i < N; i++) {

            if (amin > a[i]) {
                amin = a[i];
            }
            if (amax < a[i]) {
                amax = a[i];
            }
            if (bmin > b[i]) {
                bmin = b[i];
            }
            if (bmax < b[i]) {
                bmax = b[i];
            }


        }
        long aa = amax - amin;
        long bb = bmax - bmin;
        System.out.println(aa > bb ? aa * aa : bb * bb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        ss(N, a, b);
    }
}
