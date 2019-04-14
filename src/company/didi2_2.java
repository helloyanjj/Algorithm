package company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * created by yanjunjie
 */

public class didi2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer s = new StringBuffer();
        for (int i=0;i<4;i++){
            s.append(scanner.next());
        }
        Set<String> set = new HashSet<>();
        set.add("1234");set.add("1243");set.add("1324");set.add("1342");set.add("1432");
        set.add("3241");
        set.add("2134");set.add("2143");set.add("2314");set.add("2341");set.add("2431");
        set.add("3214");set.add("4321");set.add("3421");
        if (set.contains(s)){
            System.out.println("Yes");

        }else System.out.println("No");

    }
}

