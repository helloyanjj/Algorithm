package leetcode;

import java.util.*;

public class LeetCode239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {

        int[] results = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        for (int right = 0; right < nums.length; right++) {
            while (!queue.isEmpty() && nums[right] > nums[queue.peekLast()]) {
                queue.removeLast();
            }

            queue.addLast(right);

            int left = right - k + 1;
            if (queue.peekFirst() < left) {
                queue.removeFirst();
            }

            if (right + 1 >= k) {
                results[left] = nums[queue.peekFirst()];
            }
        }
        return results;

    }

    public static void main(String[] args) {

//        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
//            public int compare(Integer a, Integer b) {
//                return a - b; //if a>b 则交换，so这是递增序列
//            }
//        });
//        queue.offer(13);
//        queue.offer(9);
//        int len = queue.size();
//        for (int i = 0; i < len; i++) {
//            System.out.println(queue.poll());
//        }


        int[] n = new int[]{7, 2, 4};
        maxSlidingWindow(n, 2);
    }


}
