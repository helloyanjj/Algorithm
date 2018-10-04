package company;

import java.util.Scanner;

import static java.util.Arrays.sort;


public class kedaxunfei1 {

    public static int ss (int [] a,int X) {
        sort(a);
        int n = 0;
        int i = 0;
        while (!ave(a,X)) {
            a[i++] = 100;
            n++;
        }
        return n;
    }

    public static boolean ave (int []a,int X) {
        int n = a.length;
        int sum = 0;
        for (int i=0;i<n;i++) {
            sum = sum + a[i];
        }
        float ave = sum/n;
        if (ave>= X) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int [] an = new int[T];
        for (int i=0;i<T;i++) {
            int n = scanner.nextInt();
            int X = scanner.nextInt();
            int[] a = new int[n];
            for (int j=0;j<n;j++) {
                a[j] = scanner.nextInt();

            }
            an[i] = ss(a,X);
        }
        for (int i=0;i<T;i++) {
            System.out.println(an[i]);
        }
    }
}
