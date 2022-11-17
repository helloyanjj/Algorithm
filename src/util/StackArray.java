package util;

import java.util.Arrays;

public class StackArray {
    private String[] stack;
    private int count;
    private int n;

    public StackArray(int n) {
        this.stack = new String[n];
        this.n = n;
        this.count = 0;
    }

    public boolean push(String data) {
        if (count == n) {
            n = n * 2;
//            String[] newStack = new String[n];
            String[] newStack = Arrays.copyOf(stack, n);
//            for (int i = 0; i < count; i++) {
//                newStack[i] = stack[i];
//            }
            stack = newStack;
        }
        stack[count] = data;
        count++;
        return true;
    }

    public String pop() {
        if (count == 0) {
            return null;
        }
        String data = stack[count - 1];
        count--;
        return data;
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(1);
        System.out.println(stackArray.push("yan"));
        stackArray.push("jun");
        stackArray.push("jie");
        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());

    }
}
