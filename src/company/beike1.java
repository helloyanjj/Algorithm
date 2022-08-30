package company;

import java.util.Scanner;

/**
 * created by yanjunjie
 */

public class beike1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(string);
        System.out.println(reslove(string));
    }

    private static int reslove(String string) {


        StringBuffer s2 = new StringBuffer();
        int len = string.length();
        int n = 0;
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == '+' || string.charAt(i) == '-') {
                n++;
            }
        }
        int[] t = new int[n];
        int j = 0;
        for (int i = 0; i < len; i++) {
            StringBuffer s1 = new StringBuffer();
            if (string.charAt(i) != '+' || string.charAt(i) != '-') {
                s1.append(string.charAt(i));
            } else {
                s2.append(string.charAt(i));
                if (s1.charAt(0) == '0' && s1.charAt(1) == 'x') {
                    t[j++] = Integer.parseInt(s1.toString(), 16);

                } else if (s1.charAt(0) == '0') {
                    t[j++] = Integer.parseInt(s1.toString(), 8);

                } else {
                    t[j++] = Integer.parseInt(s1.toString());

                }
            }
        }
        int sum = 0;
        System.out.println(t[1]);
        for (int i = 0; i < n - 1; i++) {
            sum = t[i] + t[i + 1];
        }
        return sum;
    }
}

