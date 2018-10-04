package companyWrittenExamination;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class toutiao1 {

    public static void resolve (String s) {
//        char[] a = s.toCharArray();

//        int max = 1;
//        Set set  = new HashSet();
//        for (int i=0;i<len;i++) {
//            if (!set.contains(a[i])) {
//                set.add(a[i]);
//                if (max<set.size()) {
//                    max = set.size();
//                }
//            } else {
//                set.clear();
//            }
//
//        }
//        System.out.println(max);

        int len = s.length();
        int i, j;
        String count = "";
        String ss;
        for(i=0;i<len;i++) {

            for(j=i+1;j<=len;j++){

                ss = s.substring(i, j);
                if(j == len){
                    if(count.length() < ss.length()){
                        count = ss;
                    }
                    break;
                } else {
                    if(ss.contains(s.substring(j, j+1))){
                        if(count.length() < ss.length()){
                            count = ss;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(count.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        resolve(s);
    }
}
