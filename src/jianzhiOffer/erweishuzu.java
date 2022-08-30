package jianzhiOffer;

/**
 * 二维数组查找是否有整数m
 */
public class erweishuzu {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int m = 16;
        System.out.println(resolve(a, m));
    }

    private static boolean resolve(int[][] a, int m) {
        boolean found = false;
        int rows = 4, columns = 4;
        int row = 0;
        int column = columns - 1;
        while (row < rows && column > 0) {
            if (a[row][column] == m) {
                found = true;
                break;
            } else if (a[row][column] > m) {
                column--;
            } else if (a[row][column] < m) {
                row++;
            }
        }
        return found;
    }
}
