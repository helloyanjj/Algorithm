package company;

import java.util.Scanner;

public class toutiao3 {

    public static int  resolve (String s) {
        char[] a = s.toCharArray();
        int len = s.length();
        if (len == 4 || len ==12) {
            return 1;
        } else if (a[0] == 0 && (len ==10)) {
            return 1;
        }
        return 2;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(resolve(s));
    }
}
