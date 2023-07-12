package newstart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuiGuan {

    // 本题为考试单行多行输入输出规范示例，无需提交，不计分。

    public static String solve(String str1, String str2) {
        int n1 = Integer.parseInt(str1, 2);
        int n2 = Integer.parseInt(str2, 2);
        int m = n1 + n2;
        return Integer.toBinaryString(m);
    }

    public static boolean isValidString(String s) {
        char[] chars = s.toCharArray();
        List<Character> stack = new ArrayList<>();
        stack.add(chars[0]);
        for (int i = 1; i < s.length(); i++) {
            if (chars[i] == ')' || chars[i] == '*' || chars[i] == ' ') {
                if (stack.size() > 0) {
                    int m = stack.size() - 1;
                    if (stack.get(m) == '(' || stack.get(m) == '*' || stack.get(m) == ' ') {
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                }
            } else {
                stack.add(chars[i]);
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {


        //返回 JVM 堆大小
        long initalMemory = Runtime.getRuntime().totalMemory() / 1024 /1024;
        //返回 JVM 堆的最大内存
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 /1024;

        System.out.println("-Xms : "+initalMemory + "M");
        System.out.println("-Xmx : "+maxMemory + "M");

        System.out.println("系统内存大小：" + initalMemory * 64 / 1024 + "G");
        System.out.println("系统内存大小：" + maxMemory * 4 / 1024 + "G");


        isValidString("()()");
        System.out.println(solve("1101", "1100"));
    }

}
