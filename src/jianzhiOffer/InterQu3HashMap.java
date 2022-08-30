package jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

public class InterQu3HashMap {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 4, 3, 3, 5, 4, 3, 4, 5, 3, 5, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        Map<Integer, Integer> map = new HashMap();
        int len = a.length;
        for (int m : a) {
            if (!map.containsKey(m)) {
                map.put(m, 1);
            } else {
                int n = map.get(m);
                n++;
                map.put(m, n);
            }
        }
        System.out.println(map);
        int max0 = 0;
        for (int max : map.values()) {
            if (max0 < max) {
                max0 = max;
            }
        }
        System.out.println(map.values());
        System.out.println(map.keySet());
        for (int key : map.keySet()) {
            if (map.get(key).equals(max0)) {
                System.out.println(key);
            }
        }
    }

}
