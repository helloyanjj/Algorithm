package jianzhiOffer;


/**
 * 线程安全懒汉模式
 * 兼顾线程安全和效率
 */
public class Singleton1 {
    private static Singleton1 singleton1 = null;

    private Singleton1() {

    }

    public static Singleton1 getSingleton1() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}


