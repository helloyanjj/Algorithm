package newstart;

public interface TestIn {
    void s1();

    default void s2() {
        System.out.println("123");
    }
}
