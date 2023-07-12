package newstart;

public class Solution {
    // p-x+1为当天转运能力, f(x)为当天感染人数，x从1开始
    // f(1) 为k
    // f(x+1) = 2 * (f(x)-(p-x+1))
    public int calculate(int k, int p, int n) throws Exception {
        int infectus = k;
        int t = 1;
        while (t >= 1) {
            int deliver = p - t +1;
            // 边界条件1 转运能力小于0,不能清零
            if (deliver <=0 ) {
                throw new Exception("无法清零");
            }
            // 边界条件2 感染人数大于居民
            deliver = deliver > n ? n : deliver;
            infectus = 2 * (infectus - deliver);
            t += 1;
            // 转运能力大于感染人数的情况
            if (infectus <= 0) {
                break;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int k = 30;
        int p = 20; //5,16
        int n = 500;
        Solution s = new Solution();
        try {
            System.out.println(s.calculate(k,p,n));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

