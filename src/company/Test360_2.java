package company;

import java.util.*;

public class Test360_2 {

    public static void ss (int[] a,int[][] rang) {
        for (int i=0;i<rang.length;i++) {
            Set set = new HashSet();
            int m = rang[i][0];
            int n = rang[i][1];
            for (int j=m-1;j<=n-1;j++) {
                set.add(a[j]);

            }

            System.out.println(set.size());

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
        }
        int Q = scanner.nextInt();
        int[][] rang = new int[Q][2];
        for (int i=0;i<Q;i++) {
            for (int j=0;j<2;j++) {
                rang[i][j] = scanner.nextInt();
            }
        }
        ss(a,rang);
//        Set set = new HashSet();
//        set.add(1);
//        set.add(2);
//        set.add(1);
//        System.out.println(set);
    }
}
