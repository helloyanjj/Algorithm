package newstart;

public class Solution2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param a bool布尔型
     * @param b bool布尔型
     * @return bool布尔型一维数组
     */
    public boolean[] logicalOperation (boolean a, boolean b) {
        boolean c1 = a && b;
        boolean c2 = a || b;
        boolean c3 = !a;
        boolean c4 = !b;
        boolean[] c = new boolean[4];
        c[0] = c1;
        c[1] = c2;
        c[2] = c3;
        c[3] = c4;
        return c;

        // write code here
    }
}