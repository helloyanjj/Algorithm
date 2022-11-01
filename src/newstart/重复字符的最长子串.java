package newstart;

import java.util.HashMap;
import java.util.Map;

public class 重复字符的最长子串 {

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abba");
        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

}
