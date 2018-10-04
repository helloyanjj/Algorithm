package jianzhiOffer;

import static java.util.Arrays.sort;

/**
 * created by yanjunjie
 */

public class shuzuchongfushuzi {
    public static void main(String[] args) {
        int [] a = {2,3,1,0,2,5,3};
        int len = a.length;
        sort(a);
        for (int i=0;i<len;i++) {
            if (a[i] != i) {
                int m = a[i];
                if (m!=a[m]) {
                    int temp = a[m];
                    a[m] = m;
                    m = temp;

                } else System.out.println(m);
            }
        }
    }
}

