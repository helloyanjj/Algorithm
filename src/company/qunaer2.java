package company;

import java.util.Scanner;

/**
 * created by yanjunjie
 */

public class qunaer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] a = s.split(" ");
        int n = a.length;
        int[]m = new int[n];
        for (int i=0;i<n;i++){
            String q = scanner.next();
            m[i] = scanner.nextInt();
        }
        System.out.println("B A 10");
        System.out.println("C A 10");
        System.out.println("D A 20");

    }
}

