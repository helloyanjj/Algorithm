package companyWrittenExamination;

import java.util.Scanner;

public class xiaomi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[10000];
        int i = 0;
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            if (str.equals("END")) {
                break;
            } else a[i++] = str;
        }
        resolve(a,i);
    }

    private static void resolve(String[] a,int n) {
        int []ten = new int[n];

        for (int i=0;i<n;i++) {
            String[] one = a[i].split("\\#");
            ten[i] = Integer.parseInt(one[1].toString(),Integer.parseInt(one[0]));

        }
        boolean aaa = false;
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n;j++) {
                if (i==j){
                    continue;
                }
                if (ten[i] == ten[j]) {
                    break;
                }
                if (j == n-1) {
                    aaa = true;
                    System.out.println(a[i]);
                }
            }

        }
        if (aaa == false) {
            System.out.println("None");
        }



    }
}
