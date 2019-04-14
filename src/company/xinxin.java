package company;

import java.util.*;

/**
 * created by yanjunjie
 */

public class xinxin {
    public static void main(String[] args) {


        int [][]a = {{0,0,1,1,1},{0,1,1,1,1},{1,1,1,1,1},{0,0,0,1,1},{0,0,0,0,1}};

        resolve(a);
    }

    private static void resolve(int[][] a) {
        int n  = a[0].length;
        int num = 0,max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (a[i][j] == 1) {
                    num = n - j;
                    if (max<num) {
                        max = num;
                    }
                    map.put(i+1,num);
                    break;
                }
            }
        }
        for (Integer in : map.keySet()) {
            if (map.get(in).equals(max)) {
                List list = new ArrayList();
                list.add(in);
                list.add(max);
                System.out.println(list);
            }
        }

    }


}

