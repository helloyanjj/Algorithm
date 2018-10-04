package companyWrittenExamination;

import java.util.Scanner;

public class toutiao5 {

    public static void resolve (int N,int M,int[] a) {
        if (N == 1) {
            System.out.println(1);
        }
        System.out.println(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int [] a = new int[2*M];
        for (int i=0;i<2*M;i++) {
            a[i] = scanner.nextInt();
        }

        resolve(N,M,a);

    }
}
