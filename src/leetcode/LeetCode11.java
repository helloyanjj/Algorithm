package leetcode;

public class LeetCode11 {
    public static int maxArea(int[] height) {
        int resutl = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            resutl = Math.max(resutl, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }

        return resutl;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 0, 0, 0, 3, 12};
        maxArea(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
