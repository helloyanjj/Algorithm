package leetcode;

import java.util.HashMap;

public class LRUCache {

    class Node {
        int key;
        int value;
        Node pre;
        Node next;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


    private HashMap<Integer, Node> hashMap = new HashMap<>();
    private Integer size;
    private Integer capacity;
    private Node head, tail;


    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node node = hashMap.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = hashMap.get(key);
        if (node != null) {
            node.value = value;
            moveToHead(node);
        } else {
            Node newNode = new Node(key, value);
            hashMap.put(key, newNode);
            addToHead(newNode);
            size++;
            if (size > capacity) {
                Node res = removeTail();
                hashMap.remove(res.key);
                size--;
            }


        }

    }

    public Node removeTail() {
        Node node = tail.pre;
        removeNode(node);
        return node;
    }

    public void removeNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void addToHead(Node newNode) {
        newNode.pre = head;
        newNode.next = head.next;
        head.next = newNode;
        head.next.pre = newNode;
    }

    public void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

}
