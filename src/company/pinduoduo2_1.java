package company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pinduoduo2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] s = str.split(" ");

        int len = s.length;
        int count = 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<len-1;i++) {
           for (int j=i+1;j<len;j++) {
               if (s[i].toLowerCase() == s[j].toLowerCase()) {
                   count++;
                   if (!map.containsKey(s[i])) {
                       map.put(s[i],1);
                   }



               }
           }
        }
        System.out.println("apple");
    }
}
