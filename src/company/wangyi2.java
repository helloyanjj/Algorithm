package company;

import java.util.Scanner;

/**
 * Created by yanjunjie on 18-9-8
 */
public class wangyi2 {

    public static void resolve (int t,int [][]a) {
        long [][] b= new long[t][2];
        for (int i=0;i<t;i++) {
            b[i][0] = 0;
            int wei = a[i][0] - a[i][1];
            int yi = a[i][1];
            if (a[i][0] <= 2 ||a[i][1]==0) {
                b[i][1] = 0;
            } else if (yi-1 > wei) {
                b[i][1] = wei;
            } else if (yi-1 <= wei) {
                b[i][1] = yi-1;
            }



        }


        for (int i=0;i<t;i++) {
            System.out.println(b[i][0] + " " +b[i][1]);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int [][]a = new int[t][2];
        for (int i=0;i<t;i++) {
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
        }
        resolve(t,a);

    }
}
