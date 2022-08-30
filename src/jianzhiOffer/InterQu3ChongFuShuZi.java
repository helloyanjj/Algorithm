package jianzhiOffer;

import static java.util.Arrays.sort;

/**
 * created by yanjunjie
 */

public class InterQu3ChongFuShuZi {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 2, 5, 3};
        int len = a.length;
        System.out.println(duplicate(a, len));

        int[] b = {2, 3, 1, 4, 6, 5, 3};
        int len2 = b.length;
        System.out.println(duplicate2(b, len2));

    }

    private static boolean duplicate(int[] a, int len) {
        sort(a);
        for (int i = 0; i < len; i++) {
            while (a[i] != i) {
                int m = a[i];
                if (m != a[m]) {
                    int temp = a[m];
                    a[m] = m;
                    m = temp;
                } else return true;
            }
        }
        return false;
    }

    public static int duplicate2(int[] a, int len) {
        if (a == null || len <= 0) {
            return 0;
        }

        int start = 1;
        int end = len - 1;
        while (end >= start) {
            int mid = (end - start) / 2;
            int count = countRange(a, len, start, mid);
            if (end == start) {
                if (count > 1) {
                    return start;
                } else break;
            }

            if (count > (mid - start + 1)) {
                end = mid;
            } else start = mid + 1;
        }
        return 0;
    }

    private static int countRange(int[] a, int len, int start, int end) {
        if (a == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] >= start && a[i] <= end) {
                ++count;
            }
        }

        return count;
    }
}

