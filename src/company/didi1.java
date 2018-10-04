package company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class didi1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        resolve(str);
    }

    private static void resolve(String str) {
        Set a = new HashSet();
        Set b = new HashSet();
        a.add('q');
        a.add('w');
        a.add('e');
        a.add('r');
        a.add('t');
        a.add('a');
        a.add('s');
        a.add('d');
        a.add('f');
        a.add('g');
        a.add('z');
        a.add('x');
        a.add('c');
        a.add('v');

        b.add('m');
        b.add('n');
        b.add('b');
        b.add('l');
        b.add('k');
        b.add('j');
        b.add('h');
        b.add('p');
        b.add('o');
        b.add('i');
        b.add('u');
        b.add('y');

        String[] s = str.split(" ");
        int len = s.length;
        int len1 = s[0].length();
        char[] chars = s[1].toCharArray();
        int [] fen = new int[len];
        for (int i=1;i<len;i++) {
            char[] q = s[1].toCharArray();
            if (q.length == len1) {
                for (int j=0;j<len1;j++) {
                    if (chars[j] == q[j]) {
                        continue;
                    } else {
                        if ((a.contains(chars[j]) && a.contains(q[j]))
                                || (b.contains(chars[j]) && b.contains(q[j])) ) {
                            fen[i-1] = fen[i-1] + 1;
                        } else fen[i-1] = fen[i-1] + 2;
                    }
                }
            } else if (q.length > len1) {
                fen[i-1] = fen[i-1] + 3*(q.length - len1);
            } else if (q.length < len1) {
                fen[i-1] = fen[i-1] + 3*(len1 - q.length);
            }



        }

        for (int i=0;i<len;i++) {
            System.out.println(fen[i]);
        }




//        System.out.println("slep slap step");
    }
}
