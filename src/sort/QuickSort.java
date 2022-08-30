package sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 7, 89, 5, 6, 32, 56, 23, 78};
        int len = a.length;
        quickSort(a, 0, len - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int left = low;
        int right = high;
        int key = a[left];
        while (left != right) {
            while (left < right && a[right] >= key)
                --right;
            a[left] = a[right];
            while (left < right && a[left] <= key)
                ++left;
            a[right] = a[left];

        }
        a[left] = key;
        quickSort(a, low, left - 1);
        quickSort(a, left + 1, high);
    }

}
