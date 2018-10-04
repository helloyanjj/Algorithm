package company;

import java.util.Scanner;

public class aiqiyi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(resolve(n));
    }

    private static int resolve(int n) {
//        if (n == 3) {
//            return 5;
//        }
//        int num = n - 3;
//        int sum = 1;
//        int aun = 0;
//        for (int i=0;i<num;i++) {
//            sum = sum + 2;
//            aun = aun + sum;
//        }
//
//        return 5+aun;



//        int sum = 0;
//        for (int i=1;i<n;i=i+2) {
//            sum = sum + (n-i)*(n-(i+1))/2;
//        }
//        return sum + 1 + n;
        int res = 0,len = n,c = 0;
        for (int i=0;i<len;i++) {
            if (i<=0.5*(len+1)) {
                c = getNF(len-i+1)/getNF(i)/getNF(len-2*i+1);
            }
            res = res+c;
        }
        return res;



    }

    public static int getNF(int n) {
        if(n==0) {
            return 1;
        }
        return n*getNF(n-1);
    }

}
