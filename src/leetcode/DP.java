package leetcode;

import java.util.Scanner;

public class DP {

    public Integer fn(Integer num) {
        if (num == 1 || num == 5 || num == 11) {
            return 1;
        }
        int cost1 = 0,cost2 = 0,cost3 = 0;

        if (num - 1 >= 0) {
            cost1 = fn(num - 1) + 1;
        }
        if (num - 5 >= 0) {
            cost2 = fn(num - 5) + 1;
        }
        if (num - 11 >= 0) {
            cost3 = fn(num - 11) + 1;
        }

        System.out.println(cost1);
        System.out.println(cost2);
        System.out.println(cost3);






        return 0;
    }

    public static void main(String[] args) {
        DP dp = new DP();
        Scanner scanner = new Scanner(System.in);
        Integer num;
        while (scanner.hasNext()) {
            num = scanner.nextInt();
            System.out.println(num);
            dp.fn(num);
        }
    }

}
