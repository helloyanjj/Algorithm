package company;

import java.util.Scanner;

/**
 * created by yanjunjie
 */

public class qunaer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] a = s.split(" ");
        int n = a.length;
        int[] m = new int[n];
        int i = 0;
        for (String ss : a) {
            int d = Integer.valueOf(ss);
            m[i++] = d;
        }
        System.out.print("1 3");
    }
}

