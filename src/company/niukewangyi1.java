package company;

import java.util.*;

/**
 * Created by yanjunjie on 18-9-7
 */
public class niukewangyi1 {

    public static void ss(int n, int m, int[] c) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < m; i++) {
            Integer s = map.get(c[i]);
            if (s == null) {
                s = 1;
                map.put(c[i], s);
            } else {
                s = s + 1;
                map.put(c[i], s);
            }
        }

        Set set = map.entrySet();
        Iterator it = set.iterator();
        int min = map.get(c[0]);
        while (it.hasNext()) {
            java.util.Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) it.next();
            if (min > entry.getValue()) {
                min = entry.getValue();
            }
        }
        if (map.size() == n) {
            System.out.println(min);
        } else
            System.out.println(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            c[i] = scanner.nextInt();
        }
        ss(n, m, c);
    }
}
