package company;

import java.util.Scanner;

/**
 * Created by yanjunjie on 18-9-12
 */
public class xunlei1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(resolve(A,B));
    }

    private static int resolve(int A, int B) {

        if ((6*B + A)>=0) {
            return 17*B;
        } else if ((6*A + B)<=0) {
            return 15*A + 2*B;
        } else if ((5*A + 2*B)<0  && (6*A + B)>0) {
            return 13*A + 4*B;
        } else if ((4*A + 3*B)<0  && (5*A + 2*B)>0) {
            return 11*A + 6*B;
        } else if ((3*A + 4*B)<0  && (4*A + 3*B)>0) {
            return 9*A + 8*B;
        } else if ((2*A + 5*B)<0  && (3*A + 4*B)>0) {
            return 7*A + 10*B;
        } else if ((A + 6*B)<0  && (2*A + 5*B)>0) {
            return 5*A + 12*B;
        }
        return 26;
    }
}
