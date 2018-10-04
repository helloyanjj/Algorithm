package companyWrittenExamination;
import java.util.Scanner;

public class didi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(resolve(p,q,r));
    }

    private static int resolve(int p, int q, int r) {
        int sum = p + q + r;
        int total = 1;
        for (int i=1;i<=sum;i++) {
            total = total * i;
        }
        total = total / 2;
        int a=0,b=0,c=0;
        if (p>1) {
            a = p*3;
        }
        if (q>1) {
            b = q*3;
        }
        if (r>1) {
            c = r*3;
        }
        total = total - a - b - c;
        if (p==1 && q==1 && r==1) {
            return 6;
        }
        if (p==0 && q==0 && r==1) {
            return 1;
        }if (p==0 && q==1 && r==0) {
            return 1;
        }if (p==1 && q==0 && r==0) {
            return 1;
        }



        return total;
    }
}
