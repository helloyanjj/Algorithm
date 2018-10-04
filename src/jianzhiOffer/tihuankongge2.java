package jianzhiOffer;

/**
 * created by yanjunjie
 */

public class tihuankongge2 {
    public static void main(String[] args) {
        resolve("We Are Happy.");
    }

    public static void resolve(String string) {
        char[] a = string.toCharArray();
        int len = a.length;
        int num = 0;
        for (char c:a) {
            if (c==' ') {
                num = num + 3;
            }
        }
        char[]b = new char[len+num];
        int len2 = len+num;

        for (int i=0;i<len;i++) {
            b[i] = a[i];
        }
        int j = len2-1;
        for (int i=len-1;i>=0;i--) {

            if (b[i] != ' ' && j>i) {
                b[j--] = b[i];
                continue;
            } else {
                b[j--] = '0';
                b[j--] = '2';
                b[j--] = '%';
            }

        }
        System.out.println(b);

    }
}

