package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode560 {

    public static int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] prem = new int[len + 1];
        prem[0] = 0;
        for (int i = 0; i < len; i++) {
            prem[i + 1] = prem[i] + nums[i];
        }

        int count = 0;
        for (int left = 0; left < len; left++) {
            for (int right = left; right < len; right++) {
                if ((prem[right + 1] - prem[left]) == k) {
                    count++;
                }
            }
        }


        return count;

    }

    public static int subarraySum2(int[] nums, int k) {
        int count = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        int presum = 0;
        for (int x : nums) {
            presum += x;
            if (hashMap.containsKey(presum - k)) {
                count += hashMap.get(presum - k);
            }

            hashMap.put(presum, hashMap.getOrDefault(presum, 0) + 1);
        }


        return count;

    }

    public static void main(String[] args) {
        int[] n = new int[]{-1, -1, 1};
        System.out.println(subarraySum(n, 0));
    }
}
