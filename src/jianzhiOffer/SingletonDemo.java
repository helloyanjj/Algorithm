package jianzhiOffer;


/**
 * 线程安全懒汉模式
 * 兼顾线程安全和效率
 */
public class SingletonDemo {
    private static volatile SingletonDemo singletonDemo = null;

    private SingletonDemo (){

    }

    public static  SingletonDemo getInstance () {
            if (singletonDemo == null) {
                synchronized (SingletonDemo.class) {
                    if (singletonDemo == null) {
                        singletonDemo = new SingletonDemo();
                    }

                }
            }


            return singletonDemo;
    }
}


