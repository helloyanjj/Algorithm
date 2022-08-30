package jianzhiOffer;

import java.util.Stack;

/**
 * created by yanjunjie
 */

/**
 * 两个栈实现队列，从队列头部删除节点以及队列尾部增加节点
 */

public class StackToQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        StackToQueue stackToQueue = new StackToQueue();
        stackToQueue.add(1);
        stackToQueue.add(2);
        stackToQueue.add(3);
        stackToQueue.add(4);
        stackToQueue.add(5);
        stackToQueue.add(6);
        stackToQueue.delete();
        stackToQueue.delete();
        stackToQueue.delete();
        stackToQueue.print();


    }

    public void print() {
        System.out.println(stack1);
        System.out.println(stack2);
    }


    public void add(int a) {
        stack1.push(a);
    }

    public void delete() {
        if (stack2.size() <= 0) {
            while (stack1.size() > 0) {
                int a = stack1.pop();
                stack2.push(a);
            }

        }

        if (stack2.size() == 0) {
            System.out.println("队列里面没有元素");
        }

        stack2.pop();
    }
}

