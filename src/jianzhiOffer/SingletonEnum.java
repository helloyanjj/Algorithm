package jianzhiOffer;

/**
 * created by yanjunjie
 */

class Resource {

}

public enum SingletonEnum {
    SINGLETON_ENUM;

    private Resource instance;

    SingletonEnum() {
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }
}

