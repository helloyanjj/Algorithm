package company;

import java.util.Scanner;

public class jingdong1 {
    int max = 1007;
    int v, e;
    int[][] map = new int[max][max];
    boolean[] vis;
    int n;

    public static String resolve(int n, int[][] a) {
        return "Yes";
    }

//    public  void dfs (int x) {
//        v++;
//        vis[x] = true;
//        for (int i=1;i<=n;i++) {
//            if (map[x][i] && x != i) {
//                e++;
//            }
//        }
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[][] q = new int[T][2];
        String[] str = new String[T];
        for (int i = 0; i < T; i++) {
            q[i][0] = scanner.nextInt();
            q[i][1] = scanner.nextInt();
            int[][] a = new int[q[i][1]][2];
            for (int j = 0; j < q[i][1]; j++) {
                a[j][0] = scanner.nextInt();
                a[j][1] = scanner.nextInt();
            }
            str[i] = resolve(q[i][1], a);
        }
        for (int i = 0; i < T; i++) {
            System.out.println(str[i]);
        }
    }
}
