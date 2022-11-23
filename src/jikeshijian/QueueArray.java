package jikeshijian;

public class QueueArray {
    /**
     * 数组实现队列
     */
    private String[] items;
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public QueueArray(int n) {
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
