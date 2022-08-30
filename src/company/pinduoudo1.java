package company;

import java.util.Scanner;

public class pinduoudo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        pinduoudo1.Main(ss);

    }


    public static void Main(String ss) {
        char[] a = ss.toCharArray();
        int len = ss.length();
        int K = len / 4;
        int n = K + 1;
        char[] a1 = new char[n];
        char[] a2 = new char[n - 2];
        char[] a3 = new char[n];
        char[] a4 = new char[n - 2];
        for (int i = 0; i < n; i++) {
            a1[i] = a[i];
        }
        for (int i = 0; i < n - 2; i++) {
            a2[i] = a[len - i - 1];
        }
        for (int i = 0; i < n - 2; i++) {
            a4[i] = a[n + i];
        }
        for (int i = 0; i < n; i++) {
            a3[i] = a[len - n + 1 - i];
        }
        System.out.println(a1);

        for (int i = 0; i < n - 2; i++) {
            System.out.print(a2[i]);

            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }

            System.out.println(a4[i]);
        }


        System.out.println(a3);


    }
}
