package newstart;

/**
 * 一个小区里有n个居民，第一天有k个传染病感染者，感染者需要转运到医院隔离和治疗，该小区第一天的转运 感染者的能力是p个人，第二天转运能力是p-1人，第三天转运能力是p-2人，以此类推。如果感染者当天没有转运出小区，则每一个感染者会在当天午夜12点感染1个人。请问这个小区需要多少天感染者能清零。用Java/ JS／TS/c++语言实现求清零天数函数。 要求:
 * (1)命名一个合适的函数名称，实现完整的函数
 * (2)按照你平时的编程习惯，在你认为需要注释处写上相应的注释
 * (3)代码行数尽可能少，代码运行复杂度尽可能小
 * (4）写出你实现代码的算法复杂度o(n)
 */


public class ZeroClearing {
    /**
     * @param k 感染者人数
     * @param p 转运人数
     * @param n 总人数
     * @return 返回需要天数
     * @throws Exception
     */
    public static int calculate(int k, int p, int n) throws Exception {
        //转运衰减指标
        int temp = 0;
        while (k > 0) {
            k = k - p + temp;//当天转运完剩余感染人数

            if (k > 0) {  //当天剩余感染人数第二天传染后总人数
                k = 2 * k;
            }

            if (k > n) {
                return -1;
            }
            temp++;
        }

        return temp;
    }

    public static int minP(int k, int n) throws Exception {
        int p = n;
        //转运衰减指标
        int temp = 0;
        int initK = k;

        k = k - p + temp;
        temp++;
        p = p - temp;

        if (k == 1 && p == 1) {
            return p;
        } else if (k <= 0 && p > 1) {
            minP(initK, p - 1);
        }

        return temp;
    }

    public static int minP2(int k, int n) throws Exception {
        int p = 1;
        while (calculate(k, p, n) == -1) {
            p++;
        }
        return p;
    }

    public static void main(String[] args) throws Exception {

        try {
            System.out.println(calculate(30, 16, 500));
            System.out.println(minP2(30, 500));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
