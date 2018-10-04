package companyWrittenExamination;

import java.util.Scanner;

public class toutiao4 {

    public static int resolve (int N, int[] a) {

        if (a == null || a.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i=0;i<N;i++) {
            if (count == 0) {
                if ((a[i] & 0x80)==0) {
                    count = 0;
                } else if ((a[i] & 0xe0)==0xc0) {
                    count = 1;
                } else if ((a[i] & 0xf0)==0xe0) {
                    count = 2;
                } else if ((a[i] & 0xf8)==0xf0) {
                    count = 3;
                } else {
                    return 0;
                }
            } else {
                if ((a[i] & 0xc0)!=0x80) {
                    return 0;
                }
                count--;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int []a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(resolve(N,a));
    }
}
