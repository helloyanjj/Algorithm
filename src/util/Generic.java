package util;

public class Generic<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static <E> void sysT(E e) {
        System.out.println(e);
    }
}
