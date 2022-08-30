package jianzhiOffer;

/**
 * 枚举写法
 */

public enum SingletonDemo3 {
    INSTANCE;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SingletonDemo3 getInstance() {
        return INSTANCE;
    }
}
