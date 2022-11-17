package sort;

/**
 * created by yanjunjie
 */

public class maopao {
    public static void main(String[] args) {
        int[] a = {1432, 332, 632, 4, 2, 46, 32, 54, 65, 88};
        int n = a.length;
        BubbleSort(a, n);
        int[] b = {1432, 332, 632, 4, 2, 46, 32, 54, 65, 88};
        InsertSort(b, n);
        int[] c = {1432, 332, 632, 4, 2, 46, 32, 54, 65, 88};
        SelectSort(c, n);
        int[] d = {1432, 332, 632, 4, 2, 46, 32, 54, 65, 88};
        QuickSort(d, 0, n - 1);
        sout(d);
    }

    public static void QuickSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int left = low;
        int right = high;
        int key = a[left];
        while (left != right) {
            if (left < right && a[right] >= key) {
                --right;
            }
            a[left] = a[right];
            if (left < right && a[left] <= key) {
                ++left;
            }
            a[right] = a[left];

        }
        a[left] = key;
        QuickSort(a, low, left - 1);
        QuickSort(a, left + 1, high);
    }


    public static void BubbleSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
        sout(a);
    }

    public static void SelectSort(int[] a, int n) {

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        sout(a);
    }

    public static void InsertSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int get = a[i];
            int j = i - 1;
            while (j >= 0 && get < a[j]) {
//                int temp = a[j];
//                a[j] = get;
//                get = temp;
                a[j + 1] = a[j];
                j--;
            }
            if (j != i - 1) {
                a[j + 1] = get;
            }
        }
        sout(a);
    }

    public static void swap(int[] a, int m, int n) {
        int temp = a[m];
        a[m] = a[n];
        a[n] = temp;
    }

    public static void sout(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

