package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by yanjunjie on 18-8-29
 */
public class LeetCode3 {

    public static void test(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < len && j < len) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        test(s);
    }
}
