package companyWrittenExamination;

import java.util.Scanner;

public class zhaohangxinyongka2 {

    public static void ss (int[] list) {
        int len = list.length;
        int max = 0,cha;
        for (int i=0;i<len;i++) {
            for (int j=i+1;j<len;j++) {
                if (list[i] < list[j]) {
                    cha = list[j] - list[i];
                    if (max < cha)max = cha;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] a = null;
        while (in.hasNext()) {
            String s=in.nextLine();

            String[] str=s.split(" ");
            a=new int[str.length];
            for(int i=0;i<str.length;i++){
                a[i]=Integer.parseInt(str[i]);
            }

        }
        ss(a);



    }
}

