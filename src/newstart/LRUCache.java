package newstart;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {


    private Integer size;

    private LinkedList<Node> list;

    private HashMap<String, Node> map;

    private Node head = new Node(null, null, size);

    private Node tail = head;

    LRUCache(Integer size) {
        this.size = size;
        this.list = new LinkedList<>();
    }

    synchronized void put(String key, String value) {



    }

    class Node {
        String key;
        String value;
        Node pre, next;
        Integer count;

        Node(String key, String value, Integer count) {
            this.key = key;
            this.value = value;
            this.count = count;
        }
    }


}
