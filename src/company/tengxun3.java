package company;

import java.util.Scanner;

public class tengxun3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][]a = new int[n][3];
        String[] result = new String[n];
        for (int i=0;i<n;i++) {
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
            a[i][2] = scanner.nextInt();
            result[i] = resolve(a[i][0],a[i][1],a[i][2]);

        }
        for (int i=0;i<n;i++){
            System.out.println(result[i]);
        }

    }

    private static String resolve(int A, int B, int C) {
        int n = 1;
        while (n<=10000) {
            if ((n*A)%B == C) {
                return "YES";
            }
            n++;
        }



        return "NO";
    }
}
