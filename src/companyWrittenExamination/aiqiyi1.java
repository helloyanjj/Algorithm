package companyWrittenExamination;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class aiqiyi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(resolve(a,n));

    }

    private static int resolve(int[] a, int n) {
//        if (n==1) {
//            return 1;
//        }


        sort(a);


        int same = a[0];
        int count = 1;
        for (int i=1;i<n;i++) {
            if (same!=a[i]) {
                same = a[i];

            } else {
                count++;
                same = a[i];
            }
        }
        return count;
    }

}
