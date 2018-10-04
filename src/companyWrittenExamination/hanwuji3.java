package companyWrittenExamination;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hanwuji3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int [] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = scanner.nextInt();
        }


        System.out.println(resolve(N,K,a));
    }

    private static int resolve(int N, int K, int[] a) {
        Set set = new HashSet();
        for (int i=0;i<N-1;i++) {
            for (int j=i;j<N;j++) {
                if ((a[i] + a[j])%K == 0) {
                    set.add(a[i]);


                }
            }
        }
        System.out.println(set.size());
        return N - set.size();
    }
}
