package jianzhiOffer;

import java.util.Scanner;
import java.util.Stack;

public class dayinliaobiao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        listNode node1=new listNode();
        listNode node2=new listNode();
        listNode node3=new listNode();
        node1.data=1;
        node2.data=2;
        node3.data=3;
        node1.next=node2;
        node2.next=node3;
        printListReverse(node1);
    }

    public static void printListReverse(listNode headNode) {
        Stack<listNode> stack = new Stack<>();
        while (headNode != null) {
            stack.push(headNode);
            headNode = headNode.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().data);
        }
    }
}

class listNode {
    int data;
    listNode next;
}
