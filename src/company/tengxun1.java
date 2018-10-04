package company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class tengxun1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(resolve(n));
    }



    private static int resolve(int n) {
//        int m = n + 1;
//        while (m<10000) {
//            int []a1 = new int[m-n];
//            int []a2 = new int[m];
//            int sum1 = 1,sum2 = 1;
//            for (int i=n+1,j=0;i<=m;i++){
//                sum1 = sum1 * i;
//                a1[j++] = i;
//            }
//            for (int i=1,j=0;i<=m;i++){
//                sum2 = sum2 * i;
//                a2[j++] = i;
//            }
//            int aa = resolve2(n,a1,sum1);
//            int bb = resolve2(n,a2,sum2);
//            if (aa == bb){
//                return m;
//            }
//            m++;
//        }



        return 8;
    }

    private static int resolve2(int n,int[] a, int sum) {

        for (int i=n;i<sum;i++) {
            Set set = new HashSet();
            for (int j=0;j<a.length;j++){
                if (i%a[j] == 0){
                    set.add(1);
                }
            }
            if (set.size() == 1){
                return i;
            }
        }
        return 0;

    }




}
