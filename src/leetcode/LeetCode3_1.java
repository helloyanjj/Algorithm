package leetcode;

import java.util.Scanner;

public class LeetCode3_1 {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        char[]a = s.toCharArray();
        char []b = new char[len];
        b[0] = a[0];
        int sum = 1,max=1;
        for (int i=0;i<len-1;i++) {
            if (a[i+1] != a[i]) {
                String sss=b.toString();
                String aaa=String.valueOf(a[i+1]);
                if (!sss.contains(aaa)) {
                    b[i+1] = a [i + 1];
                    sum ++;
                } else {
                    for(int j = 0;j<b.length-1;j++)
                    {
                        b[j]=0;
                    }
                    sum = 1;
                }
                if (sum > max) {
                    max = sum;
                }

            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        LeetCode3_1 leetCode3 = new LeetCode3_1();
        System.out.println(leetCode3.lengthOfLongestSubstring(s));
    }
}
