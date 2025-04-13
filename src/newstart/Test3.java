package newstart;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

    public static int[] getTarget(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            } else {
                map.put(nums[i], i);
            }

        }

        for (int i : result) {
            System.out.println(i);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        getTarget(nums, 9);
    }
}
