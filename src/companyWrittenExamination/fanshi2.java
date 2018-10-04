package companyWrittenExamination;

import java.util.Scanner;

public class fanshi2{

    public static String resolve(String s) {
        String max = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = len;(j >= i) & (j-i>=max.length());j--) {
                String sub = s.substring(i, j);
                int mid ;

                if (sub.length() % 2 == 0) {
                    mid = sub.length() / 2;
                } else {
                    mid = sub.length() / 2 + 1;
                }

                if (sub.substring(0, sub.length() / 2).equals(
                        reverseStr(sub.substring(mid)))) {

                    if(max.length()<sub.length()){
                        max = sub;
                    }
                }
            }
        }

        return max;
    }

    public static String reverseStr(String str) {
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(resolve(s));
    }
}
