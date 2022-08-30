package company;

import java.util.Scanner;

public class hanwuji2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        System.out.println(resolve(t));
    }

    private static long resolve(long t) {
        long sum = 3, num = 3;

        if (t <= 3) {
            return 3 - t + 1;
        }

        while (num < t) {
            sum = sum * 2;
            num = num + sum;
        }
        num = num - sum;

        return sum - (t - num) + 1;
    }
}
