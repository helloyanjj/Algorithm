package leetcode;


public class LeetCode283 {
    public static void moveZeroes(int[] nums) {

        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }

    }


    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

    }


    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,0,0,0,3,12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.println(i);
        }



    }
}
