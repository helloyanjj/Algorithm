package leetcode;


public class LeetCode42 {
    public static int trap(int[] height) {
        int max = 0;
        int m = 0;
        for (int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            if (max == height[i]) {
                m = i;
            }
        }

        int left = 0, left2 = left + 1;
        int right = height.length - 1, right2 = right - 1;
        int s1 = 0;
        while (left2 < m) {

            if (height[left] > height[left2]) {
                s1 = s1 + height[left] - height[left2];
                left2++;
            } else {
                left = left2;
                left2 = left + 1;
            }

        }

        int s2 = 0;
        while (right2 > m) {

            if (height[right] > height[right2]) {
                s2 = s2 + height[right] - height[right2];
                right2--;
            } else {
                right = right2;
                right2 = right - 1;
            }

        }

        return s1 + s2;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 0, 3, 2, 5};
        int[] nums2 = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] nums3 = new int[]{4, 2, 3};
        System.out.println(trap(nums));
    }

}
