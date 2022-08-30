package sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 7, 89, 5, 6, 32, 56, 23, 78};
        int len = a.length;
        selectSort(a, len);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static void selectSort(int[] a, int len) {

        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }

        }
    }

}
