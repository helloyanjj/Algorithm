package company;

import java.util.Scanner;

public class zhaohangxinyongka3 {
    public static void ss(int[] a, int H) {
        int time = 0;
        int max = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (max == a[i]) {
                time = time + a[i] / max;
            } else {
                time = time + a[i] / max + 1;
            }

        }

        while (time <= H) {
            time = 0;
            max--;
            for (int i = 0; i < n; i++) {
                if (max == a[i]) {
                    time = time + a[i] / max;
                } else {
                    time = time + a[i] / max + 1;
                }

            }


        }
        System.out.println(max + 1);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a;

        String s = scanner.nextLine();
        String[] str = s.split(" ");
        a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        int H = scanner.nextInt();
        ss(a, H);

    }
}
