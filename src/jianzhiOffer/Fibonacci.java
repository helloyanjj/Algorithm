package jianzhiOffer;

/**
 * created by yanjunjie
 * 斐波那契数列（青蛙跳台阶）
 */

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci2(30));
    }

    public int fibonacci2(int n){
        int []result = {1,2};
        if (n<2){
            return result[n];
        }
        int fibOne = 1;
        int fibTwo = 0;
        int fib = 0;
        for (int i=2;i<=n;i++) {
            fib = fibOne + fibTwo;
            fibTwo = fibOne;
            fibOne = fib;
        }
        return fib;
    }

    public long fibonacci1(long n){
        if (n<=0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }

        return fibonacci1(n-1) + fibonacci1(n-2);
    }
}

