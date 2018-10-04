package companyWrittenExamination;
import java.util.Scanner;

public class Main01 {
    private static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(solution(p, q, r));
    }

    public static int solution(int np, int nq, int nr){
        char p = 'P';
        char q = 'Q';
        char r = 'R';

        int sum = 1;
        for (int i = 1; i <= (np + nr + nq); i++) {
            sum = sum * i;
        }
//        System.out.println("sum is " + sum);
        char[] chars = new char[np + nq + nr];
        for (int i = 0; i < np; i++) {
            chars[i] = p;
        }
        for (int i = 0; i < nq; i++) {
            chars[i + np] = q;
        }
        for (int i = 0; i < nr; i++) {
            chars[i + np + nq] = r;
        }

        permutation(chars, chars.length, 0);
//        System.out.println("count is " + count);

        return count;
    }

    public static void permutation(char[] a, int length, int index) {
        if (index == length) {
            String str = "";
            for (int i = 0; i < length; i++) {

                str += a[i];
            }

            char[] temps = str.toCharArray();
            for (int i = 0; i < temps.length-1; i++) {
                if (temps[i] == temps[i + 1]){
                    count++;
                    break;
                }
            }
        } else {
            for (int i = index; i < length; i++) {
                if (isSwap(a, length, i)) {
                    swap(a, index, i);
                    permutation(a, length, index + 1);
                    swap(a, index, i);
                }
            }
        }
    }

    private static boolean isSwap(char[] a, int length, int index) {
        for (int i = index + 1; i < length; i++) {
            if (a[index] == a[i]) {
                return false;
            }
        }
        return true;
    }

    private static void swap(char[] a, int index, int i) {
        char temp = a[index];
        a[index] = a[i];
        a[i] = temp;
    }


}