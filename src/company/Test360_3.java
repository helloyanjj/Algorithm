package company;

import java.util.Scanner;

public class Test360_3 {

    public static void ss (int N,int[] A,int[] B) {
        System.out.println(2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = scanner.nextInt();
        }
        for (int i=0;i<N;i++) {
            B[i] = scanner.nextInt();
        }
        ss(N,A,B);
    }
}
