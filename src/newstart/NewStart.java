package newstart;

public class NewStart {
    public static void main(String[] args) {
        System.out.println("这是一个新的开始！");
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
