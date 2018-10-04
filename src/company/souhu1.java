package company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by yanjunjie on 18-9-13
 */
public class souhu1 {

    public static int resolve(String A, String B) {
        char []a = A.toCharArray();
        char []b = B.toCharArray();
        int lenA = A.length();
        int lenB = B.length();
        int [] temp = new int[26];
        if (lenA != lenB) {
            return 0;
        }
        boolean flag = false;
        if (A.equals(B)) {
            for (int i=0;i<lenA;i++) {
                temp[a[i]-'a']++;
                if (temp[a[i]-'a']>=2) {
                    flag = true;
                }
            }
            for (int i=0;i<lenA;i++) {
                temp[b[i]-'a']--;
            }
            if (flag) {
                return 1;
            } else return 0;
        }





        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        char aa ='a',bb='b',cc='c',dd='d';
        for(int i=0;i<lenA;i++) {
            if(a[i] != b[i]){
                count++;
                if (count == 1) {
                    aa = a[i];
                    bb = b[i];
                } else if (count == 2) {
                    cc = a[i];
                    dd = b[i];
                } else return 0;

            }
        }
        if ((aa==dd) && (bb==cc)) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        System.out.println(resolve(A, B));
    }
}
