package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCode56 {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> results = new ArrayList<>();

        for (int[] interval : intervals) {
            if (results.size() == 0 || results.get(results.size() - 1)[1] < interval[0]) {
                results.add(interval);
            } else {
                results.get(results.size() - 1)[1] = Math.max(interval[1], results.get(results.size() - 1)[1]);
            }
        }

        return results.toArray(new int[results.size()][]);
    }

    public static void main(String[] args) {
        merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
    }
}
