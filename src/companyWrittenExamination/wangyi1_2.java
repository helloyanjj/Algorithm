package companyWrittenExamination;

import java.util.Scanner;

public class wangyi1_2 {

    public void bubbleSort(String[] arr) {
        if (arr == null || arr.length == 0)
            return;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (!compareString(arr[j], arr[j - 1])) {
                    swap(arr, j - 1, j);
                }

            }

        }

    }



    private boolean compareString(String param1, String param2) {

        char[] paramC1 = param1.toCharArray();

        char[] paramC2 = param2.toCharArray();

        int minLength = paramC1.length < paramC2.length ? paramC1.length : paramC2.length;
        for (int i = 0; i < minLength; i++) {

            if (paramC1[i] == paramC2[i]) {
            } else if (paramC1[i] > paramC2[i]) {
                return true;
            } else {
                return false;
            }

        }
        return paramC1.length > paramC2.length;

    }


    public void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

    }

}
