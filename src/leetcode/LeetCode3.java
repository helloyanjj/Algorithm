package leetcode;

import java.util.*;

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

    public static Integer test2(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = 0;
        List<Character> list = new ArrayList<>();
        int max = 0;
        while (j < c.length) {
            if (!list.contains(c[j])) {
                list.add(c[j]);
                j++;
                max = Math.max(max, j - i);
            } else {
                Character character = c[i];
                list.remove(character);
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(test2(s));
    }
}
