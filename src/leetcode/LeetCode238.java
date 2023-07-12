package leetcode;

public class LeetCode238 {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] L = new int[len];
        int[] R = new int[len];

        L[0] = 1;
        R[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }

        for (int i = len - 2; i >= 0; i--) {
            R[i] = nums[i + 1] * R[i + 1];
        }

        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = L[i] * R[i];
        }

        return result;

    }
}
