package leetcode;

public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int m = k % len;
        int[] result = new int[len];
        int n = 0;
        for (int i = 0; i < len; i++) {
            if (m > 0) {
                result[i] = nums[len - m];
                m--;
            } else {
                result[i] = nums[n];
                n++;
            }
        }

        for (int i = 0; i < len; i++) {
            nums[i] = result[i];
        }

    }

}
