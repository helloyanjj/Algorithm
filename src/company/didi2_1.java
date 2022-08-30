package company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * created by yanjunjie
 */

public class didi2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(resolve(m, list));
    }

    private static int resolve(int m, ArrayList<Integer> list) {
        if (list.size() == 2) {
            return Math.min(list.get(0), list.get(1));
        }
        for (int i = 0; i < m; i++) {

            int min = 1000000000;
            int t = 0;
            for (int j = 0; j < list.size(); j++) {
                if (min > list.get(j)) {
                    min = list.get(j);
                    t = j;
                }
            }


            if (t == 0) {
                list.set(1, list.get(0) + list.get(1));
                list.remove(t);

            } else if (t == list.size() - 1) {

                list.set(list.size() - 2, list.get(list.size() - 1) + list.get(list.size() - 2));
                list.remove(t);

            } else {
                if (list.get(t - 1) <= list.get(t + 1)) {
                    list.set(t - 1, list.get(t - 1) + list.get(t));
                    list.remove(t);
                } else {
                    list.set(t + 1, list.get(t + 1) + list.get(t));
                    list.remove(t);
                }

            }


        }

        int min = 1000000000;
        for (int i : list) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}

