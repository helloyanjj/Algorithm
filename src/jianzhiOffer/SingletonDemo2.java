package jianzhiOffer;

/**
 * 静态内部类法
 */

public class SingletonDemo2 {
    private static class Holder {
        private static SingletonDemo2 singletonDemo2 = new SingletonDemo2();
    }

    private SingletonDemo2() { }

    public static SingletonDemo2 getInstance () {
        return Holder.singletonDemo2;
    }

}
