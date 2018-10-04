package company;

import java.util.Scanner;

/**
 * Created by yanjunjie on 18-9-13
 */
public class souhu3 {

    public static int resolve (String s1, String s2) {
        String[] a = s1.split("\\.");
        String[] b = s2.split("\\.");
        int lena = a.length;
        int lenb = b.length;
        int len = 0;
        if (lena >=lenb) {
            len = lenb;
        } else len = lena;
        for (int i=0;i<len;i++) {
            if (Integer.valueOf(a[i]) > Integer.valueOf(b[i])) {
                return 1;
            } else if (Integer.valueOf(a[i]) < Integer.valueOf(b[i])) {
                return -1;
            }
        }
        if (lena>lenb) {
            for (int i=lenb;i<lena;i++) {
                if(Integer.valueOf(a[i])!= 0){
                    return 1;
                }
            }
            return 0;
        } else if (lena < lenb) {
            for (int i=lena;i<lenb;i++) {
                if(Integer.valueOf(b[i])!= 0){
                    return -1;
                }
            }
            return 0;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println(resolve(s1, s2));
    }
}
