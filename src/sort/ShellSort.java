package sort;

public class ShellSort {
    public static void main(String[] args) {
        int [] a = {1,4,2,7,89,5,6,32,56,23,78};
        int len = a.length;
        insertSort(a,len,4);
        for (int i:a) {
            System.out.print(i+" ");
        }
    }

    private static void insertSort(int[] a, int len,int d) {
        for (int inc=d;inc>0;inc/=2) {
            for (int i=inc;i<len;i++) {
                int j=i-inc;
                int temp = a[i];
                while (j>=0 && a[j]>temp) {
                    a[j+inc] = a[j];
                    j = j-inc;
                }
                if ((j+inc) != i) {
                    a[j+inc] = temp;
                }
            }

        }


    }

}
