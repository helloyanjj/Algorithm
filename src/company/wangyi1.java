package company;

import java.util.Scanner;

/**
 * Created by yanjunjie on 18-9-8
 */
public class wangyi1 {

    public static void resolve(String s0) {
        int len = s0.length();
        int pos = 0;
        char[] s = s0.toCharArray();
        for (int i = 0; i < len; i++) {
            if (s[i] == s[(i - 1 + len) % len]) {
                pos = i;
                break;
            }
        }
        int ans = 0;
        int tmp = 1;
        for (int i = 0; i < len - 1; i++) {
            int p = (pos + i) % len;
            if (s[p] != s[(p + 1) % len]) {
                tmp++;
            } else {
                tmp = 1;
            }

            if (tmp != 1) {
                ans = Math.max(ans, tmp);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s0 = scanner.nextLine();
        resolve(s0);
    }
}



