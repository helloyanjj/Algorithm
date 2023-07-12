package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int count = row * col;
        List<Integer> result = new ArrayList<>();
        int s = 0;

        for (int i = s; i < col - s; i++) {
            result.add(matrix[s][i]);
        }

        for (int j = col - s; j < row - s; j++) {
            result.add(matrix[col - s][j]);
        }

        for (int j = col - s; j > s; j++) {
            result.add(matrix[j][col - s]);
        }

        for (int j = col - s; j > s; j++) {
            result.add(matrix[j][col - s]);
        }


        return result;


    }

}
