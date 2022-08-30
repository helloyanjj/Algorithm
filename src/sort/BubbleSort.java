package sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 7, 89, 5, 6, 32, 56, 23, 78};
        int len = a.length;
        bubbleSort(a, len);

    }

    private static void bubbleSort(int[] a, int len) {
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
