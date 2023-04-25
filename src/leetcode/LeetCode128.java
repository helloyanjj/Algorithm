package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode128 {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int n = nums[0];
        int count = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == n + 1) {
                count++;
                if (count > max) {
                    max = count;
                }
                n++;
            } else {
                count = 1;
                n = nums[i];
            }
        }
        return max;

    }


    public static int longestConsecutive2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int longStack = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int curr = n;
                int max = 1;
                while (set.contains(curr + 1)) {
                    curr += 1;
                    max++;
                }
                longStack = Math.max(longStack, max);
            }
        }

        return longStack;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
        int n = longestConsecutive2(nums);
        System.out.println(n);
    }
}
