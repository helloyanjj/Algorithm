package company;

import java.util.Scanner;

/**
 * created by yanjunjie
 */

public class niuke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int f = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        resolve(x,f,d,p);


    }

    public static void resolve(int x,int f,int d,int p) {
        int d1 = d/x;
        int yu = d - x * f;
        if (d1<=f) {
            System.out.println(d1);
        } else if (d1>f){
            System.out.println(f+yu/(x+p));
        }

    }
}

