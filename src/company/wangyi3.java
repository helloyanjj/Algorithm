package company;

import java.util.Scanner;

/**
 * Created by yanjunjie on 18-9-8
 */
public class wangyi3 {

    public static void resolve (int n,int m,int[][]a) {
        int num = 0;
        for (int i=0;i<n;i++) {
            if (a[i][0]==1) {
                num++;
            }

        }
        if (num>(n/2)) {
            System.out.println(6);

        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][]a = new int[m][2];
        for (int i=0;i<n;i++) {
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
        }
        resolve(n,m,a);
    }
}
