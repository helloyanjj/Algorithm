package company;

import java.util.Scanner;

/**
 * Created by yanjunjie on 18-9-12
 */
public class xunlei2 {

    public static void resolve(long N) {
        long count = 0;
        long M = (long) ((double) N / Math.sqrt(2));
        for (long i = 2; i < M; ++i) {
            for (long j = i + 1; j <= N; ++j) {
                long t = i * i + j * j;
                long k = (long) Math.sqrt(t);
                if (k > N) break;
                if (k * k == t) {
                    long x;
                    for (x = i; x > 1; x--) {
                        if (i % x == 0 && j % x == 0 && k % x == 0) {
                            break;
                        }
                    }
                    if (x == 1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        resolve(N);
    }
}
