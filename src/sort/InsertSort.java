package sort;

public class InsertSort {

    public static void main(String[] args) {
        int [] a = {1,4,2,7,89,5,6,32,56,23,78};
        int len = a.length;
        insertSort(a,len);
        for (int i:a) {
            System.out.print(i+" ");
        }
    }

    private static void insertSort(int[] a, int len) {
        for (int i=1;i<len;i++) {
            int get = a[i];
            int j = i-1;
            while (j>=0 && get<a[j]) {
                a[j+1] = a[j];
                j--;
            }
            if (j != i-1) {
                a[j+1] = get;
            }
        }
    }

}
