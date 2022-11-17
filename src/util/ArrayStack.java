package util;

import java.util.Arrays;

public class ArrayStack {
    private String[] stack;
    private int count;
    private int n;

    public ArrayStack(int n) {
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
        ArrayStack arrayStack = new ArrayStack(1);
        System.out.println(arrayStack.push("yan"));
        arrayStack.push("jun");
        arrayStack.push("jie");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());

    }
}
