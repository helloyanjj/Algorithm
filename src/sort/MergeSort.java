package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 7, 89, 5, 6, 32, 56, 23, 78};
        int len = a.length;
        mergeSort(a, 0, len - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] a, int left, int right) {
        if (left > right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int[] tmp = new int[a.length];
        int r1 = left + 1;
        int tIndex = left;
        int cIndex = left;

        while (left <= mid && r1 <= right) {
            if (a[left] <= a[right]) {
                tmp[tIndex++] = a[left++];
            } else
                tmp[tIndex++] = a[r1++];

        }

        while (left <= mid) {
            tmp[tIndex++] = a[left++];
        }
        while (r1 <= right) {
            tmp[tIndex++] = a[r1++];
        }

        while (cIndex <= right) {
            a[cIndex] = tmp[cIndex];
            cIndex++;
        }
    }

}
