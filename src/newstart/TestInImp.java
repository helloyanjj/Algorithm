package newstart;

import java.util.HashSet;

public class TestInImp implements TestIn {

    @Override
    public void s1() {

    }

    public static void main(String[] args) {
        TestIn testIn = new TestInImp();
        HashSet<Integer> s = new HashSet<>();
        testIn.s2();
    }
}
