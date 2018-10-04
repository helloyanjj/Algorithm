package companyWrittenExamination;
import java.util.*;

//x = b·s(x)^a + c
//a, b, c (1 ≤ a ≤ 5; 1 ≤ b ≤ 10000;  - 10000 ≤ c ≤ 10000).  x (0 < x < 10^9)
/*
 * 3 2 8
 * 10 2008 13726
 */
/*
 * 2 2 -1
 * 671 31 337 9
 */


public class ali {

    public static void xxx(int a,int b, int c) {
        int s = 0;
        int mm = 0;
        for (int x=1;x<1000000000;x++){
            s = sum(x);
            mm = s;
            for (int i=0;i<a-1;i++) {
                mm = mm*s;
            }
            if (x==(b*mm+c)) {
                System.out.print(x + " ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        ali.xxx(a,b,c);

    }

    public static int sum(int n) {
        int sum = 0;
        while (n >= 10) {
            sum += n % 10;
            n /= 10;
        }
        sum += n;
        return sum;
    }
}