package util;

public class ArrayQueue {
    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int n) {
        items = new String[n];
        this.n = n;
    }

    public boolean enqueue(String item) {
        if (n == tail) {
            return false;
        }

        items[tail] = item;
        tail++;
        return true;
    }

    public String dequeue () {
        if (head == tail) {
            return null;
        }

        String item = items[head];
        head++;
        return item;
    }

}
