package company;

import java.util.Scanner;

public class fanshi1 {

    public static String resolve(String a, String b) {
        int l = a.length();
        int r = b.length();
        int[] num = new int[l+r];

        for(int i=0;i<l;i++) {

            int n1 = a.charAt(l-1-i)-'0';
            int tmp = 0;
            for(int j=0;j<r;j++) {
                int n2=b.charAt(r-1-j)-'0';
                tmp = tmp + num[i+j] + n1*n2;
                num[i+j] = tmp%10;
                tmp/=10;
            }
            num[i+r] = tmp;
        }

        int i = l+r-1;
        while(i>0 && num[i]==0){
            i--;
        }

        String result = "";
        while(i>=0) {
            result += num[i--];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a  = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(resolve(a,b));
    }
}



