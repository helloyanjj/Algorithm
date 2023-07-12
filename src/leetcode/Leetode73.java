package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetode73 {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> line = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    line.add(i);
                    row.add(j);
                }
            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (line.contains(i) || row.contains(j)) {
                    matrix[i][j] = 0;
                }
            }

        }




        System.out.println();


    }

    public static void main(String[] args) {
        setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
    }
}
