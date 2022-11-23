package jikeshijian;

public class LRULink {
    private Node headNode;
    // 容量大小，类比与redis设置的maxmemory大小
    private Integer capacity;
    // 实际元素长度
    private Integer length;

    LRULink() {
        this.headNode = new Node();
        this.capacity = 10;
        this.length = 0;
    }

    public void add(String data) {
        Node node = findPreNode(data);
        if (node != null) {
            delNode(node);
        } else {
            if (length >= capacity) {
                delEndNode();
            }
        }
        insertHeadNode(data);
    }

    public Node findPreNode(String data) {
        Node node = headNode;
        while (node.getNext() != null) {
            if (data.equals(node.getNext().getData())) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public void delNode(Node node) {
        Node temp = node.getNext();
        node.setNext(temp.getNext());
        temp = null;
        length--;
    }

    public void insertHeadNode(String data) {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(this.headNode.getNext());
        this.headNode.setNext(newNode);
        length++;
    }

    public void delEndNode() {
        Node pre = headNode;
        if (pre.getNext() == null) {
            return;
        }

        while (pre.getNext().getNext() != null) {
            pre = pre.getNext();
        }

        Node temp = pre.getNext();
        pre.setNext(null);
        temp = null;
        length--;
    }

    public void printAll() {
        Node node = headNode.getNext();
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public static void main(String[] args) {
        LRULink lruLink = new LRULink();
        for (int i = 0; i < 10; i++) {
            lruLink.add(i + "");
        }
        lruLink.printAll();
        lruLink.add(8 + "");
        lruLink.printAll();
        lruLink.add(11 + "");
        lruLink.printAll();
    }


}

class Node {
    private String data;
    private Node next;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


